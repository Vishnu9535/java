class stack{
    Node top;
    class Node{
        char data;
        Node next;
        Node(char data){
            this.data=data;
        }
    }
    boolean isempty(){
        if(top==null){
            return true;
        }
        else{
            return false;
        }
    }
    void push(char a){
        if(isempty()){
            top=new Node(a);
        }
        Node n1=new Node(a);
        n1.next=top;
        top=n1;
    }
    char pop(){
    char b=top.data;
    top=top.next;
    return b;
    }
    char peek(){
        return top.data;
    }
}

public class infinpostfix {
    static int prec(char x){
       if(x=='*'||x=='/'){
        return 2;
       }
       else if(x=='+'||x=='-'){
        return 1;
       }
       else{
        return 0;
       }
       
    }
    static String posfix(String infix){
       String postfix="";
       stack x1=new stack();
       char symbol;
       for(int i=0;i<infix.length();i++){
          symbol=infix.charAt(i);
          if (Character.isSpaceChar(symbol))
          continue;
          if(Character.isLetter(symbol)){
            postfix +=symbol;
          }
          else if(symbol=='('){
            x1.push(symbol);
          }
          else if(symbol==')'){
            while(!x1.isempty()&&x1.peek()!='('){
                postfix=postfix+x1.pop();
                System.out.println(posfix(postfix));
            }
            System.out.println(x1.pop());
        }
            else{
                while(!(x1.isempty())&& x1.peek()!='(' && prec(symbol)>=prec(x1.peek())){
                    postfix=postfix+x1.pop();
                }
                x1.push(symbol);
            }
        }
        while(!x1.isempty()){
                postfix=postfix+x1.pop();
            }
            return postfix;
          }
    
    
    public static void main(String[] args) {
        String infix="a*b/(c+d)";;
        String postfix=posfix(infix);
        System.out.println(postfix);
    }
}
