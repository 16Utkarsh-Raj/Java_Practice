package TwoDimensionArray;

//input
//1 2 3 4
//5 6 7 8
//9 10 11 12
//13 14 15 16


//Output
//1 2 3 4 
//8 7 6 5 
//9 10 11 12 
//16 15 14 13 




//public class ArrayPattern{
//	
//	public static void main(String[] args) {
//		int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//		for(int i=0;i<arr.length;i++) {
//			if(i%2==0) {
//				for(int j=0;j<arr[i].length;j++) {
//					System.out.print(arr[i][j]+" ");
//				}
//			}
//			else {
//				for(int j=arr.length-1;j>=0;j--) {
//					System.out.print(arr[i][j]+" ");
//				}
//			}
//			System.out.println();
//		}
//	}
//}




//given array
//123
//456
//789

//output

//147
//852
//369


//public class ArrayPattern {
//
//    public static void main(String[] args) {
//        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//
//        for (int col = 0; col < arr.length; col++) {
//            if (col % 2 == 0) {
//                for (int row = 0; row < arr.length; row++) {
//                    System.out.print(arr[row][col]+" ");
//                }
//                System.out.println();
//            } else {
//                for (int row = arr.length - 1; row >= 0; row--) {
//                    System.out.print(arr[row][col]+" ");
//                }                
//                System.out.println();
//
//            }
//
//        }
//    }
//}





public class ArrayPattern {

    public static void main(String[] args) {
//        int arr[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12},{13,14,15,16}};
    	int arr[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int te=arr.length*arr[0].length;
        int sr=0;
        int sc=0;
        int er=arr.length-1;
        int ec=arr.length-1;
        
        int cnt=0;
        while(cnt<te) {
        	for(int col=sc;col<=ec;col++) {
        		System.out.print(arr[sr][col]+" ");
        		cnt++;
        	}
        	sr++;
        	for(int row=sr;row<=er;row++) {
        		System.out.print(arr[row][ec]+" ");
        		cnt++;
        	}
        	ec--;
        	for(int col=ec;col>=sc;col--) {
        		System.out.print(arr[er][col]+" ");
        		cnt++;
        	}
        	er--;
        	for(int row=er;row>=sr;row--) {
        		System.out.print(arr[row][sc]+" ");
        		cnt++;
        	}
        	sc++;
        }
    }
}
