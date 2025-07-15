import java.util.Stack;
public class Queue_Using_Stacks {
	private Stack<Integer> stack_in;
	private Stack<Integer> stack_out;
	
	public Queue_Using_Stacks() {
		stack_in = new Stack<>();
		stack_out = new Stack<>();
	}
	
	public void enqueue(int x) {
		stack_in.push(x);
	}
	
	public int dequeue() {
		if(empty()) {
			throw new RuntimeException("Queue is empty");
		}
		if(stack_out.isEmpty()) {
			while(!stack_in.isEmpty()) {
				stack_out.push(stack_in.pop());
			}
		}
		return stack_out.pop();
	}
	public int peek() {
		if(empty()) {
			throw new RuntimeException("Queue is empty");
		}
		if(stack_out.isEmpty()) {
			while(!stack_in.isEmpty()) {
				stack_out.push(stack_in.pop());
			}
		}
		return stack_out.peek();
	}
	public boolean empty() {
		return stack_in.isEmpty()&& stack_out.isEmpty();
	}
	public static void main(String[]args) {
		Queue_Using_Stacks q = new Queue_Using_Stacks();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println(q.dequeue());
		System.out.println(q.peek());
		q.enqueue(4);
		System.out.println(q.dequeue());
	}

		
	}
