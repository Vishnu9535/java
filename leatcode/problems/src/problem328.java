public class problem328 {
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
    public ListNode oddEvenList(ListNode head) {
        ListNode curr = head;
        ListNode odd = null;
        ListNode o1 = null;
        ListNode even = null;
        ListNode e1 = null;
        while(curr!= null){
            if(curr.val % 2 != 0){
                if(odd == null){
                    odd = curr;
                    o1 = odd;
                }
                else{
                    o1.next = curr;
                    o1=o1.next;
                }
            }
            else{
                if(even == null){
                    even = curr;
                    e1 = even;
                }
                else{
                    e1.next = curr;
                    e1=e1.next;
                }
            }
            curr = curr.next;
        }
        problem328 obj1 = new problem328();
        o1.next = even;
        e1.next=null;
        obj1.display(odd);

        return odd;
    }
        public ListNode oddEvenList1(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode odd = head;
        ListNode o1 = odd;
        ListNode even = head.next;
        ListNode e1 = even;
        while(e1 !=null && e1.next !=null && o1 !=null && o1.next!= null){
            o1.next=o1.next.next;
            o1 = o1.next;
            e1.next = e1.next.next;
            e1 = e1.next;
        }
        problem328 obj1 = new problem328();
        o1.next = even;
        obj1.display(odd);
        return odd;

        }

    public static void main(String[] args) {
        problem328 obj1 = new problem328();
        obj1.insert_at_the_end1(1);
        obj1.insert_at_the_end1(2);
        obj1.insert_at_the_end1(3);
        obj1.insert_at_the_end1(4);
        obj1.insert_at_the_end1(5);
        // obj1.insert_at_the_end1(6);
        // obj1.insert_at_the_end1(7);
        // obj1.insert_at_the_end1(8);
        // obj1.display(head);
        obj1.oddEvenList1(head);
    }
}
