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
    void enqueue(int data){
        front=0;
        rear++;
        
    }
    public static void main(String[] args) {
        
    }
}
