package Recursion;

public class TraverseInGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[5][4];
		int ans=sol(arr,0,arr.length-1,0,arr[0].length-1);
		System.out.println(ans);

	}
//	c-current
//	r-row
//	c-column
//	e-end
	public static int sol(int arr[][],int cr,int er,int cc,int ec,String ans) {
		if(cr==er&&cc==ec)
		{
			return 1;
		}
		
		
		if(cr<0||cc<0||cr>er||cc>ec||arr[cr][cc]!=0)
			return 0;
		if(cr==er&&cc==ec) {
			System.out.println(ans+" "+cr+" "+cc);
			return 1;
		}
		int cnt=0;
		arr[cr][cc]=1;
		cnt+=sol(arr,cr-1,er,cc,ec,ans+cr+cc+" ");
		cnt+=sol(arr,cr+1,er,cc,ec,ans+cr+cc+" ");
		cnt+=sol(arr,cr,er,cc-1,ec,ans+cr+cc+" ");
		cnt+=sol(arr,cr,er,cc+1,ec,ans+cr+cc+" ");
		cnt+=sol(arr,cr-1,er,cc-1,ec,ans+cr+cc+" ");
		cnt+=sol(arr,cr-1,er,cc+1,ec,ans+cr+cc+" ");
		cnt+=sol(arr,cr+1,er,cc+1,ec,ans+cr+cc+" ");
		cnt+=sol(arr,cr+1,er,cc-1,ec,ans+cr+cc+" ");
		arr[cr][cc]=0;
		return cnt;
	}

}
