package Arrays;

import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer for the multiplication table: ");
        int number = input.nextInt();

        int[] multiplicationResult = new int[4]; // For factors 6, 7, 8, 9

        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (i + 6);
        }

        System.out.println("Multiplication table for " + number + " from 6 to 9:");
        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }
        input.close();
    }
}
