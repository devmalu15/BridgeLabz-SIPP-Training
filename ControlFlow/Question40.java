package ControlFlow;

import java.util.Scanner;
public class Question40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in kilograms (kg): ");
        double weightKg = input.nextDouble();
        System.out.print("Enter height in centimeters (cm): ");
        double heightCm = input.nextDouble();
        double heightM = heightCm / 100.0;
        double bmi = weightKg / (heightM * heightM);
        String weightStatus;
        if (bmi < 18.5) {
            weightStatus = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            weightStatus = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            weightStatus = "Overweight";
        } else {
            weightStatus = "Obesity";
        }
        System.out.println("Your BMI is: " + String.format("%.2f", bmi));
        System.out.println("Your weight status is: " + weightStatus);
        input.close();
    }
}