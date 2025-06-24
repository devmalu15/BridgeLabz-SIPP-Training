package Arrays;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();

        double[][] personData = new double[numPersons][3]; // Column 0: Weight (kg), 1: Height (m), 2: BMI
        String[] weightStatus = new String[numPersons];

        System.out.println("\nEnter data for each person:");
        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("  Enter weight in kg: ");
            double weight = input.nextDouble();
            if (weight <= 0) {
                System.out.println("Invalid weight. Please enter a positive value.");
                i--;
                continue;
            }
            personData[i][0] = weight;

            System.out.print("  Enter height in cm: ");
            double heightCm = input.nextDouble();
            if (heightCm <= 0) {
                System.out.println("Invalid height. Please enter a positive value.");
                i--;
                continue;
            }
            double heightM = heightCm / 100.0;
            personData[i][1] = heightM;

            double bmi = weight / (heightM * heightM);
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-10s %-20s\n", "Person", "Weight(kg)", "Height(m)", "BMI", "Status");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-20s\n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
        input.close();
    }
}
