package Search;

public class ClassWork {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("hello");
		add(a,b);
		System.out.println("bye");

	}
	public static int add(int a,int b) {
		int res=a+10;
		System.out.println(res);
		int sub=sub(b,res);
		System.out.println(sub);
		multi(res);
		return sub;
	}
	public static int sub(int a,int b) {
		return 0;
	}
	
	public static void multi(int val) {
		System.out.println(val*10);
		System.out.println(val*0);
	}

}
