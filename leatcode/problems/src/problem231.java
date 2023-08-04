import java.math.*;
import java.util.*;
class problem231{
    public static void main(String[] args) {
        int x=9;
        // System.out.println(1.5 % 1);
        System.out.println(isPowerOfTwo(5));
    }
     public static boolean isPowerOfTwo(int n) {
        // double sq=n/2;
        // sq= square_root(n, sq);
        // if(sq % 2 == 0){
        //     return true;
        // }
        // return false;
        double x= Math.log(n)/Math.log(2);
            System.out.println(x);
        double threshold=0.000001;
        if(Math.abs( x % 1) <= threshold) 
            return true;
        return false;
    }
    // public static double square_root(int n, double sq){
    //         double t= sq;
    //         sq= (t + (n/t))/2;
    //         if(t - sq == 0){
    //             return sq;
    //         }
    //         return square_root(n, sq);
    // }
}