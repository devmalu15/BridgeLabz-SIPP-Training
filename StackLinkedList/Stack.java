public class Stack {
	Node top;
	int cap;
	int limit;
	Node temp;
	
	public Stack(int cap) {
		limit = cap;
	}
	
	public void push(int e) {
		Node node = new Node(e);
		if(top == null) {
			top = node;
		}
		else {
			temp = top;
			top = node;
			top.prev = temp;
			limit--;
		}
	}
	
	public void display() {
		temp = top;
		if(top == null) {
			System.out.println("Stack Underflow!");
		}
		else {
			while(temp != null) {
				System.out.println(temp.data);
				temp = temp.prev;
			}
		}	
	}
	
	public void pop() {
		System.out.println(top.data);
		top = top.prev;
		limit++;
	}
}
