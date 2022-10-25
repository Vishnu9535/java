import java.util.*;
public class rough {
    public static void main(String[] args){
        int arr[] = new int[5];
        arr[0]=55;
        arr[1]=16;
        arr[2]=3;
        arr[3]=3;
        arr[4]=56;
        int key=3;
        System.out.println(Arrays.binarySearch(arr,key));
    }
}
