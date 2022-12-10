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
            return;
        }
        tail.next=n1;
        n1.next=head;
        tail=n1;        
    }
    void display(){
        Node curr=head;
        while(curr!=tail){
            System.out.println(curr.data);
            curr=curr.next;
        }
        System.out.println(curr.next.data);
        }
    public static void main(String[] args) {
        cll x1=new cll();
        x1.insert_end(55);
        x1.insert_end(85);
        x1.insert_end(66);
        x1.insert_end(77);
        x1.display();
    }
}
