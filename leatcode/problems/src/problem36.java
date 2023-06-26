import java.util.HashMap;

public class problem36 {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character,Integer> h1=new HashMap<>();
        for(int i=0;i < 9;i++){
            for(int j=0;j < 9;j++){
                if(board[i][j]!='.');
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char[][] t1= {
    {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
    {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
    {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
};
    problem36 obj1=new problem36();
    boolean x=obj1.isValidSudoku(t1);
    System.out.println(x);
    }
}
