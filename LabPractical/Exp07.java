/*Write a java DSA program to implement tail recursion and non-tail recursive approach
toimplement properties for finding factorial of a number and sum of a number*/

package LabPractical;

import java.util.Scanner;

public class Exp07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Utkarsh Raj \\t2310987126");
		char cont = 'Y';
		
		while (cont=='Y' || cont=='y') {
			System.out.println("1. Fatorial Using Tail Recursion");
			System.out.println("2. Fatorial Using Non Tail Recursion");
			System.out.println("3. Sum Using Tail Recursion");
			System.out.println("4. Sum Using Non Tail Recursion");
			
			System.out.print("\nEnter choice: ");
			int ch = sc.nextInt();
			
			System.out.print("\nEnter a number: ");
			int n = sc.nextInt();
			
			switch(ch) {
				case 1:{
					System.out.println("\nFactorial of "+n+" is "+factorialTail(n, 1));
					break;
				}
				case 2:{
					System.out.println("\nFactorial of "+n+" is "+factorialNonTail(n));
					break;
				}
				case 3:{
					System.out.println("\nSum of "+n+" is "+sumTail(n,0));
					break;
				}
				case 4:{
					System.out.println("\nSum of "+n+" is "+sumNonTail(n));
					break;
				}
			}
			
			System.out.print("\nDo you want to continue (Y): ");
			cont = sc.next().charAt(0);
			System.out.println();
		}
		sc.close();
	}
	
	public static int factorialTail(int n, int result) {
		if (n <= 1)
			return result;
		
		return factorialTail(n - 1, result * n);
	}
	
	public static int factorialNonTail(int n) {
		if (n <= 1)
			return 1;
		
		return n * factorialNonTail(n - 1);
	}
	
	public static int sumTail(int n, int result) {
		if (n == 0)
			return result;

		return sumTail(n - 1, result + n);
	}
	
	public static int sumNonTail(int n) {
		if (n == 0)
			return 0;
		
		return n + sumNonTail(n - 1);
	}
}
