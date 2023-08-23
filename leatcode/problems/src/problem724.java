public class problem724 {
    public int pivotIndex(int[] nums) {
        int total=0;
        for(int i = 0; i < nums.length;i++)
        {
            total = total + nums[i];
        }
        int left_sum=0;
        for(int i = 0;i < nums.length ; i++){
            
        }

    }
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        problem724 obj1 = new problem724();
        obj1.pivotIndex(nums);
    }
}
