import java.util.Arrays;
import java.util.*;
public class problem566 {
        public int[][] matrixReshape(int[][] mat, int r, int c) {
            if((r*c) != mat.length*mat[0].length)
                return mat;
        int[][] result=new int[r][c];
        int k=0;
        int m=0;
        for(int i=0;i < mat.length;i++){
            for(int j=0;j < mat[i].length;j++){
                    result[m][k]=mat[i][j];
                    // System.out.println(result[m][k]);
                    k++;
                if(k==c){
                k=0;
                m++;
                }
            }
        }
        System.out.println(Arrays.toString(result[2]));
        return result;
    }
    public static void main(String[] args) {
        int[][] i1={{1,2},{3,4}};
        int r=4,c=1;
        problem566 obj1=new problem566();
        obj1.matrixReshape(i1, r, c);
    }
}
