//package LabPractical;
//import java.util.ArrayList;
//
//public class Exp02 {
//    
//    public static ArrayList<Integer> SortedMerge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
//        ArrayList<Integer> mergedList = new ArrayList<Integer>();
//        int index1 = 0;
//        int index2 = 0;
//        while (index1 < list1.size() && index2 < list2.size()) {
//            if (list1.get(index1) < list2.get(index2)) {
//                mergedList.add(list1.get(index1));
//                index1++;
//            } else {
//                mergedList.add(list2.get(index2));
//                index2++;
//            }
//        }
//        while (index1 < list1.size()) {
//            mergedList.add(list1.get(index1));
//            index1++;
//        }
//        while (index2 < list2.size()) {
//            mergedList.add(list2.get(index2));
//            index2++;
//        }
//        return mergedList;
//    }
//    
//    public static void main(String[] args) {
//        ArrayList<Integer> list1 = new ArrayList<Integer>();
//        ArrayList<Integer> list2 = new ArrayList<Integer>();
//
//      list1.add(3);
//      list1.add(5);
//      list1.add(7);
//      list1.add(9);
//      list2.add(2);
//      list2.add(4);
//      list2.add(6);
//      list2.add(8);
//
//        ArrayList<Integer> result = SortedMerge(list1, list2);
//        System.out.println("Sorted Merged List:" +result);
//    }
//}

package LabPractical;
import java.util.ArrayList;

public class Exp02 {
    
    public static ArrayList<Integer> SortedMerge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> mergedList = new ArrayList<Integer>();
        int index1 = 0;
        int index2 = 0;
        
        while (index1 < list1.size() && index2 < list2.size()) {
            if (list1.get(index1) < list2.get(index2))
                mergedList.add(list1.get(index1++));
            else
                mergedList.add(list2.get(index2++));
        }
        
        while (index1 < list1.size())
            mergedList.add(list1.get(index1++));
        
        while (index2 < list2.size()) 
            mergedList.add(list2.get(index2++));
        
        return mergedList;
    }
    
    public static void main(String[] args) {
    	System.out.println ("Utkarsh Raj \t2310987126");
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list1.add(3);
		list1.add(5);
		list1.add(7);
		list1.add(9);
		list2.add(2);
		list2.add(4);
		list2.add(6);
		list2.add(8);
		
		System.out.println("List 1: "+list1);
		System.out.println("List 2: "+list2);

		
		ArrayList<Integer> result = SortedMerge(list1, list2);
		System.out.println("Sorted Merged List: " +result);
    }
}
