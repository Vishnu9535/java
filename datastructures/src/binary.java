public class binary {
    public static void main(String[] args) {
        binary o1=new binary();
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=7;
        int result=o1.binarysearch(arr, target);
        System.out.println(result);
    }
    int binarysearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int index=0;
        int comp=0;
        while(start<= end){
        index=(start+end)/2;
        if(arr[index] == target){
            comp++;
            return index;
        }
        else if(arr[index]>target){
            comp++;
            end=index-1;
        }
        else if(arr[index]<target){
            comp++;
            start=index+1;
        }
        }
        System.out.println(comp);
        return -1;
        }
}