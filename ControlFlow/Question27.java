package ControlFlow;

import java.util.Scanner;
public class Question27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a natural number.");
            input.close();
            return;
        }
        System.out.println("Odd and Even numbers from 1 to " + number + ":");
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }
        }
        input.close();
    }
}