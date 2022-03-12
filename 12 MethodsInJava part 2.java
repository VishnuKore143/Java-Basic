package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);



        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("vishnu",highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob",highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy",highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert",highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("luise",highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("carlo",highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("frank",highScorePosition);
    }
    //chalenge
// Create a method called displayHighScorePosition
// it should a players name as a parameter, and a 2nd parameter as a position in the high score table
// You should display the players name along with a message Like" managed to get into position and the
// call both methods and display the results of the following
// a score of 1500, 900, 400, and 50
// 3 if the score is > 100and < 500
// 4 in all other cases
// 2 if the score is 500 nd < 100theta
// it should be sent one argument only, the player score
// 1 if the score is > 1000
// Create a 2nd method called calculateHighScorePosition
// the return data should be
// position they got and a further message on the high score table" .
// it should return an int

    public static void displayHighScorePosition(String playerName,int highScorePosition) {
        System.out.println(playerName+" manage to get into a position " + highScorePosition + " on the high score table ");
    }
    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        }
        else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        }
        else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        }
        else {
            return 4;
        }
    }
    //chalenge end here

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

}