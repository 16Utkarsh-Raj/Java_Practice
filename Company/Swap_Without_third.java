package Company;

import java.util.Scanner;

public class Swap_Without_third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a=sc.nextInt();
		System.out.print("Enter second number: ");
		int b=sc.nextInt();
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("First number is: "+a);
		
		System.out.println("Second number is: "+b);
		
	}

}
