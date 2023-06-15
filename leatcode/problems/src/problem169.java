import java.util.HashMap;
import java.util.Map;

class problem169{
      public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int num=0;
        for(int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
       for(HashMap.Entry<Integer,Integer> entry:map.entrySet()){
        if(entry.getValue() > count){
            num=entry.getKey();
            count=entry.getValue();
        }
       }
       return num;
    }
    public static void main(String[] args) {
        problem169 n1=new problem169();
        int arr[]={2,2,1,1,1,2,2};
        int x=n1.majorityElement(arr);
        System.out.println(x);
    }
}
