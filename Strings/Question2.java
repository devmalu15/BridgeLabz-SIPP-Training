import java.util.*;
public class Question2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        try {
            generateException(str);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
        length(str);
    }
    public static void generateException(String str){
        System.out.println("Character at idx 10: "+str.charAt(10));
    }

    public static void length(String str){
        try {
            System.out.println("Character at index 10: " + str.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException!");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }
}