package Methods;
import java.util.Random;

public class Question27 {

    public static double[][] generateEmployeeData(int numberOfEmployees) {
        double[][] data = new double[numberOfEmployees][2];
        Random rand = new Random();

        for (int i = 0; i < numberOfEmployees; i++) {
            int salary = rand.nextInt(90000) + 10000;
            int years = rand.nextInt(11);
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] result = new double[employeeData.length][2];

        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            result[i][0] = bonus;
            result[i][1] = salary + bonus;
        }
        return result;
    }

    public static void calculateAndDisplayTotals(double[][] employeeData, double[][] bonusData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s%-15s%-15s%-15s%-15s%-15s\n", "Emp ID", "Old Salary", "Years", "Bonus", "New Salary", "Status");
        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonus = bonusData[i][0];
            double newSalary = bonusData[i][1];
            String status = years > 5 ? "5% Bonus" : "2% Bonus";

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d%-15.2f%-15.0f%-15.2f%-15.2f%-15s\n", (i + 1), oldSalary, years, bonus, newSalary, status);
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }

    public static void main(String[] args) {
        int numberOfEmployees = 10;
        double[][] employeeData = generateEmployeeData(numberOfEmployees);
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);
        calculateAndDisplayTotals(employeeData, bonusData);
    }
}
