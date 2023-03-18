public class gcd {
    public static void main(String[] args) {
      
        int m=12;
        int n=8;
        while(n!=0){
            int r=m%n;
            m=n;
            n=r;
        }
        System.out.println(m);
    }
}
