import java.util.*;
public class Question10 {
	public static void main(String[] args) {
		int number = getInput();
	    long result = factorial(number);
	    displayResult(number, result);
	    }
	public static int getInput() {
	     Scanner scanner = new Scanner(System.in);
	     System.out.print("Enter a number for factorial: ");
	     return scanner.nextInt();
	}
	public static long factorial(int n) {
		if (n <= 1) {
			return 1;
	    }
	    return n * factorial(n - 1);
	 }
	public static void displayResult(int number, long result) {
		System.out.println("Factorial of " + number + " is: " + result);
		}
}
