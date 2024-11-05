package Recursion;

public class ThreeCoinTossResult {

	public static void main(String[] args) {
//        tossThreeCoins("", 3);
//    }
//
//    public static void tossThreeCoins(String outcomeSoFar, int remainingTosses) {
//        if (remainingTosses == 0) {
//            // All tosses are done, print the outcome
//            System.out.println(outcomeSoFar);
//        } else {
//            // Toss a head (H)
//            tossThreeCoins(outcomeSoFar + "H", remainingTosses - 1);
//
//            // Toss a tail (T)
//            tossThreeCoins(outcomeSoFar + "T", remainingTosses - 1);
//        }
//    }
//
//}


int n=2;
sol(n,"");
}
public static void sol(int n,String ans) {
	if(n==0) {
		System.out.println(ans);
		return;
	}
	sol(n-1,ans+"h");
	sol(n-1,ans+"t");
}
}


