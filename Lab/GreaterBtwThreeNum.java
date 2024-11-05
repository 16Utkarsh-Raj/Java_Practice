//package Lab;
//import java.util.Scanner;
//public class GreaterBtwThreeNum {
//
//	public static void main(String[] args) {
//		System.out.println("Utkarsh Raj \t2310987126");
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter the first number: ");
//		int A=sc.nextInt();
//		
//		System.out.print("Enter the second number: ");
//		int B=sc.nextInt();
//		
//		System.out.print("Enter the third number: ");
//		int C=sc.nextInt();
//		if(A>B) {
//			if(A>C)
//				System.out.println(A+" is greatest number");
//			else
//				System.out.println(C+" is greatest number");
//		}
//		else if(B>C)
//			System.out.println(B+" is greatest number");
//		else
//			System.out.println(C+" is greatest number");
//		sc.close();
//	}
//}




package Lab;
import java.util.Scanner;
public class GreaterBtwThreeNum {

	public static void main(String[] args) {
		System.out.println("Sakshi Verma \t2310987099");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int A=sc.nextInt();
		
		System.out.print("Enter the second number: ");
		int B=sc.nextInt();
		
		System.out.print("Enter the third number: ");
		int C=sc.nextInt();
		
		if((A>=1 && A<=100) && (B>=1 && B<=100) && (C>=1 && C<=100)) {
			if(A>B) {
				if(A>C)
					System.out.println(A+" is greatest number");
				else
					System.out.println(C+" is greatest number");
			}
			else if(B>C)
				System.out.println(B+" is greatest number");
			else
				System.out.println(C+" is greatest number");
		}
		else
        	System.out.println("Invalid");
		sc.close();
	}
}
