import java.util.*;
public class Question6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		input(sc);
	}
	public static void input(Scanner sc) {
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		System.out.println(findMax(num1,num2,num3));
	}
	public static int findMax(int num1,int num2,int num3) {
		int max=num1;
		if(num2>max){
			max=num2;
		}
		if(num3>max) {
			max=num3;
		}
		return max;
	}
}