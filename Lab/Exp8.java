package Lab;
import java.util.Scanner;
public class Exp8 {

	public static void main(String[] args) {
		System.out.println("Utkarsh Raj  \t2310987126");

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int A = sc.nextInt();

		System.out.print("Enter the second number: ");
		int B = sc.nextInt();

		System.out.print("Enter the third number: ");
		int C = sc.nextInt();

		sc.close();
		if (A > B) {
			if (A > C)
				System.out.println(A + " is greatest number");
			else
				System.out.println(C + " is greatest number");
		} else {
			if (B > C)
				System.out.println(B + " is greatest number");
			else
				System.out.println(C + " is greatest number");
		}
	}
}

