public class DayOfTheWeek {

    public static void main(String[] args) {

        dayOfTheWeek(0);
        dayOfTheWeek(1);
        dayOfTheWeek(2);
        dayOfTheWeek(3);
        dayOfTheWeek(4);
        dayOfTheWeek(5);
        dayOfTheWeek(6);
        dayOfTheWeek(7);
        System.out.println("----------");
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
    }

    public static void dayOfTheWeek(int day) {
        // return switch statement as an expression
        String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }

    public static void printDayOfTheWeek(int day) {
        // not returning anything-too much work
        String dayOfWeek = "Invalid day";
        if (day == 0) {
            dayOfWeek = "Sunday";
        } else if (day == 1) {
            dayOfWeek = "Monday";
        } else if (day == 2) {
            dayOfWeek = "Tuesday";
        } else if (day == 3) {
            dayOfWeek = "Wednesday";
        } else if (day == 4) {
            dayOfWeek = "Thursday";
        } else if (day == 5) {
            dayOfWeek = "Friday";
        } else if (day == 6) {
            dayOfWeek = "Saturday";
        } else {
            dayOfWeek = day + " is not a valid input";
        }
        System.out.println(day + " stand for " + dayOfWeek);
    }
}

