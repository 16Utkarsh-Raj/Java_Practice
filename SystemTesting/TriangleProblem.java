//package SystemTesting;
//import java.util.Scanner;
//
//public class TriangleProblem {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Utkarsh Raj \t2310987126");
//		
//        System.out.print("Enter the lengths of the sides of a triangle: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        sc.close();
//        
//        if (a > 0 && b > 0 && c > 0 && a < b + c && b < a + c && c < a + b) {
//            if (a == b && b == c)
//                System.out.println("Equilateral Triangle");
//            else if (a == b || b == c || c == a)
//                System.out.println("Isosceles Triangle");
//            else
//                System.out.println("Scalene Triangle");
//        }
//        else
//            System.out.println("Not a Triangle");
//	}
//}
//
//



package SystemTesting;
import java.util.Scanner;

public class TriangleProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Utkarsh Raj \t2310987126");
		
        System.out.print("Enter the lengths of the sides of a triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        
        if((a>=1 && a<=50) && (b>=1 && b<=50) && (c>=1 && c<=50)) {
	        if(a < b + c && b < a + c && c < a + b) {
	            if (a == b && b == c)
	                System.out.println("Equilateral Triangle");
	            else if (a == b || b == c || c == a)
	                System.out.println("Isosceles Triangle");
	            else
	                System.out.println("Scalene Triangle");
	        }
	        else
	        	System.out.println("Not a Triangle");
        }
        else
        	System.out.println("Invalid");
	}
}
