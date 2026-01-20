package ControlFlow;

import java.util.Scanner;
public class Question29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
            input.close();
            return;
        }
        System.out.print("Multiples of " + number + " below 100 (using reverse loop to match hint logic): ");
        boolean found = false;
        int counter = 99;
        while (counter >= 1) {
            if (counter % number == 0) {
                System.out.print(counter + " ");
                found = true;
            }
            counter--;
        }
        if (!found) {
            System.out.print("None");
        }
        System.out.println();
        input.close();
    }
}