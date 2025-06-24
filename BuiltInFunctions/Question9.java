import java.util.*;
public class Question9 {
	public static void main(String[] args) {
        String input = getInput();
        boolean isPalindrome = checkPalindrome(input);
        displayResult(input, isPalindrome);
    }
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        return scanner.nextLine();
    }
    public static boolean checkPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    public static void displayResult(String str, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("'" + str + "' is a palindrome.");
        } else {
            System.out.println("'" + str + "' is NOT a palindrome.");
        }
    }
}
