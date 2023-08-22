public class problem643 {
    public double findMaxAverage(int[] nums, int k) {
        // if(nums.length == 1){
        //     return nums[0];
        // }
        // float result = Float.NEGATIVE_INFINITY;
        // for(int i=0; i <= nums.length - k ; i++)
        // {
        //     int x = 0;
        //     for(int z = i;z < i+k; z++)
        //     {
        //         x = x+nums[z];
        //     }
        //     if(x > result)
        //     {
        //         result= x;
        //     }
        // }
        // return result/k;
        int sum = 0;
        for(int i = 0; i < k; i++ ){
                sum = sum+nums[i];
        }
        int max_sum=sum;
        for(int i=k; i < nums.length;i++){
            sum=sum+nums[i]-nums[i-k];
            if(sum > max_sum){
                max_sum = sum;
            }
        }
        return (double)max_sum/4;
    }
    public static void main(String[] args) {
        problem643 obj1 = new problem643();
        int[] arr1 = {0,1,1,3,3};
        int k = 4;
        System.out.println(obj1.findMaxAverage(arr1,k));
    }
}
