/*write a java program to implementation priority queue implementation array and custom 
linked list implementation operations: enque/Deque and display*/

package LabPractical;

class ArrayPriorityQueue {
	private int[] queue;
	private int size;

	public ArrayPriorityQueue(int capacity) {
		queue = new int[capacity];
		size = 0;
	}

	public void enqueue(int data) {
		if (size == queue.length) {
			System.out.println("Queue is full");
			return;
		}
		
		int i;
		
		for (i = size - 1; i >= 0; i--) {
			if (data > queue[i])
				queue[i + 1] = queue[i];
			else
				break;
		}
		queue[i + 1] = data;
		size++;
	}

	public int dequeue() {
		if (size == 0) {
			System.out.println("Queue is empty");
			return -1;
		}
		return queue[--size];
	}

	public void display() {
		for (int i = 0; i < size; i++)
			System.out.print(queue[i] + " ");
		
		System.out.println();
	}
}

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedListPriorityQueue {
	private Node head;

	public void enqueue(int data) {
		Node newNode = new Node(data);
		
		if (head == null || head.data < data) {
			newNode.next = head;
			head = newNode;
		} else {
			Node current = head;
			
			while (current.next != null && current.next.data >= data)
				current = current.next;
			
			newNode.next = current.next;
			current.next = newNode;
		}
	}

	public int dequeue() {
		if (head == null) {
			System.out.println("Queue is empty");
			return -1;
		}
		
		int data = head.data;
		head = head.next;
		
		return data;
	}

	public void display() {
		Node temp = head;
		
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
		System.out.println();
	}
}

public class Exp20 {

	public static void main(String[] args) {
		System.out.println("Utkarsh Raj \t2310987126");
		ArrayPriorityQueue arrayPriorityQueue = new ArrayPriorityQueue(5);
		LinkedListPriorityQueue linkedListPriorityQueue = new LinkedListPriorityQueue();
		
		// Operations on Array Priority Queue
		arrayPriorityQueue.enqueue(4);
		arrayPriorityQueue.enqueue(5);
		arrayPriorityQueue.enqueue(2);
		arrayPriorityQueue.enqueue(1);
		arrayPriorityQueue.enqueue(3);
		arrayPriorityQueue.display();
		arrayPriorityQueue.dequeue();
		arrayPriorityQueue.display();
		
		// Operations on Linked List Priority Queue
		linkedListPriorityQueue.enqueue(4);
		linkedListPriorityQueue.enqueue(5);
		linkedListPriorityQueue.enqueue(2);
		linkedListPriorityQueue.enqueue(1);
		linkedListPriorityQueue.enqueue(3);
		linkedListPriorityQueue.display();
		linkedListPriorityQueue.dequeue();
		linkedListPriorityQueue.display();
	}

}
