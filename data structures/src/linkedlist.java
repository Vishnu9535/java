// import java.util.*;
// import java.io.*;
public class linkedlist {
    Node head;
    static class Node{
        int value;
        Node next;

        Node(int d){
            value=d;
            next=null;
        }
    }
    public void insertatend(int new_data){
      Node new_node=new Node(new_data);
      // System.out.println(head);
      if(head==null){
        head=new Node(new_data);
      }
      // System.out.println(head.value);
      new_node.next=null;
      // System.out.println(head.value);
      Node last=head;
      // System.out.println(last.next);
      if(last.next !=null){
        last=last.next;
        // System.out.println(last.next.value);
      }
      last.next=new_node;

    }
       public static void main(String[] args){
        
        // LinkedList<Integer> a=new LinkedList<>();
        // a.add(6);
        // a.add(8);
        // System.out.println(a);
        linkedlist l1=new linkedlist();
        // l1.head=new Node(1);
        // //System.out.println(l1.head);
        // Node second=new Node(2);
        // Node third=new Node(3);
        // l1.head.next=second;
        // // System.out.println(l1.head.next.value);
        // // l1.head.next=third;
        // // System.out.println(l1.head.next.value);
        // second.next=third;
        
        l1.insertatend(6);
        l1.insertatend(9);
        while(l1.head !=null)
        {
            System.out.println(l1.head.value+" ");
            l1.head=l1.head.next;
            
        }

        // System.out.println(l1.head.value);
        // System.out.println(l1.head);
        //system.out.println
            //system.out.println()
    }
}
