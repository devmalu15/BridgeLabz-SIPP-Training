package Arrays;

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        double[] physicsMarks = new double[numStudents];
        double[] chemistryMarks = new double[numStudents];
        double[] mathsMarks = new double[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        System.out.println("\nEnter marks for each student (Physics, Chemistry, Maths):");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.print("  Enter Physics marks: ");
            double pMarks = input.nextDouble();
            if (pMarks < 0 || pMarks > 100) {
                System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                i--;
                continue;
            }
            physicsMarks[i] = pMarks;

            System.out.print("  Enter Chemistry marks: ");
            double cMarks = input.nextDouble();
            if (cMarks < 0 || cMarks > 100) {
                System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                i--;
                continue;
            }
            chemistryMarks[i] = cMarks;

            System.out.print("  Enter Maths marks: ");
            double mMarks = input.nextDouble();
            if (mMarks < 0 || mMarks > 100) {
                System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                i--;
                continue;
            }
            mathsMarks[i] = mMarks;

            double totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = (totalMarks / 300.0) * 100.0;

            if (percentages[i] >= 90) {
                grades[i] = "A+";
            } else if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("  Physics Marks: " + physicsMarks[i]);
            System.out.println("  Chemistry Marks: " + chemistryMarks[i]);
            System.out.println("  Maths Marks: " + mathsMarks[i]);
            System.out.println("  Percentage: " + String.format("%.2f", percentages[i]) + "%");
            System.out.println("  Grade: " + grades[i]);
        }
        input.close();
    }
}