package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Question16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;
        int tempNumber = Math.abs(number);

        if (tempNumber == 0) {
            digits[index] = 0;
            index++;
        } else {
            while (tempNumber != 0) {
                if (index == maxDigits) {
                    maxDigits *= 2;
                    int[] tempDigitsArray = new int[maxDigits];
                    for (int j = 0; j < digits.length; j++) {
                        tempDigitsArray[j] = digits[j];
                    }
                    digits = tempDigitsArray;
                }
                digits[index] = tempNumber % 10;
                tempNumber /= 10;
                index++;
            }
        }

        if (index == 0) {
            System.out.println("No digits to process.");
            input.close();
            return;
        }

        int largest = -1;
        int secondLargest = -1;

        if (index > 0) {
            largest = digits[0];
            secondLargest = digits[0];
        }

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("\nDigits extracted: " + Arrays.toString(Arrays.copyOf(digits, index)));
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
        input.close();
    }
}