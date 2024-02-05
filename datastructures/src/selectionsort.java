import java.util.Arrays;

public class selectionsort {
 public static void main(String[] args) {
    int[] arr = {5,6,89,3,22,100,101,1,2,99};
    // for(int i = 0 ;i< arr.length;i++){
    //     int max=i;
    //     int j=0;
    //     for(j =i+1;j < arr.length;j++){
    //         if(arr[j] < arr[max]){
    //             max = j;
    //         }
    //     }
    //         int temp = arr[i];
    //         arr[i] = arr[max];
    //         arr[max]= temp;
    // }
    // System.out.println(Arrays.toString(arr));
    selection_sort(arr,arr.length,0,0);
    System.out.println(Arrays.toString(arr));
 }   
 static void normal_selection(int[] arr ){
    for(int i =0; i< arr.length; i++){
        int max= arr.length-i-1;
        for(int j =0; j < arr.length-i;j++){
            if(arr[j] > arr[max]){
                max= j;
            }
        }
        int temp=arr[arr.length-i-1];
        arr[arr.length-i-1]= arr[max];
        arr[max]= temp;
    }
    System.out.println(Arrays.toString(arr));
 }
 static void selection_sort(int[] arr,int r,int c, int max){
    if(r == 0){
        return;
    }   
    if(c < r){
        if(arr[c] > arr[max]){
            max = c;
            
        }
        selection_sort(arr, r, c+1, max);
    }
    else{
        int temp = arr[max];
        arr[max] = arr[r-1];
        arr[r-1] = temp; 
        selection_sort(arr, r-1, 0, 0);
    }
 }
}