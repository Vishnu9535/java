import java.util.Arrays;

public class problem34 {
    public int[] searchRange(int[] nums, int target) {
     problem34 obj1=new problem34();
        int start=obj1.find_start_end(nums, target,true);
        int end=obj1.find_start_end(nums, target,false);
        return new int[]{start,end};    
    }
    int find_start_end(int[] nums,int target,boolean m){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int index=(start+end)/2;
            if(nums[index]==target){
                ans=index;
                if(m){
                    end =index-1;
                }
                else{
                    start=index+1;
                }
            }
            else if(nums[index] < target){
                start=index+1;
            }
            else if(nums[index] > target){
                end=index-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,2};
        int target = 2;
        problem34 obj1=new problem34();
        int[] m=obj1.searchRange(arr, target);
        System.out.println(Arrays.toString(m));
    }
}

