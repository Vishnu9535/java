public class problem206 {
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
        public ListNode reverseList(ListNode head) {
        ListNode reverse = null;
        ListNode curr=head;
        while(curr!=null){
            ListNode n1=new ListNode(curr.val);
                n1.next=reverse;
                reverse=n1;
            curr=curr.next;
       }
       print(reverse);
       return reverse;
    }
     public static void main(String[] args) {
        problem206 obj1=new problem206();
        obj1.insert(1);
        obj1.insert(2);
        obj1.insert(3);
        obj1.insert(4);
        obj1.insert(5);
        // print(head);
        obj1.reverseList(head);
    }
}
