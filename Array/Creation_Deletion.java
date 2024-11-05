package Array;

import java.util.Scanner;

public class Creation_Deletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n,i,p,m;
		System.out.print("Enter array size: ");
		n=sc.nextInt();
		int arr[]=new int[n];
		int narr[]=new int[n+1];
		System.out.println("Enter array element: ");
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		//***********Insertion of array element***************
		
		System.out.print("Enter index position to add element: ");
		p=sc.nextInt();
		System.out.print("Enter new array element: ");
		m=sc.nextInt();		
		
		for(i=0;i<n+1;i++) {  //10 20 30 40 50     10 20 80 30 40 50
			if(i<p) {
				narr[i]=arr[i];
			}
			else if(i==p){
				narr[i]=m;
			}
			else {
				narr[i]=arr[i-1];
			}
		}
		
		System.out.println("Array is: ");
		for(i=0;i<n+1;i++) {
			System.out.print(narr[i]+" ");
		}
		
		
		//************Reverse array********
		int rev[]=new int[n];
		int j=n;
		for(i=0;i<n;i++) {
			rev[j-1]=arr[i];
			j=j-1;
		}
		
		System.out.println("\nReverse Array is: ");
		for(i=0;i<n+1;i++) {
			System.out.print(rev[i]+" ");
		}
		
	}

}
