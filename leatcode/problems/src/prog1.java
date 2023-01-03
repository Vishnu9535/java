// Input: strs = ["cba","daf","ghi"]
// Output: 1
// Explanation: The grid looks as follows:
//   cba
//   daf
//   ghi
// Columns 0 and 2 are sorted, but column 1 is not, so you only need to delete 1 column.
public class prog1 {
    static int minDeletionSize(String[] strs) {
        int m=0;
        for(int i=0;i < strs.length;i++){
            for(int j=0;j < strs[i].length();j++){
                char c=strs[i].charAt(j);
            }
        }
        return m;
    }
    public static void main(String[] args) {
        // char s='b';
        // char b='z';
        // if(s<b){
        //     System.out.println("yes");
        // }
        // else{
        //     System.out.println("no");
        // }
        String[] strs=new String[]{"cba","daf","ghi"};
        String[] x={"yfb","cbv"};
        int z=minDeletionSize(strs);
    }
}

