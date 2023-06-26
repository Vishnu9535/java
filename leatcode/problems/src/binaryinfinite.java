import java.util.*;
public class binaryinfinite {
    public int binary_infinite(int[] arr,int target){
        int[] ar1=find_range(arr, target);
        int start=ar1[0];
        int end=ar1[1];
        while(start <= end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid] > target){
                end=mid-1;
            }
            if(arr[mid] < target){
                start=mid+1;
            }
            
        }
        return -1;

    }
    public static int[] find_range(int[] arr,int target){
        int start=0;
        int end=1;
        int z=1;
        while (arr[end] < target){
            int nstart=end+1;
            end=end+(end-start+1)*2;
            start=nstart;
        }
        return new int[] {start,end};
    }
    public static void main(String[] args) {
        int[] arr={0,1,2,3,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        int target=19;
        binaryinfinite obj1=new binaryinfinite();
        int x=obj1.binary_infinite(arr, target);
        System.out.println(x);
    }   
}
