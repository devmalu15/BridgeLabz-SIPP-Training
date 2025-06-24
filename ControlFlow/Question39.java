package ControlFlow;

import java.util.Scanner;
public class Question39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        if (number == 0) {
            System.out.println("The number of digits in 0 is 1.");
            input.close();
            return;
        }
        int count = 0;
        int tempNumber = Math.abs(number);
        while (tempNumber != 0) {
            tempNumber /= 10;
            count++;
        }
        System.out.println("The number of digits in " + number + " is " + count);
        input.close();
    }
}