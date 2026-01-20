package ControlFlow;

import java.util.Scanner;
public class Question34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        if (year < 1582) {
            System.out.println("The Leap Year program only works for year >= 1582 (Gregorian calendar).");
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("The year " + year + " is a Leap Year.");
                    } else {
                        System.out.println("The year " + year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println("The year " + year + " is a Leap Year.");
                }
            } else {
                System.out.println("The year " + year + " is not a Leap Year.");
            }
        }
        input.close();
    }
}