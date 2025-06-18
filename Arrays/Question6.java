package Arrays;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 numbers (enter 0 or a negative number to stop):");

        while (true) {
            if (index == 10) {
                System.out.println("Array is full (maximum 10 elements reached).");
                break;
            }
            System.out.print("Enter number " + (index + 1) + ": ");
            double userEntry = input.nextDouble();

            if (userEntry <= 0) {
                System.out.println("Stopping input as 0 or negative number entered.");
                break;
            }
            numbers[index] = userEntry;
            index++;
        }
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }
        System.out.println("\n\nSum of all entered numbers: " + String.format("%.2f", total));
        input.close();
    }
}