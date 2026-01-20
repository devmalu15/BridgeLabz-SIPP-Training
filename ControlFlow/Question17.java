package ControlFlow;

import java.util.Scanner;
public class Question17 {
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
        int tempPower = power;
        while (tempPower > 0) {
            result *= number;
            tempPower--;
        }
        System.out.println(number + " raised to the power of " + power + " is: " + result);
        input.close();
    }
}
