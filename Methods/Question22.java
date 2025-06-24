package Methods;
import java.util.Scanner;

public class Question22 {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2)
            return 1;
        else if (number1 == number2)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nAnalysis:");
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isPositive(num)) {
                if (isEven(num)) {
                    System.out.println("Number " + num + " is Positive and Even");
                } else {
                    System.out.println("Number " + num + " is Positive and Odd");
                }
            } else {
                System.out.println("Number " + num + " is Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        System.out.print("\nComparison of first and last elements: ");
        if (result == 1) {
            System.out.println("First element is greater than last");
        } else if (result == 0) {
            System.out.println("First element is equal to last");
        } else {
            System.out.println("First element is less than last");
        }

        scanner.close();
    }
}
