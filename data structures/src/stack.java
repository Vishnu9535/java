import java.util.*;
class stack{
    int top;
    int a[];
    int capacity;
    stack(int size){
        capacity=size;
        a=new int[size];
        top=-1;
    }
    void push(int value){
        if(top==capacity){
            System.out.println("stack is full");
            return;
        }
          top++;
          a[top]=value;
    }
    int  pop(){
        return a[top];
    }
    void full_check(){
          if(top==capacity){
            System.out.println("stack is full");
          }
    }
    public static void main(String[] args) {
        // Stack<Integer> x1=new Stack<>();
        
    }
}