package TwoDimensionArray;

import java.util.Scanner;

public class FirstTwoDimensionArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		int arr[][]=new int[i][j];
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				 arr[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
