/*Write a java program to search an element in a Linked List custom implementation dynamic
(Iterative and Recursive)*/

package LabPractical;

public class Exp09 {
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
	
	public Exp09() {
		this.head = null;
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

	public boolean searchIterative(int element) {
		Node current = this.head;
		
		while (current != null) {
			if (current.data == element)
				return true;
			
			current = current.next;
		}
		
		return false;
	}
	
	public boolean searchRecursive(Node node, int element) {
		if (node == null)
			return false;
		
		if (node.data == element)
			return true;
		
		return searchRecursive(node.next, element);
	}
	
	public static void main(String[] args) {
		System.out.println("Utkarsh Raj \t2310987126");
		Exp09 list = new Exp09();
	
		list.append(10);
		list.append(20);
		list.append(30);
		list.append(40);
		
		System.out.println("The Linked List is:");
		list.display();
		
		System.out.println("\nSearching for 20 using the iterative method: "+list.searchIterative(20));
		System.out.println("Searching for 50 using the iterative method: "+list.searchIterative(50));
		
		System.out.println("\nSearching for 30 using the recursive method: "+list.searchRecursive(list.head, 30));
		System.out.println("Searching for 60 using the recursive method: "+list.searchRecursive(list.head, 60));
	}
}

