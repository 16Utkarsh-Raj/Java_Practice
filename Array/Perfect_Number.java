package Array;

import java.util.Scanner;

public class Perfect_Number {
	
	static boolean solve(int n) {
		int i,sum=0;
		while(n>0) {
			for(i=1;i<n;i++) {
				if(n%i==0) {
					sum+=i;
				}			
			}
		}
			if(sum==n) {
				return true;
			}else {
				return false;
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(solve(n));
		

	}

}
