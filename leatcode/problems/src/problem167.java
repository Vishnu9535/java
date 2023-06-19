import java.util.Arrays;

public class problem167 {
     public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        int[] result=new int[2];
        // while(start <= end){
        //     mid=start+(end-start)/2;
        //     if(numbers[mid] < target){
        //         start=mid+1;
        //     }
        //     if(numbers[mid] > target){
        //         end=mid-1;
        //     }
        //     if(numbers[mid] == target){
        //         start=mid+1;
        //         break;
        //     }
        // }
        
        // int sum=0;
        // for(int i=0;i<start+1;i++){
        //     for(int j=i+1;j<start+1;j++){
        //         sum=numbers[i]+numbers[j];
        //         if(sum == target){
        //             result[0]=i+1;
        //             result[1]=j+1;
        //             return result;
        //         }
        //     }
        // }
        // return result;
            while(start < end  ){
                if(numbers[start]+numbers[end] > target){
                    end--;
                }
                if(numbers[start]+numbers[end] < target){
                    start++;
                }
                if(numbers[start]+numbers[end]==target){
                    result[0]=start+1;
                    result[1]=end+1;
                    return result;
                }
            }
            return result;
    }
    public static void main(String[] args) {
        int[] arr1={-1,0};
        int target= -1;
        problem167 obj1=new problem167();
        int[] r1=obj1.twoSum(arr1, target);
        System.out.println(Arrays.toString(r1));
    }
}
