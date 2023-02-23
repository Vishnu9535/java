import java.util.*;
public class maxsubarray {
    public static int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        else{
            int x=0;
            int y=0;
        Arrays.sort(nums);
        for(int i=1;i<=nums.length;i++){
            if(nums[i-1] >= 0 && nums[i-1]!=nums[i]){
                 x=x+nums[i-1];
            }
            // System.out.println(nums[i-1]);
            else if(nums[i-1] == -1){
                y=nums[i-1];
            }
        }
        x=x+y;
        if(nums[nums.length-1] > 0){
            x=x+nums[nums.length-1];
        }
        return x;
    }
    }
    public static void main(String[] args) {
        int[] num={-2,-1};
        int x=maxSubArray(num);
        System.out.println(x);
    }
}
