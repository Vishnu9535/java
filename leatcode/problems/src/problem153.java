public class problem153 {
    public int findMin(int[] nums) {
            int i = 0;
            int j = nums.length-1;
            while(i <  j){
                int mid = i + (j - i)/2;
                if(nums[mid] > nums[j]){
                    i = mid + 1;
                }
                else{
                    j = mid;
                }
            }
            return nums[i];
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        problem153 obj1 = new problem153();
        obj1.findMin(arr);
    }
}
