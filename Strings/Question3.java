import java.util.*;
public class Question3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        try{
            generateException(str);
        }
        catch(NumberFormatException e){
            System.out.println("Caught in main: "+e.getMessage());
        }
        handleException(str);
    }
    public static void generateException(String text){
        int number=Integer.parseInt(text);
        System.out.println("Converted number: "+number);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException!");
            System.out.println("Exception Message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException!");
        }
    }
}