package Arrays;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int originalNumber = number;
        if (originalNumber == 0) {
            System.out.println("Frequency of digit 0: 1");
            input.close();
            return;
        }

        int tempNumber = Math.abs(originalNumber);
        int digitCount = 0;
        int divisor = 1;
        while (tempNumber / divisor > 0) {
            digitCount++;
            divisor *= 10;
        }

        int[] digits = new int[digitCount];
        int index = 0;
        tempNumber = Math.abs(originalNumber);
        while (tempNumber != 0) {
            digits[index] = tempNumber % 10;
            tempNumber /= 10;
            index++;
        }

        int[] frequency = new int[10]; // For digits 0-9

        for (int i = 0; i < digitCount; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("\nFrequency of each digit in " + originalNumber + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
        input.close();
    }
}