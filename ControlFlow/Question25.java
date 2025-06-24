package ControlFlow;

import java.util.Scanner;
public class Question25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer for the multiplication table: ");
        int number = input.nextInt();
        System.out.println("Multiplication table for " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        input.close();
    }
}