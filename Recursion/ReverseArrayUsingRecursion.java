package Recursion;

import java.util.ArrayList;

public class ReverseArrayUsingRecursion {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		int n=list.size()-1;
		for (int i=0; i<list.size()/2; i++) {
			int temp=list.get(i);
			list.set(i, list.get(n));
			list.set(n, temp);
			n--;
		}
		
		for (int i=0; i<list.size(); i++)
			System.out.print(list.get(i)+" ");
		
	}

}

