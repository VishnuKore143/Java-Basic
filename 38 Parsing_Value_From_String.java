package Udemy;

public class Parsing_Value_From_String {
    public static void main(String[] args) {
        String numberAsString = "2022";
        System.out.println("String number  = "+numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("NUmber  = " +number);

        numberAsString += 1;
        number += 1;
        System.out.println("String number added 1 = "+ numberAsString);
        System.out.println("Number added 1 "+ number);

        //String with decimal values

        String  numAsString = "2022.215";
        double stringAsDouble = Double.parseDouble(numAsString);
        numAsString+=1;
        System.out.println("string double value =  "+numAsString);

        double num = Double.parseDouble(numAsString);
        num +=1;
        System.out.println(num);

    }
}
