
public class Stack {                  //stack definition
	int top;
	int cap;
	int[] stackArray;
	
	public Stack(int cap) {           //constructor
		this.cap = cap;
		top = -1;
		this.stackArray = new int[cap];
	}
	
	
	public void push(int e) {         //push method definition
		int var = e;
		if(top >= cap) {
			System.out.println("Stack Overflow!");
		}
		else {
			top++;
			stackArray[top] = var;
		}
	}
	
	public void display() {          //display method definition
		if(top < 0) {
			System.out.println("Stack Underflow!");
		}
		
		else if(top >= cap) {
			System.out.println("Stack Overflow!");
		}
		else {
			for(int i = cap - 1; i > -1; i--) {
				if(i <= top) {
					System.out.println(stackArray[i]);
				}
				else {
					System.out.println("-");
				}
			}
		}
	}
	
	public void pop() {                //pop method definition
		if(top < 0) {
			System.out.println("Stack Underflow!");
		}
		else {
			System.out.println(stackArray[top]);
			top--;
		}
	}
}
