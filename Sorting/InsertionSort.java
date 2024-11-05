package Sorting;

import java.util.Scanner;

//best time O(n)
//wrost time O(n^2)

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,temp;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of array element you want to put: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Array is ");
		for(i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		for(i=1;i<n;i++) {
			temp=arr[i];
			j=i-1;
//			while(temp<arr[j] && j>=1) {
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
		}
		
		for(i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
		

	}

}
