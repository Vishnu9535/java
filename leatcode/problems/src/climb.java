public class climb {
    public int minCostClimbingStairs(int[] cost, int n) {
        // int finalcost =0;
        // int i=0;
        // if(cost.length % 2 !=0){
        //     finalcost = cost[1];
        //     i=2;
        // }
        // else if(cost[0] < cost[1]){
        //     finalcost = cost[0];
        //     i=3;
        // }
        // else{
        //     finalcost = cost[1];
        // }
        
        // while(i < cost.length){
        //     if(i + 2 >= cost.length || i + 1 >= cost.length){
        //         break;
        //     }
        //     int temp1=finalcost + cost[i];
        //     int temp2 = finalcost +cost[i+1];
        //     if(temp1 < temp2){
        //         finalcost = finalcost + temp1;
        //         i++;
        //     }
        //     else{
        //         finalcost = finalcost+temp2;
        //         i=i+2;
        //     }
        //     // System.out.println(finalcost);
        // }
        // System.out.println(finalcost);
        if(n<0){
            return 0;
        }
        if (n==0 || n==1){
            return cost[n];
        }
        int x= cost[n]+Math.min(minCostClimbingStairs(cost, n-1),minCostClimbingStairs(cost, n-2));
        // int y = cost[n] + Math.min(minCostClimbingStairs(cost, n-2),minCostClimbingStairs(cost, n-3));
        return x;
    }
    // public static int mincost(int[] arr , int n){
    
    // }
    public static void main(String[] args) {
        climb obj1 = new climb();
        int[] arr = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(obj1.minCostClimbingStairs(arr,arr.length-1));
    }
}
