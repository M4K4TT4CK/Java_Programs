public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));// first test case
        System.out.println(getDurationString(-65, 45));// second test case
        System.out.println(getDurationString(65, 145));// third test case
        System.out.println(getDurationString(3945));// third test case
        System.out.println(getDurationString(65, 45));// fourth test case
    }

    public static String getDurationString(int seconds){
        // don't need excess code for method overloading
        int minutes = seconds / 60;
        if(seconds < 0){
            return "Invalid seconds (" + seconds + "), must be a positive integer!";
        }
        return getDurationString(seconds / 60, seconds % 60);// return w/getDurationString(minutes, seconds) method
    }

    public static String getDurationString(int minutes, int seconds){

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        if(minutes < 0){
            return "Invalid minutes (" + minutes + "), must be a positive integer!";
        }
        if(seconds <= 0 || seconds >= 59){
            return "Invalid seconds (" + seconds + "), must be between 0s and 59s!";
        }
        return hours + "h " + remainingMinutes + "m " + seconds + "s'";
    }
}
