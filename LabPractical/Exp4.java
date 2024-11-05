package LabPractical;

import java.util.Scanner;

public class Exp4 {

	public static void main(String[] args) {
		System.out.println ("Utkarsh Raj \t2310987126");
		Scanner sc = new Scanner(System.in);		
		char cont = 'Y';
		
		while (cont=='Y' || cont=='y') {
			System.out.println("Fibonacci Series...");
			System.out.println("1. Using Iteration");
			System.out.println("2. Using Divide-and-conquer method");
			
			System.out.print("\nEnter choice: ");
			int ch = sc.nextInt();
			
			System.out.print("\nEnter a number: ");
			int n = sc.nextInt();
			
			switch(ch) {
				case 1:{
					System.out.print("\nFibonacci Series: ");
					printFibonacciIter(n);
					break;
				}
				case 2:{
					System.out.print("\nFibonacci Series: ");
					printFibonacciDac(n);
					break;
				}
			}
			
			System.out.print("\n\nDo you want to continue (Y): ");
			cont = sc.next().charAt(0);
			System.out.println();
		}
		sc.close();
	}
	
	public static void printFibonacciIter(int n) {
		int first = 0;
		int second = 1;
		
		System.out.print(first + " " + second + " ");
		
		for (int i = 3; i <= n; i++) {
			int next = first + second;
			
			System.out.print(next + " ");
			
			first = second;
			second = next;
		}
	}
	
	public static int fibDac(int n) {
		if (n <= 1)
			return n;
		
		return fibDac(n - 1) + fibDac(n - 2);
	}
	
	public static void printFibonacciDac(int n) {
		for (int i = 0; i < n; i++)
			System.out.print(fibDac(i) + " ");
	}

}
