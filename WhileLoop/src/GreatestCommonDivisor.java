public class GreatestCommonDivisor {

    public static void main(String[] args) {

        String intro = "The greatest common divisor (-1 = false) is: ";
        System.out.println(intro + getGreatestCommonDivisor(25, 15)); // 5
        System.out.println(intro + getGreatestCommonDivisor(12, 30)); // 6
        System.out.println(intro + getGreatestCommonDivisor(9, 18)); // -1
        System.out.println(intro + getGreatestCommonDivisor(81, 153)); // 9
        System.out.println(intro + getGreatestCommonDivisor(20, -1)); // 9
        System.out.println(intro + getGreatestCommonDivisor(18, 9)); // 9
    }

    public static int getGreatestCommonDivisor(int num1, int num2) {

        if ((num1 <= -1 || num2 <= -1) || (num1 < 10 || num2 < 10)){
            return -1;
        }
        int result = 0;
        // Math.min(n, n) -> returns the smallest of the numbers
        // given as input parameters, or Infinity if there are no parameters.
        for(int i = Math.min(num1, num2); i > 0; i--) {
            if ((num1 % i == 0) && (num2 % i == 0)){
                result += i;
                return result;
            }
        }
        return result;
    }
}

