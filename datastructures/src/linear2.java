import java.util.*;
class linear2{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=37;
        linear2 obj1=new linear2();
        // boolean x=linearsearch(arr, target);
        // System.out.println(x);
        // String x="vishnu";
        // char b='n';
        // boolean a=obj1.linear2d(x,b);
        // System.out.println(a);
        int[][] arr2={{5,6,7,8,9},{11,12,13,14,15,16,2},{21,22,23,24,25},{31,32,33,34,35,37}};
        int[] f1=obj1.array2d(arr2, target);
        System.out.println(Arrays.toString(f1));
    }
    static boolean linearsearch(int[] arr ,int target){
        
        for(int i=0;i<arr.length;i++){
           if(arr[i]==target ){
            return true;
           }
        }
        
        return false;
    }
    boolean linear2d(String x,char y){
        for(char ch :x.toCharArray()){
            if(ch == y){
                return true;
            }
        }
        return false;

        
    }
    int[] array2d(int[][] arr,int target){
         
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }

            }
        }
        
        return new int[]{-1,-1};
    }

}