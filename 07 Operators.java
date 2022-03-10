public class Main {

    public static void main(String[] args) {
        int result = 1+2; // 1+2 = 3
        System.out.println("1+2 = "+result);
        int previousResult = result;
        System.out.println("Previous Result = "+previousResult); // 3

        result = result - 1; // 3-1=2
        System.out.println("3 - 1 = "+result);

        result = result * 10; // 2*10=20
        System.out.println("2 * 10 = "+result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = "+result);

        result = result % 3; //(4%3) = 1;
        System.out.println("4 % 3 = "+result);

        //if-then Statement
        boolean isAlien = false;
        if (isAlien==false)
            System.out.println("It is not an alien!");

        //Logical and Operator
        int topScore = 80;
        if (topScore!=100){
            System.out.println("You got the high score!");
        }
        if (topScore>100){
            System.out.println("You got the high score!");
        }
        if (topScore>=100){
//            System.out.println("You got the high score!");
        }
        if (topScore<100){
            System.out.println("You got the high score!");
        }
        if (topScore<=100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if (topScore>secondTopScore && topScore<100){
            System.out.println("Grater than second top score less than 100.");
        }

        //Logical OR || Operator
        if (topScore > 90 || secondTopScore <= 90){
            System.out.println("Either or both of the condition are true.");
        }
        //Assignment Operator
        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }

        //boolean Operator
        boolean isCar = false;
        if (!isCar){ //! not equal to isCar
            System.out.println("This is True..");
        }

        //Ternary Operator
        boolean wasCar = isCar  ? true : false;
        System.out.println("wasCar is true.");

        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient==20) ? true : false;
        System.out.println("Age of client is "+isEighteenOrOver);
        System.out.println();

        //Challenge Solution
        double myFirstDoubleValue = 20.00d;
        double mySecondDoubleValue = 80.00d;
        double myValueTotal = (myFirstDoubleValue+mySecondDoubleValue)*100.00d;//right to left calculation because of ()
        System.out.println("My Total is : "+ myValueTotal);

         myValueTotal = myValueTotal % 40.0d;
        System.out.println("My value remainder is "+myValueTotal);

        boolean myBooleanValue = true;
//        myBooleanValue = (myBooleanValue==0) ? true: false; //This is also valid 
        myBooleanValue = myValueTotal==0;
        System.out.println(myBooleanValue);

        if (!myBooleanValue){
            System.out.println("Got some remainder.");
        }





    }
}
