package ControlFlow;

import java.util.Scanner;
public class Question23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer to find its factors: ");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            input.close();
            return;
        }
        System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        input.close();
    }
}