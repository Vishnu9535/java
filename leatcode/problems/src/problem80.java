import java.util.HashMap;

public class problem80 
{
    public int removeDuplicates(int[] nums) {
        int k=0;
        HashMap<Integer ,Integer> v=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(v.containsKey(nums[i])){
                nums[i]++;
            }
            else {
                v.put(nums[i], 1);
        }
    }
     for(int i = 0; i < nums.length; i++){
        if(v.get(i) >= 2){
              nums[i]=v.get()
        }
    }
         return k;
}
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3};
        problem80 obj1=new problem80();

    }
}
