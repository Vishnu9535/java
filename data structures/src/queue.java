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
    void decqueue(){
      if(isempty()){
          System.out.println("its  empty");
          return;
      }
      if(front>rear){
        front=-1;
        rear=-1;
      }
      System.out.println(q[front]+" is dequeued");
      front++;
    }
    void display(){
        for(int i=front;i<=rear;i++){
            System.out.println(q[i]);
        }
    }
    public static void main(String[] args) {
        queue x1=new queue(5);
        x1.enqueue(55);
        x1.enqueue(6);
        x1.enqueue(85);
        x1.enqueue(75);
        x1.decqueue();
        x1.display();
    }
}
