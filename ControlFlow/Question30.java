package ControlFlow;

import java.util.Scanner;
public class Question30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks for Physics: ");
        double physicsMarks = input.nextDouble();
        System.out.print("Enter marks for Chemistry: ");
        double chemistryMarks = input.nextDouble();
        System.out.print("Enter marks for Maths: ");
        double mathsMarks = input.nextDouble();

        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double percentage = (totalMarks / 300.0) * 100.0;
        String grade;
        String remarks;

        if (percentage >= 90) {
            grade = "A+";
            remarks = "Excellent performance!";
        } else if (percentage >= 80) {
            grade = "A";
            remarks = "Very good performance.";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Good performance.";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Average performance.";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Pass.";
        } else {
            grade = "F";
            remarks = "Fail. Needs improvement.";
        }
        System.out.println("Average Mark: " + String.format("%.2f", percentage) + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        input.close();
    }
}