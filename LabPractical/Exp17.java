/*write a java program to implementation queue implementationarray and custom linked list
implementation operations: enque/Deque/search and display*/

package LabPractical;

class ArrayQueue {
	int[] array;
	int capacity, front, rear, size;
	
	public ArrayQueue(int capacity) {
		this.capacity = capacity;
		this.array = new int[capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public boolean isFull() {
		return (size == capacity);
	}
	
	public int size() {
		return size;
	}
	
	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("The queue is full");
			return;
		}
		
		rear = (rear + 1) % capacity;
		
		array[rear] = data;
		
		size++;
		
		System.out.println(data + " enqueued to the queue");
	}
	
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("The queue is empty");
			return Integer.MIN_VALUE;
		}
		
		int data = array[front];
		
		front = (front + 1) % capacity;
		
		size--;
		
		System.out.println("\n" + data + " dequeued from the queue\n");
		
		return data;
	}
	
	public boolean search(int data) {
		for (int i = 0; i < size; i++) {
			int index = (front + i) % capacity;
			
			if (array[index] == data)
				return true;
		}
		return false;
	}
	
	public void display() {
		if (isEmpty()) {
			System.out.println("The queue is empty");
			return;
		}
		
		System.out.print("\nThe queue is: ");
		for (int i = 0; i < size; i++) {
			int index = (front + i) % capacity;
			System.out.print(array[index] + " -> ");
		}
		System.out.println("null");
	}
}

class LinkedListQueue {
	Node head;
	Node tail;
	int size;
	
	class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public LinkedListQueue() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public int size() {
		return size;
	}
	
	public void enqueue(int data) {
		Node newNode = new Node(data);
		
		if (isEmpty())
			head = tail = newNode;
		else {
			tail.next = newNode;
			tail = newNode;
		}
		
		size++;
		
		System.out.println(data + " enqueued to the queue");
	}
	
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("The queue is empty");
			return Integer.MIN_VALUE;
		}
		
		int data = head.data;
		head = head.next;
		
		if (isEmpty())
			tail = null;
		
		size--;
		System.out.println("\n" + data + " dequeued from the queue\n");
		
		return data;
	}
	
	public boolean search(int data) {
		Node current = head;
		while (current != null) {
			if (current.data == data)
				return true;
			
			current = current.next;
		}
		return false;
	}
	
	public void display() {
		if (isEmpty()) {
			System.out.println("The queue is empty");
			return;
		}
		
		System.out.print("\nThe queue is: ");
		Node current = head;
		
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
}
public class Exp17 {

	public static void main(String[] args) {
		System.out.println("Utkarsh Raj \t2310987126");
		ArrayQueue arrayQueue = new ArrayQueue(5);

		arrayQueue.enqueue(10);
		arrayQueue.enqueue(20);
		arrayQueue.enqueue(30);
		
		arrayQueue.dequeue();
		
		arrayQueue.enqueue(40);
		arrayQueue.enqueue(50);
		arrayQueue.enqueue(60);
		
		arrayQueue.display();
		
		System.out.println("\nThe array contains 30: "+arrayQueue.search(30));
		System.out.println("The array contains 90: "+arrayQueue.search(90)+"\n");

		LinkedListQueue linkedListQueue = new LinkedListQueue();

		linkedListQueue.enqueue(10);
		linkedListQueue.enqueue(20);
		linkedListQueue.enqueue(30);
		
		linkedListQueue.dequeue();
		
		linkedListQueue.enqueue(40);
		linkedListQueue.enqueue(50);
		linkedListQueue.enqueue(60);
		
		linkedListQueue.display();
		
		System.out.println("The list contains 40: " + linkedListQueue.search(40));
		System.out.println("The list contains 80: " + linkedListQueue.search(80));
	}
}
