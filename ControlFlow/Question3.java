package ControlFlow;

import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();
        System.out.print("Enter the third number: ");
        double number3 = input.nextDouble();
        boolean isFirstSmallest = (number1 <= number2 && number1 <= number3);
        System.out.println("Is the first number the smallest? " + isFirstSmallest);
        input.close();
    }
}