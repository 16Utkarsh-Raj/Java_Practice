package Lab;
import java.util.Scanner;
public class Exp7 {

	public static void main(String[] args) {
		System.out.println("Sakshi Verma  \t2310987099");
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int A = sc.nextInt();

		System.out.print("Enter the second number: ");
		int B = sc.nextInt();

		sc.close();
		if (A > B)
			System.out.println(A + " is greater number");
		else
			System.out.println(B + " is greater number");
	}

}

