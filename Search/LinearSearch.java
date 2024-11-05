package Search;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of element in array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();

		}
		System.out.println("Array is "+Arrays.toString(arr));
		System.out.println("Enter element you want to search ");
		int key=sc.nextInt();
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("Element found index at "+(i+1)+" ");
				found=true;
				break;
			}
			
		}
		if (!found) {
			System.out.println("not present");
		}

	}
	

}
