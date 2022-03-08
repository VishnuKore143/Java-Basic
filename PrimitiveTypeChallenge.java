package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        long myLong = 50000L +10L * (myByte+myShort+myInt);
        System.out.println(myLong);
    }
}
