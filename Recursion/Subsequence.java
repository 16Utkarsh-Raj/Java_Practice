package Recursion;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="123";
		sol(str,0,"");
	}
	public static void sol(String str,int indx,String ans) {
		if(str.length()==indx) {
			System.out.println(ans);
			return;
		}
		char ch=str.charAt(indx);
		sol(str,indx+1,ans+ch);
		sol(str,indx+1,ans);
	}

}

