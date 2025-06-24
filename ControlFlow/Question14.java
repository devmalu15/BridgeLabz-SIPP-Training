package ControlFlow;

import java.util.Scanner;
public class Question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the countdown start value: ");
        int counter = input.nextInt();

        if (counter <= 0) {
            System.out.println("Please enter a positive value for countdown.");
        } else {
            System.out.println("Rocket Launch Countdown:");
            for (int i = counter; i >= 1; i--) {
                System.out.println(i);
            }
            System.out.println("Lift-off!");
        }
        input.close();
    }
}