package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        //8 Primitive Data Type in Java
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String myString = "This is a String";
        System.out.println("MyString is equal to "+myString);

        myString = myString+" and this is more.";
        System.out.println("mystring is equal to "+myString);

        myString = myString+"\u00A9 2019";
        System.out.println("myString is equal to "+myString);

        String numberString = "250.55";
        numberString = numberString +"49.95";
        System.out.println("49.95 has been appended to the end of 250.55 and changed value is =  "+numberString);

        String myLastString = "10";
        int myInt  = 50;
        myLastString = myLastString+myInt;
        System.out.println("Last String is equal to = "+myLastString); //1050

        double myDoubleNumber = 120.47d;
        myLastString=myLastString+myDoubleNumber;
        System.out.println(myLastString);//1050120.47



    }
}
