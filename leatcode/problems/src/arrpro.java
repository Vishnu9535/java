import java.util.*;
public class arrpro {
    // public static boolean containDupicate(int[] nums){
    //     boolean x=false;
    //     outer:for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //         if(nums[i]==nums[j]){
    //             x=true;
    //             break outer;
    //         }
    //     }
    //     }
    //     return x;
    // }
    public static boolean containDupicate(int[] nums){
        boolean x=false;
        Arrays.sort(nums);  
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                x=true;
            }
        }
        return x;
    }
    
    public static void main(String[] args) {
      int[] nums={1,2,3,1};
      boolean x=containDupicate(nums);
      System.out.println(x);
    }
    
}