import java.text.BreakIterator;
import java.util.Scanner;

class stack{
    int maxsize=60;
    int[] s=new int[maxsize];
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
    void push(int data){
        if(isfull()){
            System.out.println("its full");
            return;
        }
        top++;
        s[top]=data;
    }
    int  pop(){
        if(isempty()){
            System.out.println("nothng to pop");
            return -1;
        }
        else{
            int x= s[top];
            top--;
            return x;
        }
    }
    int peek(){
        if(isempty()){
            System.out.println("nothng to peek");
            return -1;
        }
        else{
            return s[top];
        }
    }

} 
public class inpostfix {
      String topostfix(String a){
        for(int i=0;i<a.length();i++){
          
        }
      }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        // System.out.println(a);
        

        
    }
}
