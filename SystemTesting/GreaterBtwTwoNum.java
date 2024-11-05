package SystemTesting;
import java.util.Scanner;
public class GreaterBtwTwoNum {

	public static void main(String[] args) {

		System.out.println("Utkarsh Raj \t2310987126\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int A=sc.nextInt();
		
		System.out.print("Enter the second number: ");
		int B=sc.nextInt();

		if ((A> 10 && A <= 50) && (B>=10 && B <=50)) {
			if (A > B)
				System.out.println(A+" is greater number");
			else
				System.out.println(B+" is greater number");
		}
		else
			System.out.println("Invalid");
		sc.close();
	}
}

