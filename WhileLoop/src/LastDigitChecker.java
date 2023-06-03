public class LastDigitChecker {

    public static void main(String[] args) {

        String intro = "This number is valid: ";
        String intro2 = "These numbers have at least  two matching last digits: ";

        System.out.println(intro2 + hasSameLastDigit(41, 22, 71));// true
        System.out.println(intro2 + hasSameLastDigit(23, 32, 42));// true
        System.out.println(intro2 + hasSameLastDigit(9, 99, 999));// false
        System.out.println("----------");
        System.out.println(intro + isValid(10));// true
        System.out.println(intro + isValid(468));// true
        System.out.println(intro + isValid(1051));// false


    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){

        if ((num1 < 0) || num2 < 0 || num3 <0) {
            return false;
        }
        if(num1 < 10 || num1 > 999|| num2 < 10 || num2 >  999 || num3 < 10 || num3 >  999){
            return false;
        }
        int lastNum1 = num1 % 10;
        int lastNum2 = num2 % 10;
        int lastNum3 = num3 % 10;

        return lastNum1 == lastNum2 || lastNum3 == lastNum1 || lastNum3 == lastNum2;
    }

    public static boolean isValid(int number){

        if(number > 9 && number < 1001){
            return true;
        }
        return false;
    }
}
