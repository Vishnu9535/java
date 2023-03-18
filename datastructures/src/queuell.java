public class queuell {
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
    void print(){
        Node curr=head;
        if(curr==null){
            System.out.println("nothing to print ");
            return;
        }
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        queuell x1=new queuell();
        x1.en_queue(500);
        x1.en_queue(25);
        x1.en_queue(36);
        x1.en_queue(508);
        x1.de_queue();
        x1.de_queue();
        x1.print();
    }
}
