import java.util.*;
public class sqrt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println(Math.abs(a));
        double m=sc.nextDouble();
        double k=1.0e-15;
        double z=m;
        while(Math.abs(z-m/z)>k){
            z=(z+m/z)/2;
        }
        System.out.println(z);
    }
}
