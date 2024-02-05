public class problem153 {
    public int findMin(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while(i <  j){
            int m = i +(j-i)/2;
            if(nums[i] < nums[m] ){
                i = m+1;
            }
            else{
                j= m-1;
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
