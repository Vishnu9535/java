public class problem21 {
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
    void mearge(Node head,Node head1){
        Node curr1=head;
        Node curr2=head2;
    }
    public void diaplay(Node n1){
        Node curr=n1;
      if(curr!=null){
        System.out.println(curr.data);
        diaplay(curr.next); 
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
    // public void merge(){
    //     while(head1!=null)
    // }
    public static void main(String[] args) { 
        problem21 obj1=new problem21();
        obj1.insert(8);
        obj1.insert(7);
        obj1.insert(6);
        obj1.insert(5);
        obj1.insert2(6);
        obj1.insert2(5);
        obj1.diaplay(head);
        // obj1.factorial(5);
    }
}

