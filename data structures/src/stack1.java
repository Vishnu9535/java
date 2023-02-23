import java.util.*;

import javax.print.attribute.SupportedValuesAttribute;
class stack1{
    int top;
    int a[];
    int capacity;
    stack1(int size){
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
          System.out.println("sucessfully pushed");
    }
    int  pop(){
        // return(a[top--]);
        int z=a[top];
        top--;
        return z;
    }
    void full_check(){
          if(top==capacity-1){
            System.out.println("stack is full");
          }
    }
    public static void main(String[] args) {
        // Stack<Integer> x1=new Stack<>();
        stack1 x1=new stack1(5);
        x1.push(55);
        x1.push(63);
        int z=x1.pop();
        System.out.println(z);
        System.out.println(x1.pop());


        
        
    }
}