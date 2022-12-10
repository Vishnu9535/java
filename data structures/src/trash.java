public class trash {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    void insrt_first(int data){
       Node new_node=new Node(data);
       new_node.next=head;
       head=new_node;
    }
    void print(){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        trash x1=new trash();
        x1.insrt_first(55);
        x1.insrt_first(80);
        x1.print();
    }
}
