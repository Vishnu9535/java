class problem121{
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int result=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            else{
            int x=prices[i]-buy;
            if(x>result){
                result=x;
            }
        }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        problem121 obj1=new problem121();
        int n=obj1.maxProfit(arr);
        System.err.println(n);
    }
}