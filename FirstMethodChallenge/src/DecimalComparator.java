public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double param1, double param2) {
        return (int) (param1 * 1000) == (int) (param2 * 1000);
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }
}
