public class problem876 {
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
        public ListNode middleNode(ListNode head) {
            ListNode curr=head;
            int count=0;
            while(curr!=null){
                count+=1;
                curr=curr.next;
            }
            if(count % 2 != 0){
                count=count/2+1;
            }
            else{
                count=count/2;
                head=head.next;
            }
            System.out.println(count);
            for(int i=1;i < count;i++){
                head=head.next;
            }
                        

            curr=head;
        while(curr!=null){
            System.out.println(curr.val);
            curr=curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
        problem876 obj1=new problem876();
        obj1.insert_end(1);
        obj1.insert_end(2);
        obj1.insert_end(3);
        obj1.insert_end(4);
        obj1.insert_end(5);
        obj1.insert_end(6);
        obj1.middleNode(head);
    }
}
