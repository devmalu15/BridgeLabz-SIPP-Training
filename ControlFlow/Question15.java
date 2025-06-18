package ControlFlow;

import java.util.Scanner;
public class Question15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        System.out.println("Enter numbers to sum (enter 0 or a negative number to finish):");

        while (true) {
            System.out.print("Enter a number: ");
            double userValue = input.nextDouble();
            if (userValue <= 0) {
                break;
            }
            total += userValue;
        }
        System.out.println("The total sum of the positive numbers is: " + total);
        input.close();
    }
}