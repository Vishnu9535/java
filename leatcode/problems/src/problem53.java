import java.util.*;

public class problem53 {
    public int maxsubarray(int[] nums){
        // int[] arr1 =new int[nums.length];
        int max=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++){

            sum=sum+nums[i];
            sum=Math.max(sum,nums[i]);
            if(sum>max){
                max=sum;
               }
            
        }
        return max;
    }
    public static void main(String[] args) {
        problem53 obj1=new problem53();
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int max=obj1.maxsubarray(arr);
        System.out.println(max);

    }
}
