public class Main {

    public static void main(String[] args) {
//
//        int value = 1;
//        if(value == 1){
//            System.out.println("Value was 1");
//        } else if(value ==2){
//            System.out.println("Value was 2");
//        } else{
//            System.out.println("Value was not 1 or 2");
//        }
//        int value = 10;
//
//        switch (value) {
//            case 1 -> System.out.println("Value was 1");
//            case 2 -> System.out.println("Value was 2");
//            case 3 -> System.out.println("Value was 3");
//            case 4 -> System.out.println("Value was 4");
//            case 5 -> System.out.println("Value was 5");
//            case 6, 7, 8, 9 -> {
//                System.out.println("Value was a 6, 7, 8, or a 9");
//                System.out.println("Actually the value was " + value);
//            }
//            default -> System.out.println("Value was not 1 through 9");
//        }
        getQuarter("January");
        System.out.println(getQuarter2("Not month"));

        String month = "XYZ";
        System.out.println(month + " is in the " + getQuarter2(month) + " quarter.");
    }
    public static String getQuarter(String month){

        switch (month) {
            case "January","February", "March" -> {
                System.out.println("1st Quarter");
            }
            case "April", "May", "June" -> {
                System.out.println("2nd Quarter");
            }
            case "July", "August", "September" -> {
                System.out.println("3rd Quarter");
            }
            case "October", "November", "December" -> {
                System.out.println("4th Quarter");
            }
        }
        return month;
    }
    public static String getQuarter2(String month){

        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> {
                String badResponse = month + " is not a valid value";
                yield badResponse;
            }
        };
    }
}
