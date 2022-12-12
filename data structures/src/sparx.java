import java.util.*;
public class sparx {
    public static void main(String[] args) {
        int col;
        int row;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows and columns");
        row=sc.nextInt();
        col=sc.nextInt();
        int mat[][]=new int[row][col];
        System.out.println("enter the spark matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
             mat[i][j]=sc.nextInt();
            }
        }
        int unique=0;
        for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
              if(mat[i][j]!=0){
                unique++;
              }
        }
        }
    }
}
