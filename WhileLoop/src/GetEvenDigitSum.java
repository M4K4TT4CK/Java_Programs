public class GetEvenDigitSum {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(1324));

    }

    public static int getEvenDigitSum(int number) {

        int result = 0;
        if (number > 0 && number % 2 == 0) {
            while (number > 9) {
                result += (number % 10);
                number = (number / 10);
                if (number % 2 != 0) {
                    continue;
                }
                result += number;
                return result;
            }
        }
        return -1;
    }
}
