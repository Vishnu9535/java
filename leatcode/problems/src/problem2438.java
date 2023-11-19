public class problem2438 {
    public int[] productQueries(int n, int[][] queries) {
        int[] answers = new int[queries.length];
        int[] binary = new int[32];
        int id = 0;
        while(n > 0){
            binary[id] = n % 2;
            id++;
            n=n/2;
        }
        return answers;
    }
    public static void main(String[] args) {
        
    }
}
