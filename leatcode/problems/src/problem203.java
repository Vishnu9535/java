public class problem203 {
        static ListNode head;
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int val){
        this.val=val;
      }
      ListNode() {}
    }
    void insert(int val){
        ListNode n1=new ListNode(val);
        if(head==null){
            n1.val=val;
            head=n1;
            return;
        }
        ListNode curr=head;
        while(curr.next !=null){
            curr=curr.next;
        }
        curr.next=n1;
    }
  static   void print(ListNode head){
        ListNode curr=head;
        while(curr!=null){
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
      public ListNode removeElements(ListNode head, int val) {
        ListNode curr=head;
        while(curr!=null){
            if(head.val == val){
             head=head.next;
            curr=curr.next;
            }
            else if(curr.next!=null && curr.next.val==val){
                if(curr.next.next!=null){
               ListNode ob=curr.next.next;
                curr.next=ob;
                if(curr.next.val!=val){
                    curr=curr.next;
                }
            }
            else{
                curr.next=null;
            }            
        }
        else{
        curr=curr.next;
        }
        
    }
    print(head);
        return head;
}
    public static void main(String[] args) {
        problem203 obj1=new problem203();
        obj1.insert(7);
        obj1.insert(7);
        obj1.insert(7);
        obj1.insert(7);
        obj1.insert(7);
        obj1.insert(5);
         obj1.insert(6);
         obj1.removeElements(head, 7);
    }
}
