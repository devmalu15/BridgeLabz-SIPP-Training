package Arrays;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("\nAnalysis of numbers:");
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            System.out.print("Number " + num + " is ");
            if (num > 0) {
                System.out.print("positive and ");
                if (num % 2 == 0) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else if (num < 0) {
                System.out.println("negative.");
            } else {
                System.out.println("zero.");
            }
        }
        System.out.println("\nComparison of first and last elements:");
        if (numbers[0] == numbers[4]) {
            System.out.println("First element (" + numbers[0] + ") is equal to the last element (" + numbers[4] + ").");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First element (" + numbers[0] + ") is greater than the last element (" + numbers[4] + ").");
        } else {
            System.out.println("First element (" + numbers[0] + ") is less than the last element (" + numbers[4] + ").");
        }
        input.close();
    }
}