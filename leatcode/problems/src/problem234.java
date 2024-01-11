public class problem234 {
    ListNode head;
    public class ListNode{
        ListNode  next;  
        int data;
        ListNode(int data){
            this.data = data;
            this.next= null;
        }
    }
    void insert(int data){
        if(head == null){
            head = new ListNode(data);  
        }
        else{
            ListNode curr = head ;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new ListNode(data);
        }
    }
    void print(){
        ListNode curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr= curr.next;
        }

    }
    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        boolean c= true;
        String check = "";
        while (curr != null) {
            check =check+ String.valueOf(curr.data);
            curr = curr.next;
        }
        int i=0;
        int j= check.length()-1;
        while (i < j) {
            if(check.charAt(i) ==  check.charAt(j))
            {
                i++;
                j--;
                continue;
            }
            else{
                c = false;
                break;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        problem234 obj = new problem234();
        obj.insert(1);
        obj.insert(2);
        obj.insert(1);
        obj.print();
    }
}
