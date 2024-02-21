public class problem143 {
    ListNode head;
        class ListNode{
            ListNode next;
            int data;
            ListNode(int data)
            {
                this.data = data;
                next = null;
            }

        }
    public void insert(int data){
        if(head === null){
            head = new ListNode(data);
            return;
        }
        ListNode curr = head;

        while(curr.next != null){
            curr = curr.next;  
        }
        curr.next = new ListNode(data);
    }
    public void print()
    {
        ListNode curr = head ;
        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    public void reorderList(ListNode head) {
        ListNode curr = head;

      
    }
    public static void main(String[] args) {
        
    }
}
