package Recursion;

public class GenerateParanthesis {

	public static void main(String[] args) {
		int n=2;
		sol(n,0,0,"");

	}
	public static void sol(int n,int ob,int cb,String ans) {
		
		if(ob>n) return;
		if(ob+cb==2*n) {
			System.out.println(ans);
			return;
		}
		if(cb>ob) return;
//		if(ob>n) return;
		sol(n,ob+1,cb,ans+"(");
		sol(n,ob,cb+1,ans+")");
	}

}
