package ControlFlow;

import java.util.Scanner;
public class Question26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
            input.close();
            return;
        }
        System.out.print("Multiples of " + number + " below 100: ");
        boolean found = false;
        for (int i = 99; i >= 1; i--) {
            if (i % number == 0) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("None");
        }
        System.out.println();
        input.close();
    }
}