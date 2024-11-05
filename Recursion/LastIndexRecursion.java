package Recursion;

public class LastIndexRecursion {

	public static void main(String[] args) {
		int arr[]= {1,3,4,56,7,7};
		int trgt=7;
		int res=sol(0,arr,trgt);
		System.out.println(res);

	}
	public static int sol(int indx,int arr[],int trgt) {
		if(indx>=arr.length)
			return -1;
		int res=sol(indx+1,arr,trgt);
		if(res==-1) {
			if(arr[indx]==trgt)
				return indx;
		}
		return res;
	}

}
