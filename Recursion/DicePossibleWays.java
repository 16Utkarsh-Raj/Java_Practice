package Recursion;
import java.util.ArrayList;
import java.util.List;


public class DicePossibleWays {

	 public static void main(String[] args) {
	        int d = 5;
	        int N = 3;

	        List<List<Integer>> outcomes = GA(d, N);
	        PAO(outcomes);
	    }

	    private static List<List<Integer>> GA(int d, int faces) {
	        List<List<Integer>> result = new ArrayList<>();
	        List<Integer> currentOutcome = new ArrayList<>();
	        CAO(d, faces, currentOutcome, result);
	        return result;
	    }

	    private static void CAO(int RD, int faces, List<Integer> CO, List<List<Integer>> result) {
	        if (RD == 0) {
	            result.add(new ArrayList<>(CO));
	            return;
	        }

	        for (int i = 1; i <= faces && RD - i >= 0; i++) {
	        	CO.add(i);
	            CAO(RD - i, faces, CO, result);
	            CO.remove(CO.size() - 1);
	        }
	    }

	    private static void PAO(List<List<Integer>> outcomes) {
	        for (List<Integer> outcome : outcomes) {
	            System.out.println(outcome);
	        }
	    }

}

