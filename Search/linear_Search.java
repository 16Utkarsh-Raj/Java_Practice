package Search;

import java.util.Scanner;

//best case O(1)
//wrost case O(n)

public class linear_Search {
	public static void main(String[] args) {
		int i;int c=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number of element you want to put in array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array is: ");
		for(i=0;i<n;i++) {
			System.out.print(arr[i]);
		}

		
		System.out.print("Enter item to search: ");
		int item=sc.nextInt();
		for(i=0;i<n;i++) {
			if(arr[i]==item) {
				c++; //counter
				break;
			}
		}
		if(c>0) {
			System.out.print("exist at position "+i);
		}else {
			System.out.print("Does not exist ");
		}
	}
}
