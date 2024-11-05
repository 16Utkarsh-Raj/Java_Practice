//package LabPractical;
//
//public class Exp01 {
//	class DynamicArray{
//
//    private int array[];
//    private int count;
//
//    public DynamicArray(int length)
//    {
//        array = new int[length];
//        count = 0;
//    } 
//    public int size() {
//        return count;
//      }
//    
//    public int get(int index) {
//        if (index >=0 && index< count) {
//          return array[ index];
//        }
//        else {
//        	return -1;
//        }
//      }
//    
//    public void add(int element)
//    {
//        if (count == array.length) {
//        	int[] newArray=new int[2*array.length];
//        	for(int i=0;i<count;i++) {
//        		newArray[i]=array[i];
//        	}
//        	array=newArray;
//        }
//        array[count] = element;
//        count++;
//    }
//    public int remove(int index)
//    {
//        if (index>=0&&index<count ) {
//            for (int i = index; i < count - 1; i++) {
//                array[i] = array[i + 1];
//            }
//            count--;
//            return index;
//        }
//        else {
//        	return -1;
//        }
//    }
//    
//    public void resize(int capacity) {
//        
//        if (capacity < count) {
//          throw new IllegalArgumentException("Capacity cannot be less than the current size");
//        }
//        int[] newArray = new int[capacity];
//        for (int i = 0; i < count; i++) {
//          newArray[i] = array[i];
//        }
//        array = newArray;
//      }
//	}
//    public static void main(String[] args)
//    {
//    	Exp01 x=new Exp01();
//        DynamicArray da = x.new DynamicArray(9);
//        da.add(1);
//        da.add(2);
//        da.add(3);
//        da.add(4);
//        da.add(5);
//        da.add(6);
//        da.add(7);
//        da.add(8);
//        da.add(9);
// 
//        // print all array elements after add 9 elements
//        System.out.println("Size: " + da.size());
//        System.out.println("Elements of array:");
//        for (int i = 0; i < da.size(); i++) {
//            System.out.print(da.get(i) + " ");
//        }
//        System.out.println("\n");
//
//        da.add(15);
//        System.out.println("Size:"+da.size());
//        System.out.println("Elements of array:");
//        for (int i = 0; i < da.size(); i++) {
//            System.out.print(da.get(i) + " ");
//        }
// 
//        System.out.println("\n");
//        
//        da.remove(2);
//        System.out.println("Size:"+da.size());
//        System.out.println("Elements of array:");
//        for (int i = 0; i < da.size(); i++) {
//            System.out.print(da.get(i) + " ");
//        }
// 
//        System.out.println("\n");
//        da.resize(15);
//        System.out.println("Size:" +da.size());
//        System.out.println("Elements of array:");
//        for(int i=0;i<da.size();i++) {
//        	System.out.print(da.get(i)+" ");
//        }
//    }
//}
//



package LabPractical;

class DynamicArray {
	private int[] array;
	private int size;
	private int capacity;
	
	public DynamicArray(int capacity) {
		this.capacity = capacity;
		this.size = 0;
		this.array = new int[capacity];
	}
	
	public int get(int index) {
		if (index < 0 || index >= size) 
			throw new IndexOutOfBoundsException("Index out of bounds: " + index);
		  
		return array[index];
	}
	
	public void add(int element) {
		if (size == capacity) 
			resize(2 * capacity);
		    
		array[size++] = element;
	}
	
	public void remove(int index) {
		if (index < 0 || index >= size) 
			throw new IndexOutOfBoundsException("Index out of bounds: " + index);
		    
		for (int i = index + 1; i < size; i++) 
		array[i - 1] = array[i];
		    
		size--;
		    
		if (size <= capacity / 4) 
			resize(capacity / 2);
	}
	
	private void resize(int newCapacity) {
		int[] newArray = new int[newCapacity];
		    
		for (int i = 0; i < size; i++) 
		newArray[i] = array[i];
		    
		array = newArray;
		capacity = newCapacity;
	}
	
	public void print() {
		System.out.print("[");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i]);
			if (i < size - 1) 
				System.out.print(", ");
		}
		System.out.println("]");
	}
}

public class Exp01 {

	public static void main(String[] args) {
		System.out.println ("Utkarsh Raj \t2310987126");
		DynamicArray da = new DynamicArray(4);
		da.add(10);
		da.add(20);
		da.add(30);
		da.print();
		
		da.add(40);
		da.print();
		
		da.remove(1);
		da.print();
	}

}