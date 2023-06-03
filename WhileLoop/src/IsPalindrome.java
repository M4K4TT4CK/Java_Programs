public class IsPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number){

        if(number < 0){
            number *= -1;
        }

        int reverse = 0;
        int result = number;

        while(result > 0){
            int num = (result % 10);
            reverse =  (reverse * 10) + num;
            result /= 10;
        }
        if (number == reverse){
            return true;
        } else return false;
    }
}
