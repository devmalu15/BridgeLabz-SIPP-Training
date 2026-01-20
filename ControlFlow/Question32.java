package ControlFlow;

import java.util.Scanner;
public class Question32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int originalNumber = number;
        int sumOfDigits = 0;
        int tempNumber = number;

        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sumOfDigits += digit;
            tempNumber /= 10;
        }
        if (sumOfDigits == 0) {
            System.out.println(originalNumber + " is Not a Harshad Number.");
        } else if (originalNumber % sumOfDigits == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is Not a Harshad Number.");
        }
        input.close();
    }
}