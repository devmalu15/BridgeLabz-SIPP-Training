import java.util.*;

public class Question18{
    public static int[] getTrimIndices(String str) {
        int start = 0;
        int end = 0;
        int len = 0;
        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        end = len - 1;
        while (start < len && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
        }
    public static String manualSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    public static boolean compareStrings(String str1, String str2) {
        int len1 = 0, len2 = 0;
        try {
            while (true) str1.charAt(len1++);
        } catch (Exception e) {}
        try {
            while (true) str2.charAt(len2++);
        } catch (Exception e) {}
        if (len1 != len2) return false;
        for (int i = 0; i < len1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = sc.nextLine();
        int[] indices = getTrimIndices(input);
        String trimmedManual = manualSubstring(input, indices[0], indices[1]);
        String trimmedBuiltIn = input.trim();
        boolean isSame = compareStrings(trimmedManual, trimmedBuiltIn);
        System.out.println("\n--- Results ---");
        System.out.println("Original input: [" + input + "]");
        System.out.println("Manually trimmed: [" + trimmedManual + "]");
        System.out.println("Built-in trim(): [" + trimmedBuiltIn + "]");
        System.out.println("Are both trimmed strings equal? " + isSame);
    }
}
