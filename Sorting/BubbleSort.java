package Sorting;

import java.util.Scanner;

//wrost case O(n^2)
//best case O(n)


public class BubbleSort {
	public static void main(String[] args) {
		
		int i,j,temp;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number of element you want to put in array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Array is: ");
		for(i=0;i<n;i++) {
			System.out.print(" "+arr[i]);
		}
		
		for(i=0;i<n-1;i++) {
			
			for(j=0;j<n-i-1;j++) 
			{
				if(arr[j]>arr[j+1]) 
				{	
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(i=0;i<arr.length;i++) {
			System.out.print("\nElement at position "+i+" is: "+arr[i]+" ");
		}
	}

}
