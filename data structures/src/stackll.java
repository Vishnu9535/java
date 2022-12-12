public class stackll {
    Node head;
    class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
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
        head=head.next;
        
        System.out.println("poped number is "+x);
        return x;
    }
    }
    void display(){
        Node curr=head;
        if(head==null){
            System.out.println("nothing to print");
            return;
        }
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
public static void main(String[] args) {
    stackll x1=new stackll();
    x1.push(66);
    x1.push(45);
    x1.push(677);
    x1.pop();
    x1.pop();
    x1.pop();
    x1.display();
}
}
