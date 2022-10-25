// //Input: nums = [1,2,3,1]
// Output: 4
// Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
// Total amount you can rob = 1 + 3 = 4.
import java.util.*;
public class robs {
    public int rob(int[] nums){
        int loot1=0;
        int loot2=0;
        if(nums.length%2!=0){
        
        for(int i=0;i<nums.length;i++){
            loot1=loot1+nums[i];
            i++;
    }
    for(int i=1;i<nums.length;i++){
          loot2=loot2+nums[i];
          i++;
    }
     if(loot1>loot2)
        return loot1;
     else
     return loot2;
}
else{
for(int i=0;i<nums.length;i++){
    if(nums[i+2]>nums[i+3]){
        loot1=loot1+nums[i+2];
        i++;
    }
    else{
        loot1=loot1+nums[i+3];
        i++;
        i++;
    }
}
    for(int i=1;i<nums.length;i++){
        if(nums[i+2]>nums[i+3]){
            loot2=loot2+nums[i+2];
            i++;
        }
        else{
            loot2=loot2+nums[i+3];
            i++;
        }
}
    
if(loot1>loot2)
return loot1;
else
return loot2;
}
}

// if (nums.length == 1)
// return nums[0];
// if (nums.length == 2)
// return Math.max(nums[0], nums[1]);

// int maxSum = 0;
// int scheme1 = nums[0];
// int scheme2 = Math.max(nums[0], nums[1]);

// for (int i = 2; i < nums.length; i++){
// maxSum = Math.max(scheme1 + nums[i], scheme2);
// scheme1 = scheme2;
// scheme2 = maxSum;
// }

// return maxSum;
// }

    public static void main(String[] args){
        int nums[];
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array size ");
        int arraysize=sc.nextInt();
        nums=new int[arraysize];     
        System.out.print("enter the array elements ");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
         int loot;
        robs obj1=new robs();
        loot=obj1.rob(nums);
        System.out.println(loot);
    }
}
