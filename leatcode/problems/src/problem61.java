import java.util.List;
class problem61{
   public static ListNode head;
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
    void print(){
        if(head==null){
            System.out.println("no elements");
            return;
        }
        else{
        ListNode curr=head;
        while(curr!=null){
            System.out.println(curr.val);
            curr=curr.next;
        }
        }
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k ==0){
            return head;
        }
        ListNode temp = head ;
        int length = 1;
        while (temp.next != null){
            temp = temp.next;
            length = length+1;
        }
        while(k >= length){
            k = k - length;
        }
        if(k == 0){
            return head;
        }
        temp.next =head;
        // System.out.println(length-k);
        ListNode p = head;
        for(int i =0; i< length-k-1;i++){
            p = p.next;
        }
        head = p.next ;
        p.next=null;
        // ListNode tem= head;
        //  while(tem != null){
        //      System.out.println(tem.val);
        //      tem = tem.next;
        //  }
        return head;
    }
    public static void main(String[] args) {
        problem61 obj = new problem61();
        obj.insert_begining(1);
        obj.insert_begining(2);
        obj.insert_begining(3);
        obj.insert_begining(4);
        obj.insert_begining(5);
        // obj.print();
        obj.rotateRight(head,3);
    }
}