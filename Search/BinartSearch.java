package Search;

import java.util.Scanner;

public class BinartSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,45,67,84,90,100};
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int lo=0;
		int hi=arr.length-1;
		int idx=-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(n==arr[mid]) {
				idx=mid;
				break;
			}
			else if(n>arr[mid]) {
				lo=mid+1;
			}else {
				hi=mid-1;
			}
		}
		System.out.println(idx);
	}

}
