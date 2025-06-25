import java.util.*;
public class Question8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int start=sc.nextInt();
        int end=sc.nextInt();
        String builtIn=str.substring(start,end);
        String manual=SubStrings(str,start,end);
        boolean result=compareStrings(builtIn,manual);
        System.out.println("By using function: "+builtIn);
        System.out.println("By manually: "+manual);
        System.out.println("Comparison: "+result);
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
    public static String SubStrings(String str, int start, int end){
        StringBuilder temp=new StringBuilder();
        for(int i=start;i<end;i++){
            temp.append((char)(str.charAt(i)));
        }
        return temp.toString();
    }
}