package Arrays;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentAges = new int[10];

        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            int age = input.nextInt();
            if (age < 0) {
                System.out.println("Invalid age. Please enter a non-negative age.");
                i--;
            } else {
                studentAges[i] = age;
            }
        }

        System.out.println("\nVoting Eligibility Check:");
        for (int i = 0; i < studentAges.length; i++) {
            int age = studentAges[i];
            if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
        input.close();
    }
}
