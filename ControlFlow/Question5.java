package ControlFlow;

import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();
        System.out.print("Enter the third number: ");
        double number3 = input.nextDouble();

        boolean isFirstLargest = (number1 >= number2 && number1 >= number3);
        boolean isSecondLargest = (number2 >= number1 && number2 >= number3);
        boolean isThirdLargest = (number3 >= number1 && number3 >= number2);

        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
        input.close();
    }
}
