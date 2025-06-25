import java.util.*;
public class Question1{
        public static void generateException() {
        String text = null;
        System.out.println("Length of the text: " + text.length());
    }
    public static void handleException() {
        String text = null;
        try {
           System.out.println("Length of the text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException!");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        System.out.println("Calling method that generates exception...");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        System.out.println("\nCalling method that handles exception internally...");
        handleException();
    }
}
