package Arrays;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numEmployees = 10;

        double[] salaries = new double[numEmployees];
        int[] yearsOfService = new int[numEmployees];
        double[] bonusAmounts = new double[numEmployees];
        double[] newSalaries = new double[numEmployees];

        double totalBonusPayout = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        System.out.println("Enter salary and years of service for " + numEmployees + " employees:");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            System.out.print("  Enter salary: ");
            double salary = input.nextDouble();
            if (salary < 0) {
                System.out.println("Invalid salary. Please enter a positive value.");
                i--;
                continue;
            }
            salaries[i] = salary;

            System.out.print("  Enter years of service: ");
            int years = input.nextInt();
            if (years < 0) {
                System.out.println("Invalid years of service. Please enter a non-negative value.");
                i--;
                continue;
            }
            yearsOfService[i] = years;
        }

        for (int i = 0; i < numEmployees; i++) {
            double currentBonus = 0.0;
            if (yearsOfService[i] > 5) {
                currentBonus = salaries[i] * 0.05;
            } else {
                currentBonus = salaries[i] * 0.02;
            }
            bonusAmounts[i] = currentBonus;
            newSalaries[i] = salaries[i] + currentBonus;

            totalBonusPayout += currentBonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        System.out.println("\n--- Employee Bonus Summary ---");
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("  Old Salary: " + String.format("%.2f", salaries[i]) + " INR");
            System.out.println("  Years of Service: " + yearsOfService[i]);
            System.out.println("  Bonus: " + String.format("%.2f", bonusAmounts[i]) + " INR");
            System.out.println("  New Salary: " + String.format("%.2f", newSalaries[i]) + " INR");
            System.out.println("-----------------------------");
        }

        System.out.println("\nTotal Bonus Payout for the company: " + String.format("%.2f", totalBonusPayout) + " INR");
        System.out.println("Total Old Salary of all employees: " + String.format("%.2f", totalOldSalary) + " INR");
        System.out.println("Total New Salary of all employees: " + String.format("%.2f", totalNewSalary) + " INR");
        input.close();
    }
}