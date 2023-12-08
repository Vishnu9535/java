import java.util.Arrays;

public class problem2438 {
    public int[] productQueries(int n) {
        int[] answers = new int[10];
        int[] binary = new int[32];
        int id = 0;
        while(n > 0){
            binary[id] = n % 2;
            id++;
            n=n/2;
        }
        int[] powers = new int[id];
        for(int i =0 ; i < id; i++){
            powers[i] = (int) Math.pow(2,i)*binary[id-1];
        }
        System.out.println(Arrays.toString(powers));
        return answers;
    }
    public static void main(String[] args) {

        problem2438 obj1 = new problem2438();
        obj1.productQueries(31);
    }   
}
