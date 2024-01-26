import java.util.Arrays;

public class bubblesor {
    public static void main(String[] args) {
        int[] arr = {98,56,75,32,100,2,45};
        int length= arr.length;
        for(int i = 0 ; i < length;i++){
            for(int j =0;j < length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
        }   
        System.out.println(Arrays.toString(arr));
    }
}
