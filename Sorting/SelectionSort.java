package Sorting;

import java.util.Scanner;

//wrost case O(n^2)
//best case O(n^2)

public class SelectionSort {

	public static void main(String[] args) {

		int i;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number of element you want to put in array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for( i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Array is: ");
		for(i=0;i<n;i++) {
			System.out.print(" "+arr[i]);
		}
		
		for(i=0;i<n-1;i++) {
			int loc=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[loc]) {
					loc=j;
				}
			}
//			int temp=arr[indx];
			int temp=arr[i];
			arr[i]=arr[loc];
			arr[loc]=temp;
		}
		for(i=0;i<arr.length;i++) {
			System.out.print("\nElement at position "+i+" is: "+arr[i]+" ");
		}
	}

}
