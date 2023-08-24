import java.util.List;

import org.w3c.dom.Node;

class problem61{
    ListNode head;
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val= val;
            next = null;
        }

    }
    public void insert_begining(int data){
        if(head==null){
            head=new ListNode(data);
            head.next=null;
        }
        else{
            ListNode curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=new ListNode(data);
        }
    }
    public static void main(String[] args) {
        
    }
}