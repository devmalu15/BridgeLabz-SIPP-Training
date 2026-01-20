import java.util.*;
public class Question10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] arr=userDefined(str);
        char[] builtIn=str.toCharArray();
        boolean result=compare(builtIn,arr);
        System.out.println("using toCharArray(): ");
        print(builtIn);
        System.out.println("user define method");
        print(arr);
        System.out.println("Comparison: "+result);
    }
    public static char[] userDefined(String str){
        char[] arr=new char[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i);
        }
        return arr;
    }
    public static boolean compare(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
     public static void print(char[] array) {
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}