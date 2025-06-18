package ControlFlow;

import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double userValue;

        System.out.println("Enter numbers to sum (enter 0 to finish):");
        userValue = input.nextDouble();
        while (userValue != 0) {
            total += userValue;
            System.out.print("Enter next number (enter 0 to finish): ");
            userValue = input.nextDouble();
        }
        System.out.println("The total sum of the numbers is: " + total);
        input.close();
    }
}