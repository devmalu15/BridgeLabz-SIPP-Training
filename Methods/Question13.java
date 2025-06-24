package Methods;
import java.util.Scanner;

public class Question13 {

    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0)");
        } else {
            int sumByRecursion = recursiveSum(n);
            int sumByFormula = formulaSum(n);

            System.out.println("Sum using recursion: " + sumByRecursion);
            System.out.println("Sum using formula: " + sumByFormula);

            if (sumByRecursion == sumByFormula) {
                System.out.println("Both results are equal and correct.");
            } else {
                System.out.println("There is a mismatch in the results.");
            }
        }

        scanner.close();
    }
}
