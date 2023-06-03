public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(14400);

    }
    public static void printYearsAndDays(long minutes){
        //"XX min = YY y and ZZ d"
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long days = minutes / 1440;
            long years = days / 365;
            long remainingDays = days % 365;
            System.out.println(minutes + " min" + " = " + years + " y and " + remainingDays + " d" );
        }
    }
}
