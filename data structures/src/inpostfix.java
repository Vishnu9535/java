import java.text.BreakIterator;
import java.util.Scanner;

class stack{
    int maxsize=60;
    char[] s=new char[maxsize];
    int top=-1;
    boolean isempty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isfull(){
        if(top==maxsize-1){
            return true;
        }
        else{
            return false;
        }
    }
    void push(char data){
        if(isfull()){
            System.out.println("its full");
            return;
        }
        top++;
        s[top]=data;
    }
    char  pop(){
     
      
            char x= (char) s[top];
            top--;
            return x;
        }
    char peek(){        
            return (char)s[top];
        
    }

} 
public class inpostfix {
   public static int prec(char x){
        if(x=='+'||x=='-'){
            return 1;
        }
        else if(x=='*'||x=='%'){
            return 2;
        }
        else{
            return 0;
        }
    }
    static String to_postfix(String infix){
        stack operator=new stack();
        char symbol;
        String postfix="";
        for(int i=0;i<infix.length();i++){
          symbol=infix.charAt(i);
          if(Character.isSpaceChar(i))
             continue;
          if(Character.isLetter(symbol)){
            postfix=postfix+symbol;
          }
          else if(symbol=='('){
            operator.push(symbol);
          }
          else if(symbol==')'){
            while(operator.peek()!='('){
                postfix=postfix+operator.pop();
            }
            operator.pop();
        }
            else{
                while(!operator.isempty()&&operator.peek()!='('&& prec(symbol)>=operator.peek()){
                   postfix=postfix+operator.pop();
                }
                operator.push(symbol);
            }
          }
          while(!operator.isempty()){
            postfix=postfix+operator.pop();
          }
          return postfix;
        }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String infix=sc.nextLine();
        System.out.println(infix);
        String postfix=to_postfix(infix);
        System.out.println("postfix string is "+postfix);
        
    }
}
