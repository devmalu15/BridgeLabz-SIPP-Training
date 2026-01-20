package ControlFlow;

import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number (N): ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            long sumWhileLoop = 0;
            int counter = 1;
            while (counter <= n) {
                sumWhileLoop += counter;
                counter++;
            }
            long sumFormula = (long) n * (n + 1) / 2;
            boolean isCorrect = (sumWhileLoop == sumFormula);
            System.out.println("Sum using while loop: " + sumWhileLoop);
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Results from both computations are correct: " + isCorrect);
        }
        input.close();
    }
}