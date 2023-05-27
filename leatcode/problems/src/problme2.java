public class problme2 {
    static Node head;
    static Node head1;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
            next=null;
        }
    }
    void insert_at_the_end1(int data){
        Node n1=new Node(data);
        if(head ==null){
            head=n1;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=n1;
    }
    void insert_at_the_end2(int data){
        Node n1=new Node(data);
        if(head1 ==null){
            head1=n1;
            return;
        }
        Node curr=head1;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=n1;
    }
    void display(Node head){
        Node curr= head ;
        if(curr!=null){
            System.out.println(curr.value);
            display(curr.next);
        }
    }
    public Node addTwoNumbers(Node l1, Node l2) {
        Node curr=l1;
        String s1="";
        while(curr!=null){
            String x=Integer.toString(curr.value);
            s1=s1+x;
            curr=curr.next;
        }
        // System.out.println(s1);

        curr=l2;
        String s2="";
        while(curr!=null){
            String x=Integer.toString(curr.value);
            s2=s2+x;
            curr=curr.next;
        }
        // System.out.println(s2);
        int add1=0;
        for(int i=s1.length()-1;i >= 0;i--){
            add1=add1*10;
            add1+=s1.charAt(i) - '0';
        }
        System.out.println(add1);
        int add2=0;
        for(int i=s2.length()-1;i >= 0;i--){
            add2=add2*10;
            add2+=(s2.charAt(i) - '0');
        }
        // System.out.println(add2);

        int result=add1+add2;
        // System.out.println(result);

        // problme2 obj2=new problme2();
        int reversed=0;
        Node r1=new Node(0);
        Node cu=r1;
        while(result>0){
            reversed=result % 10;
            Node r2=new Node(reversed);
            cu.next=r2;
            cu=cu.next;
            result=result/10;
        }
        return r1.next;
    }
    public static void main(String[] args) {
        problme2 obj1=new problme2();
        obj1.insert_at_the_end1(0);
        // obj1.insert_at_the_end1(4);
        // obj1.insert_at_the_end1(3);
        // obj1.insert_at_the_end2(5);
        obj1.insert_at_the_end2(0);
        // obj1.insert_at_the_end2(4);
        // obj1.display(head1);
        Node r1=obj1.addTwoNumbers(head1, head);
        obj1.display(r1);

    }
}
