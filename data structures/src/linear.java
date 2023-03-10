class linear{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=3;
        // boolean x=linearsearch(arr, target);
        // System.out.println(x);
        String x="vishnu";
        char b='n';
        char a=linear2(x,b);
        System.out.println(a);
    }
    static boolean linearsearch(int[] arr ,int target){
        
        for(int i=0;i<arr.length;i++){
           if(arr[i]==target ){
            return true;
           }
        }
        
        return false;
    }
    static char linear2(String x,char y){
        for(char ch :x.toCharArray()){
            if(ch == y){
                return 'y';
            }
        }
        return '1';
    }
}