import java.util.Arrays;
import java.util.List;

public class problem118 {
    public List<List<Integer>> generate(int numRows) {
        numRows=numRows+1;
        int[][] result=new int[numRows][];
        for(int i=0;i < numRows;i++){
            int[] temp=new int[i+1];
            temp[0]=1;
            for(int j=0;j < i-1;j++){
                temp[j+1]=result[i-1][j] + result[i-1][j+1];
            }
            temp[temp.length-1]=1;
            result[i]=temp;
        }
        for(int i=0;i<numRows;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
        for(int i=0;i< numRows;i++){
            System.out.print(result[numRows-1][i]);
        }
        return (List)Arrays.asList(result);
         }
    public static void main(String[] args) {
        problem118 x1 = new problem118();
        x1.generate(3);
    }
}