package Recursion;

public class TotalPairCoinTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=2;
		int arr[][]=new int[1][4];
		sol(arr,0,arr.length-1,0,arr[0].length-1,n,0,"");
	}
	
	public static void sol(int arr[][],int cr,int cc,int er,int ec,int tc,int cp,String ans) {
		if(tc==cp) {
			System.out.println(ans);
			return;
		}
		if(cc>ec) return;
		arr[cr][cc]=1;
		sol(arr,cr,er,cc+1,ec,tc,cp+1,ans+cr+" "+cc);//tc-total coin,cc-current column,er-end row,cp-coin placed
		arr[cr][cc]=0;
		sol(arr,cr,er,cc+1,ec,tc,cp,ans);
		}

}

//n-queens
