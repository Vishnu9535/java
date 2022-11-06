// import java.util.*;
import java.io.*;
public class linkedlist {
    Node  head;
    class Node{
        int value;
        Node next; 

        Node(int d){
            value=d;
            next=null;
        }
    }
    public void insert_begining(int data){
      Node new_node=new Node(data);
      new_node.next=head;
      head=new_node;
    }
    public void insert_inend(int data ){
        Node new_node=new Node(data);
        Node curr_node=head;
        while(curr_node.next!=null){
            curr_node=curr_node.next;
        }
        curr_node.next=new_node;
    }
    public void print_thedetails(){
    Node curr_node=head;
    while(curr_node!=null){
        System.out.println(curr_node.value);
        curr_node=curr_node.next;
    }
    }
    public void delete_node(int key){
        Node curr=head;
        if(head.value==key){
           head=curr.next;
           curr.next=null;
        }
        else{
          while(curr.next!=null){
            if(curr.next.value==key){
                curr.next=head;
                curr.next=null;
                break;
            }
            curr=curr.next;
          }
        }
    }
     public static void main(String[] args){
          linkedlist obj1=new linkedlist();
          obj1.insert_begining(8);
          obj1.insert_begining(6);
          obj1.insert_begining(4);
          obj1.insert_inend(5);
          obj1.insert_inend(1);
          obj1.delete_node(5);
          obj1.print_thedetails();
    }
}
