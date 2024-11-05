package LabPractical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exp5 {

	public static void main(String[] args) {
		System.out.println ("Utkarsh Raj \t2310987126");
		int[] a = {10, 5, 15};
		int[] b = {20, 3, 2};
		
		System.out.println("Array 1: " + Arrays.toString(a));
		System.out.println("Array 2: " + Arrays.toString(b));
		
		System.out.print("Merge Array: ");
		int[] result = sortedMerge(a, b);
		
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] sortedMerge(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
	
		int i = 0, j = 0;
		
		List<Integer> result = new ArrayList<>();
		
		while (i < a.length && j < b.length) {
			if (a[i] <= b[j])
				result.add(a[i++]);
			else
				result.add(b[j++]);
		}
	
		while (i < a.length)
			result.add(a[i++]);
		
		while (j < b.length)
			result.add(b[j++]);
		
		return result.stream().mapToInt(Integer::intValue).toArray();
	}

}