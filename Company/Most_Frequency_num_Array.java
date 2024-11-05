package Company;

import java.util.Scanner;

public class Most_Frequency_num_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int i,j;
		System.out.println("Enter number of element in array: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array element is: ");
		for(i=0;i<n;i++) {
			System.out.print(" "+arr[i]);
		}
		
		int max_count = 0;
	      int maxfreq = 0;
	       
	      //Logic implementation
	      for (i = 0; i < n; i++){
	         int count = 0;
	         for (j = 0; j < n; j++){
	            if (arr[i] == arr[j]){
	               count++;
	            }
	         }
	        
	         if (count > max_count){
	            max_count = count;
	            maxfreq = arr[i];
	         }
	      }
	      //print the result
	      System.out.println("Most frequent element is: " + maxfreq);

	}

}
