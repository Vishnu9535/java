import java.util.Arrays;
// function rotate2 is right ans
class problem189{
    public void rotate(int[] nums, int k) {
        if(nums.length<k){
            k=k-nums.length;
        }
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
    //   int m=k;
    //   for(int i=0;i<k;i++){
    //     int x=nums[nums.length-m];
    //     nums[nums.length-m]=nums[i];
    //     nums[i]=x;
    //     m=m-1;
    //   }
    //   System.out.println(Arrays.toString(nums));
    //   m=k;
    //   int z=nums.length-1;
    //   for(int i=nums.length-m;i<nums.length-1;i++){
    //     int x=nums[i];
    //     nums[i]=nums[z];
    //     nums[z]=x;
    //     z--;
    //     m--;
    //   }
    System.out.println(Arrays.toString(nums));
  if(nums.length<k){
    k=k-nums.length;
  }
  if(nums.length>k){
    int m=k;
        for(int i=0;i<k;i++){
            int x=nums[i];
            nums[i]=nums[nums.length-m];
            nums[nums.length-m]=x;
            m--;
        }
        if(nums.length-k>1){
        System.out.println(Arrays.toString(nums));
        m=k;
        int j=nums.length-1;
        for(int i=0;i<k/2;i++){
            int x=nums[nums.length-m];
            nums[nums.length-m]=nums[j];
            nums[j]=x;
            j--;
            m--;
        }
        System.out.println(Arrays.toString(nums));
        int v=nums.length-k-1;
        for(int i=0;i<(nums.length-2*k)/2;i++){
            int x=nums[i+k];
            nums[i+k]=nums[v];
            nums[v]=x;
            v--;
        }
        System.out.println(Arrays.toString(nums));
        int t=nums.length-1;
        for(int i=0;i<((nums.length-k)/2);i++){
            int x=nums[i+k];
            nums[i+k]=nums[t];
            nums[t]=x;
            t--;
        }
    }
        System.out.println(Arrays.toString(nums));
    }
}

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        int k=4;
        problem189 obj=new problem189();
        obj.rotate2(nums, k);
    }
}