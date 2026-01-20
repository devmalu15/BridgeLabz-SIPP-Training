package Arrays;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer for FizzBuzz: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            input.close();
            return;
        }

        String[] fizzBuzzResults = new String[number + 1];

        for (int i = 0; i <= number; i++) {
            if (i == 0) {
                fizzBuzzResults[i] = String.valueOf(i);
            } else if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzResults[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                fizzBuzzResults[i] = "Fizz";
            } else if (i % 5 == 0) {
                fizzBuzzResults[i] = "Buzz";
            } else {
                fizzBuzzResults[i] = String.valueOf(i);
            }
        }
        System.out.println("\nFizzBuzz Results:");
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + fizzBuzzResults[i]);
        }
        input.close();
    }
}