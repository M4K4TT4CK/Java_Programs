public class FirstAndLastDigitSum {

    public static void main(String[] args) {

        String intro = "The sum of the even numbers is: ";
        System.out.println(intro + getEvenDigitSum(123456789));
        System.out.println(intro + getEvenDigitSum(252));
        System.out.println(intro+ getEvenDigitSum(-22));

    }

    public static int getEvenDigitSum(int number) {

        if (number < 0){
            return -1;
        }

        int total = 0;
        while (number > 0) { // loops through all numbers in int until complete
            if (((number % 10) % 2) == 0) { // test to see if last number is even
                total += (number % 10); // takes out last digit, until digits have been taken
            }
            number = (number / 10); // takes out lst digit to test for next digit
        }
        return total; // return the total of all even numbers

    }
}
