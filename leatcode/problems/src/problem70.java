public class problem70 {
    public int climbStairs(int n) {
        
        if(n==1 || n==2){
            return n;
        }
        int ways=0;
        int a=1;
        int b=2;
        for(int i=3;i<=n;i++){
            ways=a+b;
            a=b;
            b=ways;
        }
        return ways;
    }
    public static void main(String[] args) {
        problem70 obj1=new problem70();
        int x=obj1.climbStairs(4);
        System.out.println(x);
    }
}
