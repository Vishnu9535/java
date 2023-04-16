class problem1672{
    public static void main(String[] args) {
        problem1672 obj1=new problem1672();
        int[][] arr={{1,2,3},{3,2,1}};
        int result=obj1.maximumWealth(arr);
        System.out.println(result);
    }
    public int maximumWealth(int[][] accounts) {
        int result=0;
        for(int i=0;i<accounts.length;i++){
            int x=0;
            for(int j=0;j<accounts[i].length;j++){
                x=x+accounts[i][j];
            }
            if(result < x){
                result=x;
            }
        }
        return result;
    }
}