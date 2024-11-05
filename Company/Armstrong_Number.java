package Company;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int rem,arm=0,temp;
		System.out.println("Enter any number to check: ");
		int num=sc.nextInt();
		
		temp=num;
		while(num>0) {
			rem=num%10;
			arm=rem*rem*rem+arm;
			num=num/10;
		}
		if(temp==arm) {
			System.out.println("The number "+temp+" is armstrong number");
		}else {
			System.out.println("The number "+temp+" is not armstrong number");
		}
	}

}
