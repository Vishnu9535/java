public class maxsubarray {
    public static int maxSubArray(int[] nums) {
        int x=0;
        int y=-1000;
        int check=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] >= 0){
                 x=x+nums[i];
            }
            else if(nums[i] >= y){
                y=nums[i];
                check=1;
            }
        }
        if(check==1){
            x=x+y;
        }
        return x;
    }
    public static void main(String[] args) {
        int[] num={5,4,-1,7,8};
        int x=maxSubArray(num);
        System.out.println(x);
    }
}
