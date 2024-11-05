/* Write a java program DSA to implement Doubly Linked List 
 * Delete a node in a Doubly Linked List and navigation both 
 * ways and insert after given element*/

package LabPractical;

public class Exp11 {
	Node head;
	Node tail;
	
	class Node {
		int data;
		Node prev;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}
	
	public Exp11() {
		this.head = null;
		this.tail = null;
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

	public void insert(int data) {
		Node newNode = new Node(data);
		
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			newNode.prev = this.tail;
			this.tail.next = newNode;
			this.tail = newNode;
		}
	}
	
	public void traverseForward() {
		if (this.head == null)
			return;
		
		Node current = this.head;
		
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		
		System.out.println("null");
	}
	
	public void traverseBackward() {
		if (this.tail == null)
			return;
		
		Node current = this.tail;
		
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.prev;
		}
		
		System.out.println("null");
	}
	
	public void insertAfter(int givenElement, int newElement) {
		Node current = this.head;

		while (current != null && current.data != givenElement)
			current = current.next;
		
		if (current == null) {
			System.out.println("The given element is not in the list");
			return;
		}
		
		Node newNode = new Node(newElement);
		
		newNode.next = current.next;
		newNode.prev = current;
		
		if (current.next != null)
			current.next.prev = newNode;
		
		current.next = newNode;
		
		if (current == this.tail)
			this.tail = newNode;
	}
	
	public static void main(String[] args) {
		System.out.println("Utkarsh Raj \t2310987126");
		Exp11 list = new Exp11();

		list.insert(10);
		list.insert(20);
		list.insert(30);
		
		System.out.println("The list is:");
		list.display();
		
		
		System.out.println("\nThe list traversed forward is:");
		list.traverseForward();
		System.out.println("\nThe list traversed backward is:");
		list.traverseBackward();
		
		list.insertAfter(20, 15);
		
		System.out.println("\nThe list after insertion is:");
		list.display();
	}
	
}
