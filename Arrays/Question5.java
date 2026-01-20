package Arrays;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] heights = new double[11];
        double sumOfHeights = 0.0;

        System.out.println("Enter the heights (in meters) of 11 football players:");
        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = input.nextDouble();
            sumOfHeights += heights[i];
        }

        double meanHeight = sumOfHeights / 11.0;

        System.out.println("\nThe sum of all heights is: " + String.format("%.2f", sumOfHeights) + " meters.");
        System.out.println("The mean height of the football team is: " + String.format("%.2f", meanHeight) + " meters.");
        input.close();
    }
}