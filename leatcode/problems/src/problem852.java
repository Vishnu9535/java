public class problem852 {
        public int peakIndexInMountainArray(int[] arr) {
            int start=0;
            int end=arr.length-1;
            while (start <= end){
                int peak=start + (end-start)/2;
                if(peak > start){
                 if(arr[peak] > arr[peak-1]){
                    if(peak < arr.length-1){ 
                    if(arr[peak] > arr[peak+1]){
                        return peak;
                    }
                    else{
                        start=peak;
                    }
                    }  
                    else{
                        return peak;
                    }           
                }
                else{
                    end=peak;
                }
            }
            else{
                return peak;
            }
            }
            return -1;
    }
     public int peakIndexInMountainArray1(int[] arr) {
     int start=0;
     int end =arr.length-1;
        while(start < end){
            int mid=start+(end - start)/2;
            if(arr[mid] < arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }

        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr={0,10,5,2};
        problem852 obj1=new problem852();
        int peak=obj1.peakIndexInMountainArray1(arr);
        System.out.println(peak);
    }
}
