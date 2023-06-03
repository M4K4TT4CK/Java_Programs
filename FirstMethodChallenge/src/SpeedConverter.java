public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0)
            return -1;
        return Math.round(kilometersPerHour / 1.609);
    }
    public static void printConversion(double kilometersPerHour){
        long miles=0;
        if(kilometersPerHour < 0)
            System.out.println("Invalid Value");
        else{
            miles = toMilesPerHour(kilometersPerHour);
            System.out.println("The conversion is " +kilometersPerHour+" km/h = "+miles+" mi/h");
        }
    }

    public static void main(String[] args) {
        printConversion(23);
    }
}