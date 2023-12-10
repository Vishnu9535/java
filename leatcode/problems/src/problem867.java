import java.util.Arrays;

public class problem867 {
    public  int[][] transpose(int[][] matrix) {
        
        int[][] trans = new int[matrix[0].length][matrix.length];
        for (int i =0 ;i < matrix.length;i++)
        {
        for (int j = 0; j < matrix[i].length;j++)
        {
            trans[j][i] = matrix[i][j];
        }
        
        }
        return trans;
    }
     public  int[][] transpose_with_recersion(int[][] matrix) {
        
        int[][] trans = new int[matrix[0].length][matrix.length];
        for (int i =0 ;i < matrix.length;i++)
        {
        for (int j = 0; j < matrix[i].length;j++)
        {
            trans[j][i] = matrix[i][j];
        }
        
        }
        return trans;
    }
    public static void main(String[] args) {
        int[][] x1 = {{1,2,3},{4,5,6}};
        problem867 obj1 = new problem867();
        System.out.println(Arrays.deepToString(obj1.transpose(x1)));

    }
}
