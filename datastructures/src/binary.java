public class binary {
    public static void main(String[] args) {
        binary o1=new binary();
        int[] arr={1,2,3,4,7,8};
        int target=5;
        int result=o1.cieling2(arr, target);
        // int result=o1.order_egnostic(arr, target);
        System.out.println(result);
    }
    int binarysearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int index=0;
        int comp=0;
        while(start<= end){
        index=start+(end-start)/2;
        //start/2 + end/
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
        int order_egnostic(int[] arr,int target){   
              boolean check=arr[0] < arr[arr.length-1];
              int start=0;
              int end=arr.length-1;
              while(start <= end){
              int index=start + (end - start) / 2;
              if(arr[index]==target){
                return index;
              }
              if(check){
                if(target < arr[index]){
                    end=index-1;
                }
                else{
                    start=index+1;
                }
              }
              else{
                if(target < arr[index])
                {
                    start=index+1;        
                }
                else
                {
                    end=index-1;
                }
            }
        }
            
              return -1;
}
    int floor(int[] arr , int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int index=(start+end)/2;
            if(arr[index]==target){
                return arr[index];
            }
            else if(arr[index] > target){
                end=index-1;
            }
            else{
                start=index+1;
            }
        }
        return arr[end];
    }
    
    int cieling2(int[] arr , int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int index=(start+end)/2;
            if(arr[index]==target){
                return arr[index];
            }
            else if(arr[index] > target){
                end=index-1;
            }
            else{
                start=index+1;
            }
        }
        return arr[start];
    }
}