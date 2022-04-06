package Udemy;

public class First_And_Last_Digit_Sum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(1206));
    }
        static int sumFirstAndLastDigit(int number) {
        if (number<0){
            return -1;
        }
        int temp = number;
        while(temp>=10){
            temp/=10;
            
        }
        int lastDigit = number%10;
        int sum = lastDigit+temp;
        return sum;
    }

}
