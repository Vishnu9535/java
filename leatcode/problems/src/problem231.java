class problem231{
    public static void main(String[] args) {
        int x=100;
        isPowerOfTwo(x);
    }
     public static boolean isPowerOfTwo(int n) {
        if(n == 1){
            return true;
        }
        double sq=n/2;
        sq= square_root(n, sq);
        System.out.println(sq);
        return true;
    }
    public static double square_root(int n, double sq){
            double t= sq;
            sq= (t + (n/t))/2;
            if(t - sq == 0){
                return sq;
            }
            return square_root(n, sq);
    }
}