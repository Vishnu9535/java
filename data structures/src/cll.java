public class cll {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    void insert_end(int value){
        Node n1=new Node(value);
        if(head==null){
            head=n1;
            tail=n1;
        }
    }
}
