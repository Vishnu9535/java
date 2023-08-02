public class problem605 {
    public static void main(String[] args) {
        int[] arr= {0};
        int n=1;
        problem605 obj1 = new problem605();
        boolean x= obj1.canPlaceFlowers(arr, n);
        System.out.println(x);
    }
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int counter=0;
        int i=0;
        if(n == 0) {
            return true;
        }
        if(flowerbed.length == 1 ){
            if(flowerbed[0]==0 && n== 1){
                return true;
            }
            return false;
        }
        while(i < flowerbed.length){
            int front = i+1;
            int back = i-1;
            if(i == 0 && flowerbed[i] == 0 && flowerbed[front] == 0){
                flowerbed[i] = 1;
                counter ++;
            }
       
            else if(i == flowerbed.length - 1 && flowerbed[back] == 0 && flowerbed[i] ==  0){
                flowerbed[i] = 1;
                counter++;
            }
            else if(i !=0 && flowerbed[back] == 0 && front < flowerbed.length && flowerbed[front] == 0 && flowerbed[i] == 0){
                flowerbed[i] = 1;
                counter ++;
            }
            if(counter == n){
                return true;
            }
            i++;
        } 
        return false;
    } 
       
}

