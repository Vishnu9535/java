import java.util.*;

public class problem2807 {
    static ListNode head;
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
                curr = curr.next;
            }
            curr.next= new ListNode(data);

        }    
        
    }
    void print(){
        ListNode curr = head;
        while (curr!=null) {
            System.out.println(curr.value);
            curr = curr.next;
        }
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        problem867 x = new problem867();
        ListNode result = head;
        while (result.next != null){
            int a = result.value;
            int b = result.next.value;
            int c = find_gcd(a, b);
            ListNode temp=result.next;
            result.next = new ListNode(c);
            result = result.next;
            result.next = temp;
            result = result.next;
        }
        return head;
    }
    public static int find_gcd(int a , int b){
        if (b == 0) {
            return a;
        } else {
            return find_gcd(b, a % b);
        }
    }
    public static void main(String[] args) {
        problem2807 obj1 = new problem2807();
        LinkedList<Integer> x1 = new LinkedList<>();
        obj1.insert_end(18);
        obj1.insert_end(6);
        obj1.insert_end(10);
        obj1.insert_end(3);
        obj1.insertGreatestCommonDivisors(head);
        obj1.print();
    }
}
