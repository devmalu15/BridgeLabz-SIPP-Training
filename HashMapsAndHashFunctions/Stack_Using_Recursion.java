import java.util.Stack;
public class Stack_Using_Recursion {
	
	public static void Stack_Using_Recursion(Stack<Integer> stack) {
		if(!stack.isEmpty()) {
			int top= stack.pop();
			Stack_Using_Recursion(stack);
			insertInSortedOrder(stack,top);
		}
	}
	// Helper function to insert an element into the sorted stack
	 private static void insertInSortedOrder(Stack<Integer> stack, int element) {
		 if(stack.isEmpty() || element>= stack.peek()) {
			 stack.push(element);
		 }else {
			 int temp= stack.pop();
			 insertInSortedOrder(stack, element);
			 stack.push(temp);
			 }
	 }
	 public static void main(String[] args) {
		 Stack<Integer> stack = new Stack<>();
		 stack.push(3);
		 stack.push(1);
		 stack.push(4);
		 stack.push(2);
		 
		 System.out.println("original Stack"+ stack);
		 Stack_Using_Recursion(stack);
		 System.out.println("Sorted stack"+ stack);
	 }
}
