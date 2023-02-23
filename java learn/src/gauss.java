import java.util.*;
public class gauss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a =new int[n][n+1];
        System.out.println("enter matrix");
        for(int i =0;i<n;i++){
            for(int j=0;j<n+1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && a[i][i]!=0){
                    int ratio=a[j][i]/a[i][i];
                    for(int k=0;k<n+1;k++){
                        a[j][k]=a[j][k]-ratio*a[i][k];
                    }
                }

            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n+1;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    }
}
