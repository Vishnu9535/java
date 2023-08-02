import java.util.*;
public class problem1732 {
    public static void main(String[] args) {
        problem1732 obj1 = new  problem1732();
        int[] arr = {-4,-3,-2,-1,4,3,2};
        System.out.println(obj1.largestAltitude(arr));
    }
    public int largestAltitude(int[] gain) {
        int highpoint = 0;
        int mx = 0;
        for(int i = 0; i < gain.length ; i++){
                highpoint += gain[i];
                mx = Math.max(mx, highpoint);
        }   
        return mx;
    }
}
