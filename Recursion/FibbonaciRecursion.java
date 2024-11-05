package Recursion;

import java.util.Scanner;

public class FibbonaciRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=sol(n);
		System.out.println(result);
	}
	public static int sol(int n) {
		if(n==0||n==1)
			return n;
			int fh=sol(n-1); //fh-first half
			int sh=sol(n-2);
			int res=fh+sh;
			return res;
		}
	

}


