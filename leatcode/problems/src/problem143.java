import java.util.ArrayList;
import java.util.List;

public class problem143 {
    static ListNode head;
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
        if(head == null){
            head = new ListNode(data);
            return;
        }
        ListNode curr = head;

        while(curr.next != null){
            curr = curr.next;  
        }
        curr.next = new ListNode(data);
    }

    public void reverse_list() {
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode f = curr.next;
        while (f.next != null) {
            curr.next = prev;
            prev = curr;
            curr = f;
            f = f.next;
        }
        curr.next =prev;
        f.next = curr;
        head.next = null;
        head =f;

    }
    public void find_middle(){

    }
    public void print() {
        ListNode curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public void reorderList() {
        List<Integer> x = new ArrayList<>();
        ListNode m = head;
        while (m != null) {
            x.add(m.data);
            m = m.next;
        }
        int end = x.size() - 1;
        int start = 0;
        head = null;
        head = new ListNode(x.get(start));
        start++;
        ListNode curr = head;
        while (start < end) {
            curr.next = new ListNode(x.get(end));
            end--;
            curr = curr.next;
            curr.next = new ListNode(x.get(start));
            start++;
            curr = curr.next;
        }
        if(x.size() % 2 == 0){
            curr.next = new ListNode(start+1);
        }
    }
    public static void main(String[] args) {
        problem143 obj1 = new problem143();
        obj1.insert(1);
        obj1.insert(2);
        obj1.insert(3);
        obj1.insert(4);
        // obj1.insert(5);
        // obj1.insert(6);
        // obj1.insert(7);
        // obj1.reverse_list();
        // obj1.print();
        // List<Integer> x = new ArrayList<>();
        // x.add(1);
        // x.add(2);
        // System.out.println(x.get(x.size()-1));
        obj1.reorderList();
        obj1.print();
    }
}
