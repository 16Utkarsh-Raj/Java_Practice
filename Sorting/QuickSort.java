package Sorting;

import java.util.Scanner;

//best/avg case O(nlogn)
//wrost case O(n^2)

class sort{
	int partition(int arr[],int start,int end) {
		int pivot=arr[end];
		int pindex=start;
		
		for(int i=start;i<end-1;i++) {
			if(arr[i]<=pivot) {
				int t=arr[pindex];
				arr[pindex]=arr[i];
				arr[i]=t;
				pindex++;
			}
		}
		int t=arr[pindex];
		arr[pindex]=arr[end];
		arr[end]=t;
		return (pindex);
	}
	
	void quick1(int arr[],int start,int end) {
		if(start<end) {
			int p=partition(arr,start,end);
			quick1(arr,start,p-1);
			quick1(arr,p+1,end);
		}
	}
}

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,i,j,loc,ptr,temp;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter no. of elemetn to put: ");
		n=sc.nextInt();
		int arr[]=new int[n];
		
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array is: ");
		for(i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
		
		sort q1=new sort();
		q1.quick1(arr,0,n-1);
		
		
		for(i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
