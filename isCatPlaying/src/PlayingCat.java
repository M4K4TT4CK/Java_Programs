public class PlayingCat {

    public static void main(String[] args) {

        System.out.println(isCatPlaying(true, 48));
    }
    
    public static boolean isCatPlaying(boolean summer, int temp){

        if(summer){
            if(temp >= 25 && temp <=45){
                return true;
            }
        }if(!summer){
            if(temp >=25 && temp <= 35){
                return true;
            }
        }
        return false;
    }
}
