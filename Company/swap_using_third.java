package Company;

import java.util.Scanner;

public class swap_using_third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a=sc.nextInt();
		System.out.print("Enter second number: ");
		int b=sc.nextInt();
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("First number is: "+a);
		
		System.out.println("Second number is: "+b);
	}

}
