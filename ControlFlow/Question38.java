package ControlFlow;

import java.util.Scanner;
public class Question38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int originalNumber = number;
        int sumOfCubes = 0;
        int numberOfDigits = 0;
        int tempCount = originalNumber;
        while(tempCount != 0){
            tempCount /= 10;
            numberOfDigits++;
        }
        int tempNumber = originalNumber;
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sumOfCubes += Math.pow(digit, numberOfDigits);
            tempNumber /= 10;
        }
        if (originalNumber == sumOfCubes) {
            System.out.println(originalNumber + " is an Armstrong Number.");
        } else {
            System.out.println(originalNumber + " is Not an Armstrong Number.");
        }
        input.close();
    }
}
