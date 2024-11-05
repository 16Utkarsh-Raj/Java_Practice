package Search;

public class FunctionDemo {
	public static void main(String[] args) {
		int v1=10;
		int v2=20;
		int sum=v1+v2;
		int res=add(v1,v2);
		System.out.println(res);
	}
//	public static int add(int v1,int v2) {
//		int sum=v1+v2;
//		return sum;
//	}
	public static int add(int v1,int v2) {
		int sum=v1+v2;
		int sub=sub(sum,v2);
		System.out.println(sub);
		return sub;
	}
	public static int sub(int v1,int v2) {
		int res=v1-v2;
		System.out.println("hello");
		return res;
	}
//jbb jbb function ki call lagti tob tbb ekk stack frame banti hai
//	agr kisi frame me return ata hai to iska matab uss stack frame ka kaam khtm
}
 