import java.util.*;
public class Question7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String builtInUpper = str.toUpperCase();
        String manualUpper=convertToUpperCase(str);
        boolean result=compareStrings(builtInUpper, manualUpper);
       System.out.println("Using ToUpperCase(): "+builtInUpper);
       System.out.println("Using charAt(): "+manualUpper);
       System.out.println("Comparision: "+result);

    }
    public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char)(ch - 32));
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