public class IsPerfectNumber {

    public static void main(String[] args) {

        System.out.println(isPerfectNumber(-1)); // false
        System.out.println(isPerfectNumber(6)); // true
        System.out.println(isPerfectNumber(28)); //true
        System.out.println(isPerfectNumber(5)); // false
        System.out.println(isPerfectNumber(0)); // false

    }

    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }

        int sum = 0;
        for(int i = 1 ; i < number ; i++) {
            if(number % i == 0)  {
                sum = sum + i;
            }
        }
        if (sum == number) {
            return true;
        }
        else {
            return false;
        }
    }
}

