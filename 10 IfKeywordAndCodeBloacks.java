public class Main {

    public static void main(String[] args) {

        //if-else statement

        int score = 1000;
        if (score<5000 && score>1000){
            System.out.println("Score is less than 5000 but grater than 1000");
        }
        else if (score<1000){
            System.out.println("Score is less than 1000");
        }
        else{
            System.out.println("Got here.");
        }

        boolean gameOver = true;
        int gameScore = 800;
        int levelCompleted = 5;
        int bonus = 100;
        if (gameOver){
            int finalScore = gameScore+(levelCompleted*bonus);
            System.out.println("Your final score is "+finalScore);
        }

        //Challenge
        // Print out a second score on the screen with the following
        // score set to 10000
        // level Completed set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well

        boolean newGameOver = true;
        int NewScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;
        if (newGameOver)
        {
            int FinalScore = NewScore +(newLevelCompleted*newBonus);
            System.out.println("Your final score is "+FinalScore);

        }


    }
}
