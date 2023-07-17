public class problem1137 {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }
        n=n-2;
        int a=0;
        int b=1;
        int c=1;
        int result=0;
        for(int i=0;i<n;i++){
            result =a+b+c;
            a=b;
            b=c;
            c=result;
        }
        return result;
    }
    public static void main(String[] args) {
        problem1137 obj1= new problem1137();
        System.out.println(obj1.tribonacci(37));

    }
}
