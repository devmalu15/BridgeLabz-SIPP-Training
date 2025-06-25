import java.util.*;
public class Question4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
        }
        try{
            generateException(arr);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught in main: "+e.getMessage());
        }
        handleException(arr);
    }
    public static void generateException(String[] arr){
        System.out.println("Acessing 6th element: "+arr[5]);
    }
    public static void handleException(String[] arr){
        try{
            System.out.println("Accessing 6th element: "+arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught ArrayIndexOutOfBoundsException");
            System.out.println("Exception Message: " + e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("Caught a RuntimeException!");
        }
    }
}