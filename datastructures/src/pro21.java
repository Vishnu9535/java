public class pro21 {
    static Node head;
    static Node head2;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
}
    public void insert(int data){
        Node n1=new Node(data);
        if(head==null){
        head=n1;
        head.next=null;
        return;
        }
        n1.next=head;
        head=n1;
    }
    public void insert2(int data){
        Node n1=new Node(data);
        if(head2==null){
        head2=n1;
        head2.next=null;
        return;
        }
        n1.next=head2;
        head2=n1;
    }
    public Node mergeTwoLists(Node list1, Node list2) {
        Node result=new Node(0);
        Node curr=result;
        while(list1!=null && list2!=null){
            if(list1.data>list2.data){
                curr.next=list1;
                list1=list1.next;
                curr=curr.next;
            }
            else if(list1.data==list2.data){
                curr.next=list1;
                curr=curr.next;
                curr.next=list2;
                curr=curr.next;
                list1=list1.next;
                list2=list2.next;
            }
            else if(list1.data<list2.data){
                curr.next=list2;
                list2=list2.next;
                curr=curr.next;
            }
        }

        while (list1!=null){
            curr.next=list1;
            list1=list1.next;
            curr=curr.next;
        }
        while (list2!=null){
            curr.next=list2;
            list2=list2.next;
            curr=curr.next;
        }
        return result;
    }
    public void diaplay(Node n1){
        Node cur=n1;
      if(cur!=null){
        System.out.println(cur.data);
        diaplay(cur.next); 
      }
    }
    public int factorial(int n){
        if (n == 0) {
            int x= 1;
            System.out.println(x);
            return x;
          } else {
            int y= n * factorial(n - 1);
            System.out.println(y);
            return y;
          }
    }
    public static void main(String[] args) { 
        pro21 obj1=new pro21();
        obj1.insert(8);
        obj1.insert(7);
        obj1.insert(6);
        obj1.insert(5);
        obj1.insert2(6);
        obj1.insert2(5);
        // obj1.diaplay(head);
        // obj1.diaplay(head2);

        Node x=obj1.mergeTwoLists(head,head2);
        obj1.diaplay(x);
        // obj1.factorial(5);
    }
}


