public class EqualSumChecker {

    public static boolean hasEqualSum(int num1, int num2, int num3){
        return (boolean) (num1 + num2 == num3);
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(3, 4, 6));
    }
}