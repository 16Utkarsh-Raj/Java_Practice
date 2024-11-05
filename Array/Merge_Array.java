package Array;

import java.util.Scanner;

public class Merge_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		int i;
		
		System.out.println("Enter number of element in first array: ");
		int n1=sc.nextInt();
		int arr1[]=new int[n1];
		
		for(i=0;i<n1;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Element in first array: ");
		for(i=0;i<n1;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println("\nEnter number of element in second array: ");
		int n2=sc.nextInt();
		int arr2[]=new int[n2];
		for(i=0;i<n2;i++) {
			arr2[i]=sc.nextInt();
		}
		
		System.out.println("Element in second array: ");
		for(i=0;i<n2;i++) {
			System.out.print(arr2[i]+" ");
		}
		
		int sum=n1+n2;
		int cmdarr[]=new int[sum];
		
		for(i=0;i<n1;i++) {
			cmdarr[i]=arr1[i];
			
		}
		
		for(i=0;i<n2;i++) {
			cmdarr[n1]=arr2[i];
			n1++;
		}
		
		System.out.println("\nCombined array is: ");
		for(i=0;i<sum;i++) {
			System.out.print(cmdarr[i]+" ");
		}

	}

}
