import java.util.Arrays;

public class problem977 {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i < nums.length; i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
        problem977 obj1=new problem977();
        int[] arr=obj1.sortedSquares(nums);
        System.out.println(Arrays.toString(arr));
}
}
