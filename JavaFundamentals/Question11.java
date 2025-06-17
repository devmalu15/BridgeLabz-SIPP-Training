import java.util.Scanner;
public class Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number (integer): ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number (integer): ");
        int number2 = input.nextInt();
        if (number2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
        } else {
            int quotient = number1 / number2;
            int remainder = number1 % number2;
            System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two numbers " + number1 + " and " + number2);
        }
        input.close();
    }
}
