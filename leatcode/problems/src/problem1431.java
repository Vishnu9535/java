import java.util.ArrayList;
import java.util.List;

public class problem1431 {
    public static void main(String[] args) {
        int[] arr={2,3,5,1,3};
        System.out.println(kidsWithCandies(arr,3));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> a1 = new ArrayList<>();
        int max=candies[0];
        for (int i = 1; i < candies.length ;i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for(int i = 0;i< candies.length; i++){
            int temp =  candies[i] + extraCandies;
            if(temp >= max){
                a1.add(true);
            }
            else{
                a1.add(false);
            }
        }
        return a1;

    }
}
