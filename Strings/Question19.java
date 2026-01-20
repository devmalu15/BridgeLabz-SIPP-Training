import java.util.*;
public class Question19{
    public static String classifyChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }
    public static String[][] getCharTypes(String input) {
        int length = 0;
        try {
            while (true) {
                input.charAt(length);
                length++;
            }
        } catch (Exception e) {}
        String[][] result = new String[length][2];
        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = classifyChar(ch);
        }
        return result;
    }
    public static void displayCharTypes(String[][] data) {
        System.out.println("\nCharacter\tType");
        System.out.println("--------------------------");
        for (String[] row : data) {
            System.out.println("   " + row[0] + "\t\t" + row[1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[][] result = getCharTypes(input);
        displayCharTypes(result);
    }
}
