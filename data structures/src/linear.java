class linear{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=3;
        boolean x=linearsearch(arr, target);
        System.out.println(x);
    }
    static boolean linearsearch(int[] arr ,int target){
        
        for(int i=0;i<arr.length;i++){
           if(arr[i]==target ){
            return true;
           }
        }
        
        return false;
    }
}