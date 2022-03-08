package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 1000;

        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = "+ myMinValue);
        System.out.println("Integer Maximum Value = "+ myMaxValue);
        System.out.println("Busted Minimum Value (OverFlow) = "+ (myMinValue + 1));
        System.out.println("Busted Maximum Value (UnderFlow) = " + (myMaxValue - 1));
        int myMaxIntTest = 2_147_483_647;
        System.out.println();
        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value is = "+myByteMinValue);
        System.out.println("Byte Maximum Value is = "+myByteMaxValue);
        System.out.println("Busted Min Value (OverFlow +1) = "+(myByteMinValue + 1));
        System.out.println("Busted Max Value (underFlow -1) = "+(myByteMaxValue - 1));
        System.out.println();
        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value is = "+myShortMinValue);
        System.out.println("Short Maximum Value is = "+myShortMaxValue);
        System.out.println("Busted Min short Value (OverFlow +1) = "+(myShortMinValue + 1));
        System.out.println("Busted Max short Value (underFlow -1) = "+(myShortMaxValue - 1));
        System.out.println();
        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value is = "+myLongMinValue);
        System.out.println("Long Maximum Value is = "+myLongMaxValue);
        System.out.println("Busted Min Long Value (OverFlow +1) = "+(myLongMinValue + 1));
        System.out.println("Busted Max Long Value (underFlow -1) = "+(myLongMaxValue - 1));



    }
}
