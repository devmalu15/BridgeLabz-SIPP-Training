import java.util.*;
public class Question8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<2) {
			System.out.println(n);
		}
		System.out.print("0 1 ");
		Fibonacci(n);
	}
	public static void Fibonacci(int num) {
		int start=1;
		int second=1;
		int curr=start+second;
		System.out.print(start+" ");
		System.out.print(second+" ");
		while(curr<num) {
			System.out.print(curr+" ");
			start=second;
			second=curr;
			curr=start+second;
		}
	}
}
