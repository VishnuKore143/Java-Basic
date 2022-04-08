package Udemy;

import java.util.Scanner;

public class Reading_User_Input_Challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

//        while (true){
        while (counter < 10){
            int order = counter + 1;
            System.out.print("Enter number # "+order+" : ");
            boolean isAnInt = sc.hasNextInt();
            if (isAnInt){
                int number = sc.nextInt();
                counter++;
                sum += number;
//                if (counter==10){
//                    break;
//                }
            }else {
                System.out.println("Invalid Number");
            }
            sc.nextLine(); // handel end of line (enter key)
        }
        System.out.println("Sum = "+sum);
            sc.close();

    }
}
