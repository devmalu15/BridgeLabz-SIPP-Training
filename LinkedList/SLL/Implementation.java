
public class Implementation {
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addLast(0);
		list.addLast(1);
		list.addLast(2);
		list.addFirst(-1);
		list.addFirst(-2);
		
		list.display();
		
		list.deleteLast();
		list.deleteLast();
		
		list.display();
		
		list.addLast(1);
		list.addLast(3);
		list.addLast(5);
		list.addLast(2);
		
		list.display();
		
		list.delete(3);
		list.delete(5);
		
		list.display();
	}
	
	
}
