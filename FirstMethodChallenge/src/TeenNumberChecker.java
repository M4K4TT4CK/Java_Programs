public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3) {
        if (num1 > 12 && num1 < 20) {
            return true;
        } else if (num2 > 12 && num2 < 20) {
            return true;
        } else if (num3 > 12 && num3 < 20) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int num){
        if(num > 12 && num <= 19) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(hasTeen(23, 23, 45));
        System.out.println(isTeen(-19));
    }
}

