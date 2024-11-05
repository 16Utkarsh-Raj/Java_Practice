package Search;

import java.util.Scanner;

//best case O(n)
//wrost case O(logn)

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int c=0;
		int beg, end,mid=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number of element you want to put in array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Array is: ");
		for(i=0;i<n;i++) {
			System.out.print(" "+arr[i]);
		}

		
		System.out.println("\nEnter item to search: ");
		int item=sc.nextInt();
		
		beg=0;end=n-1;
		
		while(beg<=end) {
			mid=(beg+end)/2;
//			System.out.println(mid);
			if(item==arr[mid]) {
				
				c++;
				break;
			}
			else if(item>arr[mid]){
				beg=mid+1;
				
			}
			else if(item<arr[mid]) {
				end=mid-1;
			}
		}
		if(c>0) {
			System.out.println("item found at "+mid);
		}else {
			System.out.println("item not found");
		}

	}

}
