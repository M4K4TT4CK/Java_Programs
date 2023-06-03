public class SharedDigit {

    public static void main(String[] args) {

        String response = "Do these two numbers have at least two digits shared? ";

        for (boolean b : new boolean[]{hasSharedDigit(12, 23),
                hasSharedDigit(9, 99),
                hasSharedDigit(15, 55),
                hasSharedDigit(9, 19),
                hasSharedDigit(10, 100),
                hasSharedDigit(10, -100)}) {
            System.out.println(response + b);
        }

        System.out.println("----------");
        System.out.println(response + hasSharedDigit(10, 99));
    }

    public static boolean hasSharedDigit(int number, int otherNumber) {

        if ((number < 0) || otherNumber < 0) {
            return false;
        }
        if(number < 10 || number > 99|| otherNumber < 10 || otherNumber >  99){
            return false;
        }
        // variables that check for digits in the if statement
        int lastNumber1 = number % 10;
        int firstNumber1 = number / 10;
        int lastNumber2 = otherNumber % 10;
        int firstNumber2 = otherNumber / 10;
        // while number and otherNumber are above 9 and below 100
        return (lastNumber1 == lastNumber2) || (lastNumber1 == firstNumber2) || (firstNumber1 == firstNumber2) || (firstNumber1 == lastNumber2);
    }

}
