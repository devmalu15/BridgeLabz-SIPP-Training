import java.util.*;
public class Question13 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        int choice = scanner.nextInt();
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        switch (choice) {
            case 1:
                System.out.println("Result: " + add(a, b));
                break;
            case 2:
                System.out.println("Result: " + subtract(a, b));
                break;
            case 3:
                System.out.println("Result: " + multiply(a, b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Result: " + divide(a, b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        return a / b;
    }
}