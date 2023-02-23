import java.util.*;
public class sieve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr1=new int[sc.nextInt()];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=i+1;
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=2;j<arr1[i];j++){
                  if(arr1[i]%j==0){
                    arr1[i]=0;
                  }
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=0){
                System.out.print(arr1[i]+" ");
            }
        }
    }
}
