public class doubley {
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
         this.data=data;
        }
     }
    public void insert_first(int data){
      Node n1=new Node(data);
        if(head==null){
        head=n1;
      }
      else{
        n1.next=head;
        n1.prev=null;
        head.prev=n1;
        head=n1;
      }     
    }
    void display(){
        Node curr=head;
        while(curr.next!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    public static void main(String[] args){
        doubley x1=new doubley();
        x1.insert_first(24);
        x1.insert_first(26);
        x1.insert_first(35);
        x1.display();
    }
}
