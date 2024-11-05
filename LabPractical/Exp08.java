/*write a java DSA program custom implementation of DSA rules singly linked listand operations
append, insert, display, delete start-mid-end by key position and show its heap memory
HINT: Singly linked List*/

package LabPractical;

public class Exp08 {
	Node head;
	int size;
	
	class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Exp08() {
		this.head = null;
		this.size = 0;
	}
	
	public void display() {
		if (this.head == null)
			return;
		
		Node current = this.head;
		
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		
		System.out.println("null");
	}

	public void append(int data) {
		Node newNode = new Node(data);
	
		if (this.head == null)
			this.head = newNode;
		else {
			Node last = this.head;
			while (last.next != null)
				last = last.next;
			
			last.next = newNode;
		}
		
		this.size++;
	}

	public void insert(int data, int position) {
		if (position < 0 || position > this.size) {
			System.out.println("Invalid position");
			return;
		}
		
		Node newNode = new Node(data);
		
		if (position == 0) {
			newNode.next = this.head;
			this.head = newNode;
		} else {
			Node prev = this.head;
			for (int i = 0; i < position - 1; i++)
				prev = prev.next;
			
			newNode.next = prev.next;
			prev.next = newNode;
		}
		
		this.size++;
	}

	public void delete(int position) {
		if (position < 0 || position >= this.size) {
			System.out.println("Invalid position");
			return;
		}
		
		if (position == 0)
			this.head = this.head.next;
		else {
			Node prev = this.head;
			for (int i = 0; i < position - 1; i++)
				prev = prev.next;
			
			prev.next = prev.next.next;
		}
		
		this.size--;
	}

	public void showHeapMemory() {
		if (this.head == null)
			return;
		
		Node current = this.head;
		
		while (current != null) {
			System.out.print(current.hashCode() + " -> ");
			current = current.next;
		}
		
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		System.out.println("Utkarsh Raj \\t2310987126");
		Exp08 list = new Exp08();
	
		list.append(15);
		list.append(30);
		list.append(45);
		list.append(60);
		
		System.out.println("The list after appending:");
		list.display();
		
		list.insert(10, 0);
		list.insert(25, 2);
		list.insert(35, 4);
		
		System.out.println("\nThe list after inserting:");
		list.display();
		
		list.delete(2);
		list.delete(4);
		list.delete(6);
		
		System.out.println("\nThe list after deleting:");
		list.display();
		
		System.out.println("\nThe heap memory of the list:");
		list.showHeapMemory();
	}
}
