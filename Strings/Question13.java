import java.util.*;
public class Question13{
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }
    public static String[] customSplit(String str) {
        int len = findLength(str);
        int spaceCount = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        String[] words = new String[spaceCount + 1];
        int start = 0;
        int wordIndex = 0;
        for (int i = 0; i <= len; i++) {
            if (i == len || str.charAt(i) == ' ') {
                StringBuilder word = new StringBuilder();
                for (int j = start; j < i; j++) {
                    word.append(str.charAt(j));
                }
                words[wordIndex++] = word.toString();
                start = i + 1;
            }
        }
        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String[] customResult = customSplit(input);
        String[] builtInResult = input.split(" ");
        boolean isEqual = compareArrays(customResult, builtInResult);
        System.out.println("\nCustom Split Result:");
        for (String word : customResult) {
            System.out.println(word);
        }
        System.out.println("\nBuilt-in Split Result:");
        for (String word : builtInResult) {
            System.out.println(word);
        }
        System.out.println("\nAre both split results equal? " + isEqual);
    }
}
