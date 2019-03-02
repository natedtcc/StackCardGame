package stack;
/**
 * @author Jin An
 * Delaware Technical Community College
 *
 */

public class LinkedStack<T> implements StackInterface<T> {

	Node head;
	
	public void push(T item) {
		if (head == null) {
			// The stack is empty
			Node newNode = new Node(item, null);
			head = newNode;
		} else {
			// Stack is not empty, create a new node at the top of the stack
			// The new item's next link goes to the "old" head
			Node newNode = new Node(item, head);
			
			// Now we can re-assign the link to the new head
			head = newNode;
		}
	}

	public T pop() {
		T T = peek();
		head = head.getNext();
		return T;
	}

	public T peek() {
		return head.data;
	}
	
	public int length() {
        Node n = head; 
        int length = 0;
        while (n != null) 
        { 
            length++; 
            n = n.next; 
        }
        return length;
	}
	
	@Override
	public String toString() {
		String s = "";
		Node n = head;
		while(n != null) {
			s += n.data + "\n";
			n = n.next;
		}
		
		return s;
	}
	
	/* This function prints contents of linked list starting from head */
	// Adapted from https://www.geeksforgeeks.org/linked-list-set-1-introduction/
	// Included for testing purposes
    public void printList() 
    { 
        Node n = head; 
        while (n != null) 
        { 
            System.out.print(n.data+" \n"); 
            n = n.next; 
        } 
    }
	
	// Nested class Node
	private class Node {
		T data;
		Node next;
		
		// Constructor for inner class Node
		Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}
		
		// Setters & Getters for inner class Node
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}

}
