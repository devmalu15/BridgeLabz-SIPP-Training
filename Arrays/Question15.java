package Arrays;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        System.out.println("Enter age and height for Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter " + names[i] + "'s age: ");
            ages[i] = input.nextInt();
            System.out.print("Enter " + names[i] + "'s height (cm): ");
            heights[i] = input.nextDouble();
        }

        int youngestAge = ages[0];
        String youngestFriend = names[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = names[i];
            }
        }

        double tallestHeight = heights[0];
        String tallestFriend = names[0];
        for (int i = 1; i < 3; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = names[i];
            }
        }
        System.out.println("\nThe youngest friend is " + youngestFriend + " (Age: " + youngestAge + ").");
        System.out.println("The tallest friend is " + tallestFriend + " (Height: " + String.format("%.2f", tallestHeight) + " cm).");
        input.close();
    }
}