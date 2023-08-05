import java.util.*;
import java.math.*;
public class problem735 {
        int[] s1;
        int top;
    class stack{
        int cap;
        stack(int capacity){
            cap=capacity;
            s1=new int[cap];
            top=-1;
        }

    void push(int number){
        if(is_full()){
            System.out.println("size full");
            return;
        }
        top++;
        s1[top] = number;
    }
    boolean is_full(){
        if(top == cap-1){
            return true;
        }
        return false;
    }
    int pop(){
        int x=s1[top];
        top--;
        return x;
    }

    boolean is_empty(){
        if(top == -1)
        return true;
       
        return false;
    }
    int seek(){
        return s1[top];
    }
}

    public int[] asteroidCollision(int[] asteroids) {
        stack x1 = new stack(asteroids.length);

        for(int i=0; i < asteroids.length;i++){

            if(x1.is_empty())
            {
                x1.push(asteroids[i]);
            }
            else if((x1.seek() > 0 && asteroids[i] > 0) || (x1.seek() < 0 && asteroids[i] <0))
            {
                x1.push(asteroids[i]);
            }
       
            else if(Math.abs(x1.seek()) == Math.abs(asteroids[i]))
                    x1.pop();
                }
            
            else {
                while((Math.abs(x1.seek()) < Math.abs(asteroids[i])) && !((x1.seek() > 0 && asteroids[i] > 0)))
                {         
                       
                    x1.pop();
                     if(x1.is_empty()){
                        break;
                    }  
                }   
                // x1.push(asteroids[i]);      
            }
        }
        int r1[] =new int[top+1];
        for(int i=0;i <= top;i++){
            r1[i]=s1[i];
        }
        return r1;
    }
    public static void main(String[] args) {
        int arr1[] = {5,10,-5};
        problem735 obj1 = new problem735();
        int[] r1=obj1.asteroidCollision(arr1);

        System.out.println(Arrays.toString(r1));
    }
}
