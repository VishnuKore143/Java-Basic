package Udemy;

public class lastDigitChecker {
    public static void main(String[] args) {
        boolean ans = hasSameLastDigit(44, 88, 54);
        System.out.println(ans);
        boolean ans2 = isValid(789);
        System.out.println(ans2);
    }


    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {

        if ((firstNumber >= 10 && firstNumber <= 1000) && (secondNumber >= 10 && secondNumber <= 1000) && (thirdNumber >= 10 && thirdNumber <= 1000)) {
            return ((firstNumber % 10 == secondNumber % 10) || (firstNumber % 10 == thirdNumber % 10) || (secondNumber % 10 == thirdNumber % 10));
        }
        System.out.println("Invalid input");
        return false;
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        } else {
            return false;
        }
    }
}

