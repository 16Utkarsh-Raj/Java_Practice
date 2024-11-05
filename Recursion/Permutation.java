package Recursion;

public class Permutation {

	public static void main(String[] args) {
	
		String str="abc";
		sol(str,"");
	}
	public static void sol(String str,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			String rem=str.substring(0,i)+str.substring(i+1);
			sol(rem,ans+ch);
		}
	}

}
