import java.util.*;
import java.math.*;
public class gcd {
    public static void main(String[] args) {
      
        int m=12;
        int n=8;

        gcd a=new gcd();
        // a.gcd2(m, n);
        a.ersthonesis(7);
        while(n!=0){
            int r=m%n;
            m=n;
            n=r;
            // System.out.println(m+" "+n);
        }
        // System.out.println(m);
    }
    public void gcd1(int a,int b){
          while(a!=b){
            if(a>b){
                a=a-b;
            }
            else if(a<b){
              b=b-a;
            }            
          }
          System.out.println(a);
    }
    public void gcd2(int a, int b)
    {
      int r=Math.min(a,b);
      while(r!=0){
       if(a%r==0 && b%r==0){
          break;
       }
        r--;
      }
      System.out.println(r);
    }
    public void ersthonesis(int a){
      int[] arr=new int[a+1];
         for(int i=2;i<=a;i++){
          arr[i]=i;
         }
         for(int p=2;p<Math.sqrt(a);p++){
          if(arr[p]!=0){
              int x=p*p;
              while(x<a){
                arr[x]=0;
                x=x+p; 
              }
          }
         }
         for(int i=2;i<arr.length;i++){
          if(arr[i]!=0){
            System.out.println(arr[i]);
          }
         }
    }
}
