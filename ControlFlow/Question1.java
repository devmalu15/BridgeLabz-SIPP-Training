package ControlFlow;

import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the countdown start value: ");
        int counter = input.nextInt();

        if (counter <= 0) {
            System.out.println("Please enter a positive value for countdown.");
        } else {
            System.out.println("Rocket Launch Countdown:");
            while (counter >= 1) {
                System.out.println(counter);
                counter--;
            }
            System.out.println("Lift-off!");
        }
        input.close();
    }
}