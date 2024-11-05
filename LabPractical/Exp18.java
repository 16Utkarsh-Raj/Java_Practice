/* write a java program to implementation de-queue 
 * implementation array and custom linked list 
 * implementation operations: enque/Deque/front enque /
 * front deque/end enque/end deque/ search and display*/
package LabPractical;

class ArrayQue {
	int[] array;
	int capacity;
	int front;
	int rear;
	int size;
	
	public ArrayQue(int capacity) {
		this.capacity = capacity;
		this.array = new int[capacity];
		this.front = -1;
		this.rear = 0;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public boolean isFull() {
		return (size == capacity);
	}
	
	public void frontEnqueue(int data) {
		if (isFull()) {
			System.out.println("The queue is full");
			return;
		}
		
		if (isEmpty()) {
			front = 0;
			rear = 0;
		}
		else
			front = (front - 1 + capacity) % capacity;
		
		array[front] = data;
		
		size++;
		
		System.out.println(data + " enqueued to the queue");
	}
	
	public int frontDequeue() {
		if (isEmpty()) {
			System.out.println("The queue is empty");
			return -1;
		}
		
		int data = array[front];
		
		if (size == 1) {
			front = -1;
			rear = -1;
		}
		else
			front = (front + 1) % capacity;
		
		size--;
		
		System.out.println(data + " dequeued from the queue");
		
		return data;
	}
	
	
	
	public void endEnqueue(int data) {
		if (isFull()) {
			System.out.println("The queue is full");
			return;
		}
		
		size++;
		
		rear = (rear + 1) % capacity;
		
		array[rear] = data;
		
		System.out.println(data + " enqueued to the rear of the queue");
	}
	
	public int endDequeue() {
		if (isEmpty()) {
			System.out.println("The queue is empty");
			return Integer.MIN_VALUE;
		}
		
		int data = array[rear];
		
		rear = (rear - 1 + capacity) % capacity;
		
		size--;
		
		System.out.println(data + " dequeued from the rear of the queue");
		
		return data;
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
		System.out.println("null\n");
	}
	
	public boolean search(int data) {
		if (isEmpty()) {
			System.out.println("The queue is empty");
			return false;
		}
		
		for (int i = 0; i < size; i++) {
			int index = (front + i) % capacity;
			
			if (array[index] == data) {
				return true;
			}
		}
		
		return false;
	}
}

class CustomList {
	Node head;
	Node tail;
	int size;
	
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
	
	public CustomList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public void frontEnqueue(int data) {
		Node newNode = new Node(data);
		
		if (isEmpty())
			head = tail = newNode;
		else {
			newNode.next = head;
			head.prev = newNode;
			
			head = newNode;
		}
		
		size++;
		
		System.out.println(data + " enqueued to the front of the list");
	}
	
	public void endEnqueue(int data) {
		Node newNode = new Node(data);
		
		if (isEmpty())
			head = tail = newNode;
		else {
			newNode.prev = tail;
			tail.next = newNode;
			
			tail = newNode;
		}
		
		size++;
		System.out.println(data + " enqueued to the end of the list");
	}
	
	public int frontDequeue() {
		if (isEmpty()) {
			System.out.println("The list is empty");
			return Integer.MIN_VALUE;
		}
		
		int data = head.data;
		head = head.next;
		
		if (head == null)
			tail = null;
		else
		head.prev = null;
		
		size--;
		
		System.out.println(data + " dequeued from the front of the list");
		
		return data;
	}
	
	public int endDequeue() {
		if (isEmpty()) {
			System.out.println("The list is empty");
			return Integer.MIN_VALUE;
		}
		
		int data = tail.data;
		
		tail = tail.prev;
		
		if (tail == null)
			head = null;
		else
			tail.next = null;
		
		size--;
		
		System.out.println(data + " dequeued from the end of the list");
		
		return data;
	}
	
	public boolean search(int data) {
		if (isEmpty()) {
			System.out.println("The list is empty");
			return false;
		}
		
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
			System.out.println("The list is empty");
			return;
		}
		
		System.out.print("\nThe list is: ");
		Node current = head;
		
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null\n");
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
}

public class Exp18 {

	public static void main(String[] args) {
		System.out.println("Utkarsh Raj \t2310987126");
		ArrayQue arrayQueue = new ArrayQue(5);

		arrayQueue.frontEnqueue(10);
		arrayQueue.frontEnqueue(20);
		arrayQueue.endEnqueue(30);
		arrayQueue.endEnqueue(40);
		
		arrayQueue.display();
		
		arrayQueue.frontDequeue();
		arrayQueue.endDequeue();
		
		arrayQueue.display();
		
		System.out.println("The array contains 30: "+arrayQueue.search(30));
		System.out.println("The array contains 40: "+arrayQueue.search(40)+"\n");

		CustomList list = new CustomList();

		list.frontEnqueue(10);
		list.endEnqueue(20);
		list.frontEnqueue(30);
		list.endEnqueue(40);
		list.display();
		
		list.frontDequeue();
		list.endDequeue();
		list.display();
		
		System.out.println("The list contains 20: " + list.search(20));
		System.out.println("The list contains 50: " + list.search(50));
	}

}
