package LabPractical;

class DAC {
	public static int max(int[] arr, int low, int high) {
		if (low == high)
			return arr[low];
		
		int mid = (low + high) / 2;
		int leftMax = max(arr, low, mid);
		int rightMax = max(arr, mid + 1, high);
		
		return Math.max(leftMax, rightMax);
	}
	
	public static int min(int[] arr, int low, int high) {
		if (low == high)
			return arr[low];
		
		int mid = (low + high) / 2;
		int leftMin = min(arr, low, mid);
		int rightMin = min(arr, mid + 1, high);
		
		return Math.min(leftMin, rightMin);
	}
}

public class Exp3 {

	public static void main(String[] args) {
		System.out.println ("Utkarsh Raj \t2310987126");
		int[] arr = {70, 250, 50, 80, 140, 12, 14};

		int max = DAC.max(arr, 0, arr.length - 1);
		int min = DAC.min(arr, 0, arr.length - 1);

		System.out.println("The maximum element is: " + max);
		System.out.println("The minimum element is: " + min);
	}

}
