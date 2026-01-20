package Arrays;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        double[][] marks = new double[numStudents][3]; // 0: Physics, 1: Chemistry, 2: Maths
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        System.out.println("\nEnter marks for each student (Physics, Chemistry, Maths):");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subjectName = "";
                if (j == 0) subjectName = "Physics";
                else if (j == 1) subjectName = "Chemistry";
                else subjectName = "Maths";

                System.out.print("  Enter " + subjectName + " marks: ");
                double mark = input.nextDouble();
                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                    j--;
                } else {
                    marks[i][j] = mark;
                }
            }
        }

        for (int i = 0; i < numStudents; i++) {
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
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
            System.out.println("  Physics: " + marks[i][0]);
            System.out.println("  Chemistry: " + marks[i][1]);
            System.out.println("  Maths: " + marks[i][2]);
            System.out.println("  Percentage: " + String.format("%.2f", percentages[i]) + "%");
            System.out.println("  Grade: " + grades[i]);
        }
        input.close();
    }
}
