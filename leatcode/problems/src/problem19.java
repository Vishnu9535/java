public class problem19 {
     static ListNode head;
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    void insert_end(int val){
        ListNode n1=new ListNode(val);
        if(head ==null){
            head=n1;
            return;
        }
        ListNode curr=head;
        while(curr.next !=null){
            curr=curr.next;
        }
        curr.next=n1;
    }
    void display(){
        ListNode curr=head;
        while(curr!=null){
            System.out.println(curr.val);
            curr=curr.next;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        int no=0;
        while(curr != null){
            no=no+1;
            curr=curr.next;
        }
        
        no=no-n;
        if(no<=0){
            head=null;
            return head;
        }
        curr=head;
        for(int i=0;i<no-1;i++){
            curr=curr.next;
        }
        ListNode temp;
        if(curr !=null && curr.next.next!=null){
            temp=curr.next.next;
            curr.next=temp;
        }
        else{
            curr.next=null;
        }
        curr=head;
        // while(curr!=null){
        //     System.out.println(curr.val);
        //     curr=curr.next;
        // }
        return head;
    }
    public static void main(String[] args) {
        problem19 obj1=new problem19();
        obj1.insert_end(1);
        obj1.insert_end(2);
        obj1.insert_end(3);
        obj1.insert_end(4);
        obj1.insert_end(5);
        int n=2;
        // obj1.insert_end(6);
        obj1.removeNthFromEnd(head, n);
    }
}
