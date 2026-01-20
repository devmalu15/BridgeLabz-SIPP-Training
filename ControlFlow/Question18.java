package ControlFlow;

import java.util.Scanner;
public class Question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's salary (INR): ");
        double salary = input.nextDouble();
        System.out.print("Enter employee's years of service: ");
        int yearsOfService = input.nextInt();
        double bonus = 0;
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }
        System.out.println("The bonus amount for the employee is INR " + String.format("%.2f", bonus));
        input.close();
    }
}