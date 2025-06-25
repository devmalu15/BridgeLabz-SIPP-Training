import java.util.*;

public class Question16{
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
    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        int len = 0;
        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            String result = classifyChar(ch);
            if (result.equals("Vowel")) {
                vowels++;
            } else if (result.equals("Consonant")) {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int[] counts = countVowelsAndConsonants(input);
        System.out.println("\nVowels count: " + counts[0]);
        System.out.println("Consonants count: " + counts[1]);
    }
}
