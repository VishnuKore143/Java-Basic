package Udemy;

import java.util.Scanner;

public class Reading_User_Input {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        System.out.print("Enter your Year of Birth : ");
        int yearOfBirth = sc.nextInt();
        int age = 2022- yearOfBirth;
        System.out.println("Your Name is "+ name+ " You are "+age+" Years Old.");

    }
}
