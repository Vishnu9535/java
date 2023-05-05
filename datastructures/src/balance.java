import java.util.*;

class stack{
  char[] data;
   int size;
   int top;
   stack(int size){
    this.size=size;
     data =new char[size];
     top=-1;
   }
   boolean is_empty(){
    if(top <=-1){
        return true;
    }
    else{
        return false;
    }
    
   }
   boolean is_full(){
    if(top==(size-1)){
        return true;
   }
   else{
    return false;
   }
}
void push(char c){
    top=top+1;
    data[top]=c;
}
char pop(){
    char c=data[top];
    top--;
    return c;
}
char peek(){
    return data[top];
}
}


public class balance {
    static String checkbalance(String par){
        int size=par.length();
        if(size==1){
            return "no";
        }
        stack s1=new stack(size);
      for(int i=0;i<par.length();i++){
        char ch=par.charAt(i);
    if(ch=='{'||ch=='['||ch=='(')
           s1.push(ch);
      
    else if((!s1.is_empty())&&((s1.peek()=='{'&& ch=='}')||(s1.peek()=='('&& ch==')')||(s1.peek()=='['&& ch==']'))){
        s1.pop();
      }
      else{
        return "no";
      }
    }
    if(s1.is_empty()){
        return "balanced" ;
    }
    else{
        return "no";
    }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String par=sc.nextLine();
        String t=checkbalance(par);
        System.out.println(t);
    }
    
}
