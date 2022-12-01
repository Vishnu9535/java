public class ll {
    Node head=null;
    class Node{
        int data;
        Node next;        
        Node(int value){
        data=value;
        next=null; 
        }
    }
    void insert_at_first(int value){
        if(head==null){
            head=new Node(value);
            head.next=null;
        }
        else{
        Node new_node=new Node(value);
        new_node.next=head; 
        head=new_node;
        }
    }
    void print(){
        if(head==null){
            System.out.println("no elements");
            return;
        }
        else{
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
        }
    }
    public static void main(String[] args) {
        ll x1=new ll();
        x1.insert_at_first(80);
        x1.insert_at_first(0);
        x1.print();
    }
}
