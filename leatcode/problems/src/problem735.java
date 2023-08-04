public class problem735 {

    class stack{
        int capacity;
        int [] s1;
        int top;
        stack(int capacity){
            s1=new int[capacity];
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
        if(top == capacity-1){
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
        
    }
    public static void main(String[] args) {
        
    }
}
