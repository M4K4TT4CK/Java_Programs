public class LeapYear {

    public static void main(String[] args) {
        isLeapYear(-1200);
    }

    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if(year % 4 == 0){
                if(year % 100 == 0){
                    return (year % 400 == 0);
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
        return true;
    }
}