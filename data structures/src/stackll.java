public class stackll {
    Node head;
    class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
    void push(int data){
        Node n1=new Node(data);    
    if(head==null){
         head=n1;
         head.next=null;
         return;
        }
    n1.next=head;
    head=n1;
    }
    int pop(){
        if(head==null){
            System.out.println("nothing to pop");
            return -1;
        }
        else{
        int x= head.data;
        if(head.next!=null){
        head=head.next;
        }
        return x;
    }
    }
    void display(){
        Node curr=head;
        
    }
}
}
