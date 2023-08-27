import java.util.List;


public class problem2095 {
    public static ListNode head;
    public class ListNode{
        ListNode next;
        int val;
        ListNode(int val){

            this.val = val;
        }
    }
    void insert_at_the_end1(int data){
        ListNode n1=new ListNode(data);
        if(head ==null){
            head=n1;
            return;
        }
        ListNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=n1;
    }
    void display(ListNode head){
        ListNode curr= head ;
        if(curr!=null){
            System.out.println(curr.val);
            display(curr.next);
        }
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next ==null){
            return null;
        }
        ListNode curr = head;
        int length = 0;
        while(curr!= null){
            length++;
            curr= curr.next;
        }
        curr = head;
        int x = length/2;
        for(int i=0;i < x-1;i++){
            curr = curr.next;
        }
        curr.next= curr.next.next;
        return head;
    }
    public static void main(String[] args) {
        problem2095 obj1 = new problem2095();
        obj1.insert_at_the_end1(1);
        obj1.insert_at_the_end1(2);
        obj1.insert_at_the_end1(3);
        obj1.insert_at_the_end1(4);
        obj1.insert_at_the_end1(5);
        obj1.insert_at_the_end1(6);
        obj1.insert_at_the_end1(7);
        // obj1.insert_at_the_end1(8);
        // obj1.display(head);
        obj1.deleteMiddle(head);

    }
}

