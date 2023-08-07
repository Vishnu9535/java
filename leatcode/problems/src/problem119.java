import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem119 {
        public List<Integer> getRow(int rowIndex) {
        rowIndex=rowIndex+1;
        int[][] result=new int[rowIndex][];
        List<Integer> r1 = new ArrayList<>();
        for(int i=0;i < rowIndex;i++){
            int[] temp=new int[i+1];
            temp[0]=1;
            for(int j=0;j < i-1;j++){
                temp[j+1]=result[i-1][j] + result[i-1][j+1];
            }
            temp[temp.length-1]=1;
            result[i]=temp;
        }
        // for(int i=0;i<rowIndex;i++){
        //     for(int j=0;j<result[i].length;j++){
        //         System.out.print(result[i][j]);
        //     }
        //     System.out.println();
        // }
        for(int i=0;i< rowIndex;i++){
            System.out.print(result[rowIndex-1][i]);
            r1.add(result[rowIndex-1][i]);
        }
        System.out.println();
        return r1;
        }
        public static void main(String[] args) {
                problem119 x1 =new problem119();
                x1.getRow(3);
        }
}
