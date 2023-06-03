public class MethodChallenge {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScore("Tim", highScorePosition);
        int highScorePosition2 = calculateHighScorePosition(1000);
        displayHighScore("Emily", highScorePosition2);
        int highScorePosition3 = calculateHighScorePosition(500);
        displayHighScore("Barry", highScorePosition3);
        int highScorePosition4 = calculateHighScorePosition(100);
        displayHighScore("Reba", highScorePosition4);
        int highScorePosition5 = calculateHighScorePosition(25);
        displayHighScore("Dave", highScorePosition5);
    }
    public static void displayHighScore(String name, int highScorePosition){
        System.out.println(name + " managed to get into position number " + highScorePosition + " on the high score list!");
    }
    public static int calculateHighScorePosition(int playerScore){
        int position = 4;

        if(playerScore >= 1000){
            position = 1;
        } else if(playerScore >= 500){
            position =  2;
        } else if(playerScore >= 100){
            position = 3;
        }
        return position;
    }
}
