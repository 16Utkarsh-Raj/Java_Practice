package Search;

public class KokoBanana {

	public static void main(String[] args) {
		int[] arr ={3,6,7,11,12};
	
		int res = minEatingSpeed(arr,8);
		System.out.println(res);
	}
	
	
	public static int minEatingSpeed(int[] piles,int h) {
		int res=sol(piles,h);
		return res;
	}
	
	public static int sol(int arr[],int hr) {
		int lo=1;
		int hi=1;
		for(int i=0;i<arr.length;i++) {
			hi=Math.max(hi,arr[i]);
		}
		int ans=0;
		while(lo<=hi) 
		{
			int mid=(lo+hi)/2;
			if(isItPossible(arr,hr,mid)==true) 
			{
				hi=mid-1;
				ans=mid;
			
			}
			else{
				lo=mid+1;
			}
		}
		return ans;
	}
	
	public static boolean isItPossible(int arr[],int hr,int mid) {
		int hl=hr;
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
			if(temp<=mid)
				hl=hl-1;
			else {
				if(temp%mid!=0) {
					int rem=temp/mid+1;
					hl=hl-rem;
				}
				else {
					int rem=temp/mid;
					hl=hl-rem;
				}
			}
			if(hl<0) return false;
		}
		return true;
	}
}
