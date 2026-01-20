package Arrays;

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();

        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] weightStatuses = new String[numPersons];

        System.out.println("\nEnter data for each person:");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("  Enter weight in kilograms (kg): ");
            double weight = input.nextDouble();
            if (weight <= 0) {
                System.out.println("Invalid weight. Please enter a positive value.");
                i--;
                continue;
            }
            weights[i] = weight;

            System.out.print("  Enter height in centimeters (cm): ");
            double heightCm = input.nextDouble();
            if (heightCm <= 0) {
                System.out.println("Invalid height. Please enter a positive value.");
                i--;
                continue;
            }
            heights[i] = heightCm; // Storing in cm, convert to meters for BMI

            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            bmis[i] = bmi;

            if (bmi < 18.5) {
                weightStatuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                weightStatuses[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                weightStatuses[i] = "Overweight";
            } else {
                weightStatuses[i] = "Obesity";
            }
        }
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-12s %-12s %-10s %-20s\n", "Person", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("--------------------------------------------------------------------");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10d %-12.2f %-12.2f %-10.2f %-20s\n",
                    (i + 1), weights[i], heights[i], bmis[i], weightStatuses[i]);
        }
        input.close();
    }
}