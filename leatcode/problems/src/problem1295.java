// 1295. Find Numbers with Even Number of Digits
import java.util.*;
class problem1295{
    public static void main(String[] args) {
        problem1295 obj1=new problem1295();
        int[] arr= {555,901,482,1771};
        int result=obj1.find_numbers(arr);
        System.out.println(result);
    }
    public int find_numbers(int[]nums){
        int result=0;
        for(int i=0;i<nums.length;i++){
            String s=Integer.toString(nums[i]);
            if((s.length())%2 == 0){
                result++;
            }
        }
        return result;
    }
}