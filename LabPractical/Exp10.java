/* Write a java program DSA to implement
Doubly Linked List: Insertion A node can be added in four ways
1) At the push front of the DLL
2) After a given node.
3) At the end of the DLL
4) Before a given node.
5) Traversal DLL backward/forward
6) search in DLL */

package LabPractical;

public class Exp10 {
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
	
	public Exp10() {
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
	
	public void insertFront(int data) {
		Node newNode = new Node(data);
		
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			newNode.next = this.head;
			this.head.prev = newNode;
			this.head = newNode;
		}
	}

	public void insertAfter(Node node, int data) {
		if (node == null) {
			System.out.println("The given node cannot be null");
			return;
		}
		
		Node newNode = new Node(data);
		newNode.next = node.next;
		newNode.prev = node;
		
		if (node.next != null)
			node.next.prev = newNode;
		
		node.next = newNode;
		
		if (node == this.tail)
			this.tail = newNode;
	}

	public void insertEnd(int data) {
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

	public void insertBefore(Node node, int data) {
		if (node == null) {
			System.out.println("The given node cannot be null");
			return;
		}
		
		Node newNode = new Node(data);
		newNode.next = node;
		newNode.prev = node.prev;
		
		if (node.prev != null)
			node.prev.next = newNode;
		
		node.prev = newNode;
		
		if (node == this.head)
			this.head = newNode;
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
	
	public boolean search(int element) {
		Node current = this.head;
		
		while (current != null) {
			if (current.data == element)
				return true;
			 
			current = current.next;
		}
		
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Utkarsh Raj \t2310987126");
		Exp10 list = new Exp10();
		
		list.insertFront(20);
		list.insertEnd(40);
		list.insertAfter(list.head, 30);
		list.insertBefore(list.tail, 25);
		
		System.out.println("The list after insertion is:");
		list.display();
		
		System.out.println("\nThe list traversed forward is:");
		list.traverseForward();
		
		System.out.println("\nThe list traversed backward is:");
		list.traverseBackward();
		
		System.out.println("\nSearching for 15 in the list: "+list.search(15));
		System.out.println("\nSearching for 30 in the list: "+list.search(30));
	}

}
