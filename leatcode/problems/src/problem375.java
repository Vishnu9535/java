public class problem375 {
        public static final int number = 45;
        public static int guess(int num){
            if(num > number){
                return -1;
            } 
            else if(num < number){
                return 1;
            }
            else{
                return 0;
            }
        }
    public int guessnumber(int n){
        int start =1;
        int end = n;
        int mid =-1;
        while(start <= end){
            mid = start + (end - start)/2;
            if(guess(mid) == 0){
                break;
            }
            if(guess(mid) == 1){
                end =mid-1;
            }
            else if(guess(mid) == -1){
                start = mid+1;
            }
        }
        return mid;
    }
    public static void main(String[] args) {
    
    }

}
