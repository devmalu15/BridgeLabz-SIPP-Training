package ControlFlow;

import java.util.Scanner;
public class Question35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double first = input.nextDouble();
        System.out.print("Enter second number: ");
        double second = input.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        String op = input.next();
        double result;
        switch (op) {
            case "+":
                result = first + second;
                System.out.println(first + " + " + second + " = " + result);
                break;
            case "-":
                result = first - second;
                System.out.println(first + " - " + second + " = " + result);
                break;
            case "*":
                result = first * second;
                System.out.println(first + " * " + second + " = " + result);
                break;
            case "/":
                if (second == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = first / second;
                    System.out.println(first + " / " + second + " = " + result);
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
        input.close();
    }
}