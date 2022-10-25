//join arraays

import java.util.*;

class concat{
    public int[] getConcatination(int[] nums){
        int ans[]=new int[2*nums.length];
        // for(int i=0;i<nums.length;i++)
        //      ans[i]=nums[i];
        // int count=0;
        // for(int i=nums.length;i<ans.length;i++){
        //     ans[i]=nums[count];
        //     count++;
        // }
        for(int i=0;i<nums.length;i++){
             ans[i]=nums[i];
             ans[i+nums.length]=nums[i];
        }
        return ans;  
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array size ");
        int arraysize=sc.nextInt();
        int[] nums=new int[arraysize];
        System.out.println("Enter the array elements");
        for(int i=0;i<nums.length;i++)
        nums[i]=sc.nextInt();
        concat obj1=new concat();
        int ans[];
        ans=obj1.getConcatination(nums);
        System.out.print(Arrays.toString(ans));
    }
}