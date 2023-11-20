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
    void delete(int value){
        if(head.data==value){
            head=head.next;
            tail.next=head;
            return;
        }
        if(tail.data==value){
            Node curr=head;
            while(curr.next!=tail){
                curr=curr.next;
            }
            curr.next=head;
            tail=curr;
            return;
        }
        Node curr=head;
        while(curr.next.data!=value){
            curr=curr.next;
        }
        Node x=curr.next.next;
        curr.next=x;                                    
    }
    void display(){
        Node m=head;
        while(m!=tail){
            System.out.println(m.data);
            m=m.next;
        }
        System.out.println(m.data);
        }
    public static void main(String[] args) {
        cll x1=new cll();
        x1.insert_end(55);
        x1.insert_end(85);
        x1.insert_end(66);
        x1.insert_end(77);
        x1.insert_end(1245);
        x1.delete(66);
        x1.delete(55);
        x1.delete(1245);
        x1.delete(85);
        x1.insert_end(75);
        x1.delete(77);
        x1.insert_end(5);

        x1.display();
    }
}
