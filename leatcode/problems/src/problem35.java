public class problem35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid=0;
        while(left <= right){
            mid=left + (right-left)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                right=mid-1;
            }
            if( nums[mid] < target){
                left = mid+1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
     int[] nums={1,3,5,6};
     int target=4;
     problem35 obj1=new problem35();
     int x=obj1.searchInsert(nums, target);
     System.out.println(x);
    }
}
