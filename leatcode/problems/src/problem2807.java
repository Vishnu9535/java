import java.util.*;

public class problem2807 {
    ListNode head;
    class ListNode{
        int value;
        ListNode next;

        ListNode (int value) {
            this.value = value;
            this.next = null;
        }
    }
    void insert_end(int data){
        if(head== null){
            head = new ListNode(data);
        } 
        else{
            ListNode curr = head;

            while (curr.next != null) {
                
            }

        }    
        
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
