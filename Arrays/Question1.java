package Arrays;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer to find its factors: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            input.close();
            return;
        }

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] tempFactors = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        tempFactors[j] = factors[j];
                    }
                    factors = tempFactors;
                }
                factors[index] = i;
                index++;
            }
        }
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i]);
            if (i < index - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        input.close();
    }
}