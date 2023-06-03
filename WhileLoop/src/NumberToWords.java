public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(-1);
        numberToWords(1);
        numberToWords(2);
        numberToWords(888);
    }
    public static void numberToWords(int number) {

        if (number < 0) { // return "Invalid Value" if less than zero
             System.out.println("Invalid Value");
        }
        if (number == 0) { // return initial zero if its a single digit
            System.out.println("Zero");
        }
        int reversedNumber = reverse(number); // create variable that is the reverse of the number
        int leadingZeroes = getDigitCount(number) - getDigitCount(reversedNumber); // pull leading zeros
        // from int after it has been reversed using getDigitCount

        while (reversedNumber > 0) { // will work while reversedNumber is greater than zero
            int extractedLastDigit = reversedNumber % 10; // pulling that last digit/all digits through the while loop

            switch (extractedLastDigit) { // switch statement to return String when presented with int
                case 0: System.out.println("Zero"); break;
                case 1: System.out.println("One"); break;
                case 2: System.out.println("Two"); break;
                case 3: System.out.println("Three"); break;
                case 4: System.out.println("Four"); break;
                case 5: System.out.println("Five"); break;
                case 6: System.out.println("Six"); break;
                case 7: System.out.println("Seven"); break;
                case 8: System.out.println("Eight"); break;
                case 9: System.out.println("Nine"); break;
            }
            reversedNumber /= 10; // return 1st number in int
        }
        if (leadingZeroes > 0) { // if those leading zeros are greater than zero
            // for loop to check is there are zeros at the beginning of the string and assigned the "zero" string
            for (int i = 0; i < leadingZeroes; i++) {
                System.out.println("Zero");
            }
        }
    }
    //SECOND METHOD - reverse
    public static int reverse(int numberToReverse) {
//  Method is created to reverse numbers after the numberToWords pulls digits
        int reversedNumber = 0; // create empty list to store numbers
        while(numberToReverse != 0) {
            //use modulus operator to strip off the last digit
            int lastDigit = numberToReverse % 10;
            //create the reversed number
            reversedNumber = (reversedNumber * 10) + lastDigit;
            numberToReverse = numberToReverse / 10;
        }
        return reversedNumber;
    }
    //THIRD METHOD - getDigitCount
    public static int getDigitCount(int number) {
        // need this to calculate the total amount of digits in an int argument
        if(number < 0) {
            return -1;
        }
        if(number == 0) {
            return 1;
        }
        int count = 0;
        for(;number != 0; number/=10, count++);
        return count;
    }
}
