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
    }b
    public void moveZeroes2(int[] nums) {
        int pos=0;
        for(int i=0;i < nums.length;i++){
            if(nums[i]!=0){
                nums[pos]=nums[i];
                pos++;
            }
        }      
        for(int i=pos;i<nums.length;i++){
            nums[i]=0;
        }
    }
    public static void main(String[] args) {
        problem283 obj1=new problem283();
        int[] n1={0,1,0,3,12};
        obj1.moveZeroes2(n1);
    }
}
