import java.util.Scanner;
public class Question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();
        double additionResult = number1 + number2;
        double subtractionResult = number1 - number2;
        double multiplicationResult = number1 * number2;
        double divisionResult;
        if (number2 == 0) {
            System.out.println("Cannot perform division by zero.");
            divisionResult = Double.NaN;
        } else {
            divisionResult = number1 / number2;
        }
        System.out.println("The addition, subtraction, multiplication, and division value of " + number1 + " and " + number2 + " is " +
                           additionResult + ", " + subtractionResult + ", " + multiplicationResult + ", and " + divisionResult);
        input.close();
    }
}