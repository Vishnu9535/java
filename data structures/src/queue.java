public class queue {
    int size;
    int[] q;
    int front,rear;
    queue(int size){
        this.size=size;
        q=new int[size];
        front=-1;
        rear=-1;    
    }
    boolean isempty(){
        if(front==-1){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isfull(){
        if(rear==size-1){
            return true;
        }
        else{
            return false;
        }
    }

    void enqueue(int data){
        if(isfull()){
            System.out.println("it is full");
            return;
        }
        front=0;
        rear++;
        q[rear]=data;
        System.out.println(q[rear]);
        System.out.println("sucessfully added");
    }
    void decqueue(int data){
      if(isempty()){
          System.out.println("its  empty");
          return;
      }
      System.out.println(q[front]+"is dequeued");
      front++;
    }
    public static void main(String[] args) {
        
    }
}
