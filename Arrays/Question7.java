package Arrays;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number (N) to find odd/even numbers up to N: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a natural number (positive integer).");
            input.close();
            return;
        }

        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];
        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }
        System.out.print("\nEven Numbers: [");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i]);
            if (i < evenIndex - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.print("Odd Numbers: [");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i]);
            if (i < oddIndex - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        input.close();
    }
}