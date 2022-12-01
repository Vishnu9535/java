public class ll {
    Node head;
    class Node{
        int data;
        Node next;        
        private Node(int value){
        value=data; 
        next=null; 
        }
    }
    void insert_at_first(int data){
        if(head==null){
            head=new Node(data);
        }
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
    }
}
