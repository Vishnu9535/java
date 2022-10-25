//finding unique elements in the array

import java.util.*;
public class Solution {
    static int singleNumber(int nums[]) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]!=nums[j]){
                return nums[i];
              } 
            }
            }

            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]!=0){
                  return nums[i];
                }
            }
            return 0;
        }

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        int nums[];
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array size ");
        int arraysize=sc.nextInt();
            nums=new int[arraysize];     
            System.out.print("enter the array elements ");
            for(int i=0;i<nums.length;i++){
                    nums[i]=sc.nextInt();
                }
        singleNumber(nums);
        
}
}