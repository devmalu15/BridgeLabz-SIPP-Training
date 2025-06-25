import java.util.Scanner;
public class Question15{
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
    public static String[][] getWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }
        return table;
    }
    public static int[] findShortestAndLongest(String[][] table) {
        int shortestIndex = 0;
        int longestIndex = 0;
        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            int shortestLen = Integer.parseInt(table[shortestIndex][1]);
            int longestLen = Integer.parseInt(table[longestIndex][1]);
            if (len < shortestLen) {
                shortestIndex = i;
            }
            if (len > longestLen) {
                longestIndex = i;
            }
        }
        return new int[] {shortestIndex, longestIndex};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String[] words = customSplit(input);
        String[][] table = getWordLengthTable(words);
        int[] result = findShortestAndLongest(table);
        System.out.println("\nWord\t\tLength");
        System.out.println("------------------------");
        for (String[] row : table) {
            System.out.println(row[0] + "\t\t" + Integer.parseInt(row[1]));
        }
        System.out.println("\nShortest word: " + table[result[0]][0] + " (Length: " + table[result[0]][1] + ")");
        System.out.println("Longest word : " + table[result[1]][0] + " (Length: " + table[result[1]][1] + ")");
    }
}
