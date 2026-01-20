package ControlFlow;

import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number (N): ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            long sumForLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumForLoop += i;
            }
            long sumFormula = (long) n * (n + 1) / 2;
            boolean isCorrect = (sumForLoop == sumFormula);
            System.out.println("Sum using for loop: " + sumForLoop);
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Results from both computations are correct: " + isCorrect);
        }
        input.close();
    }
}