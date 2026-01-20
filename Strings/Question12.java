import java.util.*;
public class Question12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("Length of string without using Inbuilt: "+ userdefined(str));
        System.out.println("Length of string with using Inbuilt: "+ str.length());
    }
    public static int userdefined(String str){
        int count=0;
        try{
            while(true){
                str.charAt(count);
                count++;
            }
        }
        catch(StringIndexOutOfBoundsException e){
        }
        return count;
    }
}