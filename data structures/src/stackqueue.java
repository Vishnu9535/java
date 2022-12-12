public class stackqueue {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }
    void en_queue(int data){
        Node n1=new Node(data);
        if(head==null){
            head=n1;
            tail=n1;
            return;
        }
        tail.next=n1;
        tail=n1;
    }
    void  de_queue(){
        if(head==null){
            System.out.println("nothing to pop");
            return;
        }
        System.out.println("dequed item is "+head.data);
        head=head.next;
    }
}
