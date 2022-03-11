public class Main {
    public static void main(String[] args) {
        //2
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        //2
        calculateScore(gameOver,score,levelCompleted,bonus);

        score = 10000;
        levelCompleted = 8;
        bonus =200;

        //3
        calculateScore(gameOver,score,levelCompleted,bonus);

//        if (gameOver){
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was "+finalScore);
//        }
    }
                                        //1
    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus =100;

        if (gameOver){
            int finalScore = score + (levelCompleted*bonus);
            finalScore+= 2000;
            System.out.println("Your final score was "+finalScore);
            return finalScore;
        }

            return -1;
    }

}
