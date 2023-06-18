import java.util.Arrays;

public class problem283 {
     public void moveZeroes(int[] nums) {
        int temp=0;
        for(int i=0;i < nums.length;i++){
            if(nums[i]==0){
            int j=i+1;
            while(j < nums.length ){
                if(nums[j]!=0){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                break;
                }
                j++;
            }          
        }
    }
    System.out.println(Arrays.toString(nums));
    }
    public void moveZeroes2(int[] nums) {
    
    
    }
    public static void main(String[] args) {
        problem283 obj1=new problem283();
        int[] n1={0};
        obj1.moveZeroes(n1);
    }
}
