import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chocolatedistribution {
    public static long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        long min = a.get(n-1);
        int i =0;
        int j = m-1;
        while(j < n){
            long temp = a.get(j) - a.get(i);
            if(min > temp){
                min =temp;
           
            }
                 i++;
                j++;
        }
        return min;
    }
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        // int[] m ={3, 4, 1, 9, 56, 7, 9, 12};

        a.addAll(a,3, 4, 1, 9, 56, 7, 9, 12);


    }
}
