public class recursion1 {
    public static void main(String[] args) {
        //  recursion obj1 = new recursion();
        //  print_numbers(1);
         System.out.println(fibonaccino(1));
                int[] arr={1,3,5,7,9,13,15};
        int target =  16;
        int start = 0;
        int end =arr.length-1;
        System.out.println((binary_search(arr, target,start, end )));
    }
    public static void  print_numbers(int n){
        if(n == 6){
            return;
        }  
        System.out.println(n);
        // this is tail recursion 
        print_numbers(n+1);


    }
    public static int fibonaccino(int n){
        if(n < 2){
            return n;
        }
        int x=fibonaccino(n-1);
        int y=fibonaccino(n-2);

        // System.out.println(x+" "+y+" ");
        return x+y;
    }
    public static int binary_search(int[] arr1,int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid=start+(end - start)/2;
        if(arr1[mid] == target){
            return mid;
        }
        if(arr1[mid] > target){
            end = mid-1;
         }
        else if(arr1[mid] < target){
        start = mid+1;
        }
        return binary_search(arr1,target,start,end);
        
        // return binary_search(arr1,target,start, end);

    }
}
