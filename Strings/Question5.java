import java.util.*;
public class Question5{
    public static void generateException(String input) {
        String result = input.substring(5, 2);
        System.out.println("Substring result: " + result);
    }
    public static void handleException(String input) {
        try {
            String result = input.substring(5, 2);
            System.out.println("Substring result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException!");
            System.out.println("Exception Message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException!");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        System.out.println("\nCalling method to generate exception...");
        try {
            generateException(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
        System.out.println("\nCalling method that handles exception internally...");
        handleException(userInput);
    }
}
