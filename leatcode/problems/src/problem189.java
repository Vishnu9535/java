import java.util.Arrays;
// function rotate2 is right ans
class problem189{
    public void rotate(int[] nums, int k) {
        int i=0;
        while(i!=k){
            nums=turn(nums);
            i++;
            }
            System.out.println(Arrays.toString(nums));
    }
    static int[] turn(int[] nums){
        int z=nums.length-1;
            int m=z;
            for(int j=1;j<z+1;j++){
                int n=nums[z-j];
                nums[z-j]=nums[m];
                nums[m]=n;
                m--;
                }
                return nums;

    }
    public void rotate2(int[] nums, int k) {
        int n=nums.length-1-k;
        
        for(int i=0;i<k;i++){
            int v=nums[n];
            nums[n]=nums.length-1;
        }
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        problem189 obj=new problem189();
        obj.rotate(nums, k);
    }
}