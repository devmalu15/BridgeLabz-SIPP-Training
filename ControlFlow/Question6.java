package ControlFlow;

import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer to find its factorial: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else if (number == 0) {
            System.out.println("The factorial of 0 is 1.");
        } else {
            long factorial = 1;
            int tempNumber = number;
            while (tempNumber > 0) {
                factorial *= tempNumber;
                tempNumber--;
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        }
        input.close();
    }
}