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
        Node curr=head;
        for(int i=0;i<3;i++){
            curr=curr.next;
        }
        curr.next=null;
    }
    // }
    // void delete_index(int z){
    //     Node curr=head;
    //     while(curr!=null){
    //         if(curr.value==null)
    //     }
    // }
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
    public void reverse_ll() {
        if(head == null || head.next == null){
            return;
        }
        Node reverse = null;
        Node curr = head.next;
        while(curr!=null){
            Node n1 = new Node(curr.data);
            n1.next = reverse;
            reverse = n1;
            curr = curr.next;
        }
        Node x= reverse;
        while(x!=null){
            System.out.println(x.data);
            x=x.next;

        }

    }
    public Node reverseList(){
        Node current=head;
        Node previous=null;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
    void print(Node head){
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
        x1.insert_at_first(10);
        x1.insert_at_first(0);
        x1.insert_at_the_end(90);
        x1.insert_at_the_end(30);
        x1.insert_at_the_end(60);
        // x1.print();
        // x1.reverse_ll();
        Node resu=x1.reverseList();
        x1.print(resu);
    }
}
