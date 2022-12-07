public class ll {
    Node head;
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
    void insert_at_the_end(int data){
        if(head==null){
            head=new Node(data);
            head.next=null;
        }
        else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=new Node(data);
        }
    }
    void delete_first(){
        head=head.next;
    }
    void delete_end(){
        Node curr=head.next;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=null;
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
        x1.insert_at_the_end(90);
        // x1.delete_first();
        x1.delete_end();
        x1.print();
    }
}
