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
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            //  mat[i][j]=sc.nextInt();
System.out.println(mat[i][j]);
        }
        }
        
        int unique=0;
        System.out.println("sparx mat is ");
        for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
              if(mat[i][j]!=0){
                unique++;
                System.out.println(i+" "+j+"" +" "+mat[i][j]);
                
              }
        }
        }
        // System.out.println(unique);
    }
}
