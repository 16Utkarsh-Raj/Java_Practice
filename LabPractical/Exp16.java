/*Write a java DSA program to Reverse a Stack objects using RecursionHaving employee details without using any loop.
Data: Input: elements present in stack from top to bottom sai1 ram2 swati3 radhe4 
Output: radhe4  swati3 ram2 sai1 
*/

package LabPractical;
import java.util.Stack;

public class Exp16 {

	static void insertAtBottom(Stack<String> stack, String data) {
		if (stack.isEmpty())
			stack.push(data);
		else {
			String temp = stack.pop();
			insertAtBottom(stack, data);

			stack.push(temp);
		}
	}

	static void reverse(Stack<String> stack) {
		if (!stack.isEmpty()) {
			String data = stack.pop();
			reverse(stack);
			
			insertAtBottom(stack, data);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Utkarsh Raj \t2310987126");
		Stack<String> stack = new Stack<>();
		stack.push("Sai1");
		stack.push("Ram2");
		stack.push("Swati3");
		stack.push("Radhe4");

		System.out.println("Original Stack: " + stack);

		reverse(stack);

		System.out.println("Reversed Stack: " + stack);
	}

}
