import java.util.*;

public class rotate {
    public static void main(String[] args) {
        int[] arr = { 1, 22, 3, 4, 5, 6 };
        int r = 2;

        // for (int j = 0; j < r; j++) {
        //     int z = arr[arr.length-1];
        //     arr[arr.length-1] = arr[0];
        //     for (int i = 1; i < arr.length-1; i++) {
        //         arr[i - 1] = arr[i];
        //     }
        //     arr[arr.length-2]=z;
        //     // arr[arr.length - 1] = z;
        // }
        // System.out.println(Arrays.toString(arr));
        int[] temp = new int[r];
        for(int i = 0;i<r;i++){
            temp[i] = arr[i];
        }
         System.out.println(Arrays.toString(temp));

        for(int i =r;i<arr.length;i++){
            arr[i-r]= arr[i];
            System.out.println(arr[i-r]);
        }
        int l=0;
        for(int i = arr.length-r;i<arr.length;i++){
            arr[i]=temp[l];
            l++;
        }
        System.out.println(Arrays.toString(arr));

    }
}
