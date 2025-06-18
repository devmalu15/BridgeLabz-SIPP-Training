package Arrays;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to print its multiplication table (1 to 10): ");
        int number = input.nextInt();

        int[] multiplicationResults = new int[10];

        for (int i = 0; i < 10; i++) {
            multiplicationResults[i] = number * (i + 1);
        }

        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationResults[i]);
        }
        input.close();
    }
}
