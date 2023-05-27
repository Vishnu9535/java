import java.util.HashMap;

public class problem141 {
    static Node head;
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
    public void display(Node n1){
        if(n1==null){
            // System.out.println("nothing to display");
            return;
        }
        Node curr=n1;
        if(curr!=null){
        System.out.println(curr.data);
        display(curr.next);
        }
    }
    public boolean hasCycle(Node head) {
        boolean x;
        Node cu=head;
        HashMap<Node,Integer> h1=new HashMap<>();
        while(cu!=null){
            if(h1.containsKey(cu)){
                int m=h1.get(cu);
                m=m+1;
                if(m>1){
                    x=true;
                    return x;
                }
                h1.put(cu,m);

            }
            else{
                h1.put(cu,1);
            }
            cu=cu.next;
        }
        x=false;
        return false;
    }
    public static void main(String[] args) {
        problem141 obj1=new problem141();
        obj1.insert_at_the_end(1);
        obj1.insert_at_the_end(2);
        obj1.insert_at_the_end(3);
        obj1.insert_at_the_end(4);
        obj1.insert_at_the_end(5);
        obj1.display(head);
        boolean x=obj1.hasCycle(head);
        System.out.println(x);
    }
}
