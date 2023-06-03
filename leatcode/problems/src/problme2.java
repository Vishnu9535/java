public class problme2 {
    static Node head;
    static Node head1;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
            next=null;
        }
        // public Node(long data) {
        //     this.data=data;
        // }
    }
    void insert_at_the_end1(int data){
        Node n1=new Node(data);
        if(head ==null){
            head=n1;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=n1;
    }
    void insert_at_the_end2(int data){
        Node n1=new Node(data);
        if(head1 ==null){
            head1=n1;
            return;
        }
        Node curr=head1;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=n1;
    }
    void display(Node head){
        Node curr= head ;
        if(curr!=null){
            System.out.println(curr.value);
            display(curr.next);
        }
    }
    // BigInteger reverse(BigInteger number) {
    //     BigInteger reversed = BigInteger.ZERO;
    //     while (number.compareTo(BigInteger.ZERO) > 0) {
    //       reversed = reversed.multiply(BigInteger.TEN).add(number.mod(BigInteger.TEN));
    //       number = number.divide(BigInteger.TEN);
    //     }
    //     return reversed;
    //   }
      

    public Node addTwoNumbers2(Node l1, Node l2) {
        Node curr=l1;
        long r1=0;
        while(curr!=null){
            r1=r1*10;
            r1=r1+curr.value;
            curr=curr.next;
        }
        // System.out.println(r1);
        curr=l2;
        long r2=0;
        while(curr!=null){
            r2=r2*10;
            r2=r2+curr.value;
            curr=curr.next;
        }
        System.out.println(r2);
        long re1=0;
        while(r1>0){
            re1=re1*10+r1%10;
            r1=r1/10;
        }
     while(l1.value==0){
        re1=re1*10;
        l1=l1.next;
     }   
        
        System.out.println(re1);
        long re2=0;
        while(r2>0){
            re2=re2*10;
            re2=re2+r2%10;
            r2=r2/10;
        }  
     while(l2.value==0){
        re2=re2*10;
        l2=l2.next;
    }

        System.out.println(re2);

        long result= (re1+re2);
        
        System.out.println(result);
        Node n1=new Node(0);
        Node c1=n1;
        if(result>0){
        while(result>0){
            int data=(int) (result%10);
            Node temp=new Node(data);
            c1.next=temp;
            c1=c1.next;
            result=result/10;
        }
        return n1.next;
    }
    else{
        return n1;
    }
    }
    public Node addTwoNumbers0(Node l1, Node l2){
        Node n1=new Node(0);
        Node curr=n1;
        int carry=0;
        while(l1!=null || l2!=null){
            int sum=0;
            if(l1!=null){
                sum=sum+l1.value;
                l1=l1.next;


                
            }
            if(l2!=null){
            sum=sum+l2.value;
            l2=l2.next;
        }
        sum=sum+carry;
        carry=sum/10;
        
        Node x=new Node(sum % 10);
        curr.next=x;
        curr=curr.next;            
        }
        if(carry!=0){
            Node x=new Node(carry);
            curr.next=x;
        }
        return n1.next;
    }

    public Node addTwoNumbers(Node l1, Node l2) {
        Node curr=l1;
        String s1="";
        while(curr!=null){
            String x=Integer.toString(curr.value);
            s1=s1+x;
            curr=curr.next;
        }
        // System.out.println(s1);

        curr=l2;
        String s2="";
        while(curr!=null){
            String x=Integer.toString(curr.value);
            s2=s2+x;
            curr=curr.next;
        }
        // System.out.println(s2);
        int add1=0;
        for(int i=s1.length()-1;i >= 0;i--){
            add1=add1*10;
            add1+=s1.charAt(i) - '0';
        }
        System.out.println(add1);
        int add2=0;
        for(int i=s2.length()-1;i >= 0;i--){
            add2=add2*10;
            add2+=(s2.charAt(i) - '0');
        }
        // System.out.println(add2);

        int result=add1+add2;
        // System.out.println(result);

        // problme2 obj2=new problme2();
        int reversed=0;
        Node r1=new Node(0);
        Node cu=r1;
        while(result>0){
            reversed=result % 10;
            Node r2=new Node(reversed);
            cu.next=r2;
            cu=cu.next;
            result=result/10;
        }
        return r1.next;
    }
    public static void main(String[] args) {
        problme2 obj1=new problme2();
        obj1.insert_at_the_end1(2);
        obj1.insert_at_the_end1(4);
        obj1.insert_at_the_end1(3);
        obj1.insert_at_the_end2(5);
        obj1.insert_at_the_end2(6);
        obj1.insert_at_the_end2(4);
        // obj1.insert_at_the_end2(9);
        // obj1.insert_at_the_end1(1);
        // obj1.insert_at_the_end1(9);
        // obj1.insert_at_the_end1(9);
        // obj1.insert_at_the_end1(9);
        // obj1.insert_at_the_end1(9);
        // obj1.insert_at_the_end1(9);
        // obj1.insert_at_the_end1(9);
        // obj1.insert_at_the_end1(9);
        // obj1.insert_at_the_end1(9);
        // obj1.insert_at_the_end1(9);


        // obj1.display(head1);
        Node r1=obj1.addTwoNumbers0(head, head1);
        obj1.display(r1);

    }
}
