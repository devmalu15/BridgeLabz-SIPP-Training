import java.util.*;
public class Question9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String builtInLower = str.toLowerCase();
        String manualLower=convertToLowerCase(str);
        boolean result=compareStrings(builtInLower, manualLower);
        System.out.println("Using ToLowerCase(): "+builtInLower);
        System.out.println("Using charAt(): "+manualLower);
        System.out.println("Comparision: "+result);

    }
    public static String convertToLowerCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char)(ch + 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}