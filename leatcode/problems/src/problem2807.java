import java.util.*;

public class problem2807 {
    ListNode  head;
    class ListNode{
        int value;
        ListNode next; 


        ListNode(int d){
            value=d;
            this.next=null;
        }
    }
    public void insert_begining(int data){
      ListNode new_node=new ListNode(data);
      new_node.next=head;
      head=new_node;
    }
    public void insert_inend(int data ){
        ListNode new_node=new ListNode(data);
        ListNode curr_node=head;
        while(curr_node.next!=null){
            curr_node=curr_node.next;
        }
        curr_node.next=new_node;
    }
    public void print_thedetails(){
    ListNode curr_node=head;
    while(curr_node!=null){
        System.out.println(curr_node.value);
        curr_node=curr_node.next;
    }
    }
    public void delete_node(int key){
        ListNode curr=head;
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
    public class ListNode{
        int val;
        ListNode next;
        
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        problem867 x = new problem867();
        ListNode result = head;
        return result;
    }
    public static void main(String[] args) {
        problem2807 obj1 = new problem2807();
        LinkedList<Integer> x1 = new LinkedList<>();
        obj1.insert_inend(18);
        obj1.insert_inend(6);
        obj1.insert_inend(10);
        obj1.insert_inend(30);
        obj1.print_thedetails();
    }
}
