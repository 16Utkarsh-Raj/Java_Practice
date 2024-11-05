package LinkedList;
//package recursion;
import java.util.LinkedList;


public class SortedLinkedList {

    public static void main(String[] args) {
        Hello list = new Hello();
        list.insert(3);
        list.insert(1);
        list.insert(4);
        list.insert(2);

        list.print();
    }
}

class Hello {
    LinkedList<Integer> list;

    Hello() {
        list = new LinkedList<>();
    }

    void insert(int x) {
        int index = 0;
        while (index < list.size() && list.get(index) < x) {
            index++;
        }
        list.add(index, x);
    }

    void print() {
        for (int num : list) {
            System.out.println(num);
        }
    }
}
