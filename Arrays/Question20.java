package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Question20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to reverse: ");
        int number = input.nextInt();

        int originalNumber = number;
        if (originalNumber == 0) {
            System.out.println("Original Number: 0, Reversed Number: 0");
            input.close();
            return;
        }

        int tempNumber = Math.abs(originalNumber);
        int digitCount = 0;
        if (tempNumber == 0) {
            digitCount = 1;
        } else {
            int currentNum = tempNumber;
            while (currentNum != 0) {
                currentNum /= 10;
                digitCount++;
            }
        }

        int[] digits = new int[digitCount];
        int index = 0;
        tempNumber = Math.abs(originalNumber);
        while (tempNumber != 0) {
            digits[index] = tempNumber % 10;
            tempNumber /= 10;
            index++;
        }

        System.out.print("Original digits (reversed from extraction): " + Arrays.toString(digits));

        System.out.print("\nReversed Number (digits in reverse order): ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
        input.close();
    }
}
