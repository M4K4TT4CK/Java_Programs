public class MainChallenge {
    // method calls
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }

    // Method to Display players High score and position
    public static void displayHighScore(String name, int position){

        System.out.println(name + " managed to get into the number " + position + " position.");
    }
    // Method to calculate and return Score position
    public static int calculateHighScorePosition(int playerScore){

        if(playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500 && playerScore <= 999) {
            return 2;
        } else if (playerScore >= 100 && playerScore <= 499){
            return 3;
        } else {
            return 4;
        }
    }
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted,bonus);
        System.out.println("This high score is: " + highScore);

        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("The nest high score is: " + calculateScore(gameOver, score, levelCompleted,bonus));


        int scores = calculateHighScorePosition(calculateScore(true, 800, 5, 100));
        System.out.println(scores);

    }
}
