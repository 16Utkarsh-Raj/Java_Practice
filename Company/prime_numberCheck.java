package Company;

import java.util.Scanner;

public class prime_numberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num=sc.nextInt();
		
		boolean isPrime=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isPrime=false;
			}
		}
		if(isPrime) {
			System.out.println("The number "+num+" is a prime number");
		}
		else {
			System.out.println("The number "+num+" is not a prime number");
		}
		

	}

}
