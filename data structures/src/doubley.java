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
    //   n1.next=head;
    //   n1.prev=null;
    //   if(head!=null){
    //     head.prev=n1;
    //   }    
    //   head=n1;
    // }
    void insert_end(int data){
      Node n1=new Node(data);
      Node curr=head;
      while(curr.next!=null){
        curr=curr.next;
      }
      curr.next=n1;
      n1.prev=curr;
      n1.next=null;
    }
    void instert_at_index(int value,int value2){
      Node curr=head;
      Node n2=new Node(value2);

      while(curr!=null){
        if(curr.data==value){
          break;
        }
        curr=curr.next;
      }
      if(curr.next!=null){
      n2.next=curr.next;
      }
      curr.next=n2;
      n2.prev=curr;
      if(curr.next.next!=null){
        curr.next.next.prev=n2;
      }
      
    }
    void display(){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    public static void main(String[] args){
        doubley x1=new doubley();
        x1.insert_first(24);
        x1.insert_first(26);
        x1.insert_first(35);
        x1.insert_end(55);
        x1.insert_end(77);
        x1.insert_end(66);
        x1.instert_at_index(55, 86);
        x1.instert_at_index(66, 97);
        x1.instert_at_index(97, 7);
        x1.display();
    }
}
