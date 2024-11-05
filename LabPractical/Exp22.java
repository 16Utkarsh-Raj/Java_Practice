/* Check if the two given stacks are sameGiven two Stacks, the task is to check if the given stacks are same or not. Two stacks are said 
 * to be same if they contains the same elements in the same order.  (Dynamic LL  (stackSameorNot/push/peep/pop/display) | Static Array)*/

package LabPractical;

class Stack {
	class Node {
		String data;
		Node next;
		
		public Node(String data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private Node top;
	
	public void push(String data) {
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
	}
	
	public String peek() {
		if (top == null)
			return null;
		
		return top.data;
	}
	
	public String pop() {
		if (top == null)
			return null;

		String data = top.data;
		top = top.next;

		return data;
	}

	public boolean isEmpty() {
		return top == null;
	}
	
	public void display() {
		Node current = top;
		
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		
		System.out.println();
	}
	
	public static boolean areStacksSame(Stack stack1, Stack stack2) {
		while (!stack1.isEmpty() && !stack2.isEmpty()) {
			if (!stack1.pop().equals(stack2.pop()))
				return false;
		}
		
		return stack1.isEmpty() && stack2.isEmpty();
	}
}

public class Exp22 {

	public static void main(String[] args) {
		System.out.println("Utkarsh Raj \t2310987126");
		Stack stack1 = new Stack();
		Stack stack2 = new Stack();
		
		stack1.push("Hello");
		stack1.push("Everyone");
		stack1.push("How");
		stack1.push("are");
		stack1.push("you");
		
		System.out.print("Stack 1: ");
		stack1.display();

		stack2.push("Hello");
		stack2.push("Everyone");
		stack2.push("How");
		stack2.push("are");
		stack2.push("you");
		
		System.out.print("Stack 2: ");
		stack2.display();
		
		boolean result = Stack.areStacksSame(stack1, stack2);
		System.out.println("\nAre the two stacks the same? " + result);
	}

}
