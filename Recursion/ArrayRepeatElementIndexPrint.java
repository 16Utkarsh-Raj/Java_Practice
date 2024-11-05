//package Recursion;
//
//public class ArrayRepeatElementIndexPrint {
//
//	public static void main(String[] args) {
//		int arr[]= {1,2,3,1,2,3,1};
//		int trgt=1;
//		int res=sol(0,arr,trgt,0);
//
//		System.out.println(res);
//	}
//	public static int sol(int indx,int arr[],int trgt,int count) {
//		if(arr.length==indx) 
//		{
//			return count;
//		}
//		if(arr[indx]==trgt) {
//			int res=sol(indx+1,arr,trgt,count+1);
//			return res;
//		}
//		else {
//			int res=sol(indx+1,arr,trgt,count);
//			return res;
//		}
//	}
////	return res;
//
//}



//repeated array element index stored in a form of array


package Recursion;

public class ArrayRepeatElementIndexPrint {

	
	public static void main(String[] args) {
		int arr[]= {1,2,3,1,2,3,1};
		int trgt=1;
		int res[]=sol(0,arr,trgt,0);
		
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
		
	}
	public static int[] sol(int indx,int arr[],int trgt,int count) {
		if(indx>=arr.length) 
		{
			int res[]=new int[count];
			return res;
		}
		if(arr[indx]==trgt) {
			int res[]=sol(indx+1,arr,trgt,count+1);
			res[count]=indx;
			return res;
		}
		else {
			int res[]=sol(indx+1,arr,trgt,count);
			return res;
		}
	}

}





