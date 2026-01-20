package ControlFlow;

import java.util.Scanner;
public class Question16 {
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
        int counter = 1;
        while (counter <= number) {
            if (number % counter == 0) {
                System.out.print(counter + " ");
            }
            counter++;
        }
        System.out.println();
        input.close();
    }
}