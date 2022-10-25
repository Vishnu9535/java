import java.util.*;

public class jagged {
    public static void main(String[] args) {
        int arr[][]=new int[2][];
        arr[0]=new int[3];
        arr[1]=new int[4];
        int x=0;
        for(int i=0;i<arr.length;i++)
        for (int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=x++;
            }
        for(int i=0;i<arr.length;i++) 
            System.out.println(Arrays.toString(arr[i]));
        
        
    }
}
