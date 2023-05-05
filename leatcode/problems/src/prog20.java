public class prog20 {
    Node head;
    class Node{
        char data;
        Node next;
        Node(char data){
            this.data=data;
            next=null;
        }
    }
    void push(char data){
        if(head==null){
            Node n1=new Node(data);
            head=n1;
            head.next=null;
            return;
        }
        else{
            Node n1=new Node(data);
            n1.next=head;
            head=n1;
        }
    }
    char pop(){
            // System.out.println("nothig to pop");
            char ch=head.data;
            head=head.next;
            return ch;
    }
    boolean isValid(String s) {
        prog20 p1=new prog20();
        for(int i=0 ;i < s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='{' || ch=='[' || ch=='('){
                p1.push(ch);
            }
            else if(ch=='}'&& head!=null && head.data=='{'|| ch==']' && head!=null && head.data=='['|| ch==')' && head!=null && head.data=='('){
                p1.pop();
            }
            else{
                return false;
            }
        }
        if(head!=null && (head.data!='['||head.data!='{'||head.data!='(')){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        String s="()[]";
        prog20 p2=new prog20();
        boolean b1=p2.isValid(s);
        System.out.println(b1);
    }
}
