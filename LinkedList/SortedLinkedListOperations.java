package LinkedList;

public class SortedLinkedListOperations {

	public static void main(String[] args) {
        LinkedLists list = new LinkedLists();
        list.add(4);
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(14);
        
        list.print();
        list.remove(14);
        
        list.print();
        
    }
}

class LinkedLists{
    Nodes head;
    LinkedLists(){
        head=null;
    }
    void print(){
        Nodes curr=head;
        while(curr!=null){
            System.out.println(curr.val);
            curr=curr.next;
        }
    }
    
    void add(int x){
        Nodes node = new Nodes(x);
        if(head==null){
            head=node;
        }else if(x<head.val){
            node.next = head;
            head = node;
        }else{
            Nodes curr = head;
            while(curr!=null && curr.next!=null && curr.next.val<x){
                curr = curr.next;
            }
            node.next=curr.next;
            curr.next=node;
        }
    }
    
    void remove(int x){
        if(!find(x)) return;
        
        if(head.val==x){
            head=head.next;
            return;
        }
        
        Nodes cur=head;
        while(cur.next.val<x){
            cur=cur.next;
        }
        cur.next=cur.next.next;
    }
    
    boolean find(int x){
        Nodes cur=head;
        while(cur!=null){
            if(cur.val==x){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    
    
    
    
}

class Nodes{
    int val;
    Nodes next;
    Nodes(int val){
        this.val = val;
        next=null;
    }
}