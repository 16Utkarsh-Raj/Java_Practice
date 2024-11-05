package Company;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int rev=0,rem,temp;
		System.out.println("Enter any number to check: ");
		int num=sc.nextInt();
		
		temp=num;
		while(temp!=0) {    //151
			rem=temp%10;   //  1   5   1
			rev=(rev*10)+rem;  //1    15    151
			temp=temp/10;     // 15    1    0
		}
		if(temp==rev) {
			System.out.println("The number "+num+" is Palindrome number");
		}else {
			System.out.println("The number "+num+" is not Palindrome number");
		}
	}
}
