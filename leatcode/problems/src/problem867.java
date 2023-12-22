import java.util.Arrays;

public class problem867 {
    public  int[][] transpose(int[][] matrix) {
        
        // int[][] trans = new int[matrix[0].length][matrix.length];
        // for (int i =0 ;i < matrix.length;i++)
        // {
        // for (int j = 0; j < matrix[i].length;j++)
        // {
        //     trans[j][i] = matrix[i][j];
        // }
        
        // }
        // return trans;
        int[][] result = new int[matrix[0].length][matrix.length];
        make_transpose(result,matrix,0,0);
        return result;
    }
    public static void make_transpose(int[][] result ,int[][] matrix,int i ,int j){

        if(j == matrix.length-1 && i == matrix[0].length-1){
             result[i][j] = matrix[j][i];
            return;
        }
        if(i == matrix[0].length-1){
            result[i][j] = matrix[j][i];
            i = 0;
            j++;
        }
        else{
            result[i][j] = matrix[j][i];
            i++;
        }
        make_transpose(result,matrix,i,j);

    }
    public static void main(String[] args) {
        int[][] x1 = {{1,2,3},{4,5,6}};
        problem867 obj1 = new problem867();
        System.out.println(Arrays.deepToString(obj1.transpose(x1)));

    }
}
