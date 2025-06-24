package Methods;
import java.util.*;

public class Question2 {
    public int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question2 calc = new Question2();

        System.out.println("Enter a positive integer:");
        int n = sc.nextInt();
        if (n > 0) {
            int result = calc.findSum(n);
            System.out.println("sum of first " + n + " natural number is: " + result);
        } else {
            System.out.println("Please enter a positive integer");
        }
        sc.close();
    }
}