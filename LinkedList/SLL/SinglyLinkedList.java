
public class SinglyLinkedList {
	Node head;
	Node tail;
	
	
	public void addLast(Object data) {
		Node node = new Node(data);
		
		if(head == null) {
			head = tail = node;
		}
		else {
			tail.next = node;
			tail = node;
		}
	}
	
	public void display() {
		Node temp;
		if(head == null) {
			System.out.println("List is empty!");
		}
		else {
			temp = head;
			while(temp != null) {
				System.out.print(temp.data + "-> ");
				temp = temp.next;
			}
			
		}
		System.out.println("");
		
	}
	
	public void addFirst(Object data) {
		Node node = new Node(data);
		if(head == null) {
			head = tail = node;
		}
		else {
			node.next = head;
			head = node;
		}
	}
	
	public void deleteLast() {
		if(head == null) {
			System.out.println("List is Empty!");
		}
		else {
			Node temp = head;
			if(temp.next == null) {
				head = null;
			}
			else {
				while(temp.next.next != null) {
					temp = temp.next;
				}
				tail = temp;
				temp.next = null;
			}
		}
	}
	
	
	
	
	public void delete(Object target) {
		if(head == null) {
			System.out.println("List is Empty!");
		}
		else {
			Node temp = head;
			while(temp != null) {
				if(temp.next.data == target) {
					break;
				}
				else {
					if(temp.next == null) {
						System.out.println("Element not found in the list!");
					}
					else {
						temp = temp.next;
						continue;
					}
				}
			}
			temp.next = temp.next.next;
			System.out.println(target + " deleted!");
		}
		
	}
	
	
}
	
	

