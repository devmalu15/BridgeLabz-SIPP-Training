package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows for the 2D array: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns for the 2D array: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter " + (rows * cols) + " elements for the 2D array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("\nOriginal 2D Array (Matrix):");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        int[] singleDimArray = new int[rows * cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                singleDimArray[index] = matrix[i][j];
                index++;
            }
        }
        System.out.println("\nCopied 1D Array: " + Arrays.toString(singleDimArray));
        input.close();
    }
}