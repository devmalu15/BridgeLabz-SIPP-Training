package ControlFlow;

import java.util.Scanner;
public class Question20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int number = input.nextInt();
        System.out.print("Enter the power (non-negative integer): ");
        int power = input.nextInt();
        if (power < 0) {
            System.out.println("Power cannot be negative for this calculation.");
            input.close();
            return;
        }
        long result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println(number + " raised to the power of " + power + " is: " + result);
        input.close();
    }
}