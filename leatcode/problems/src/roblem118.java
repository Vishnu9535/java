import java.util.*;

public class roblem118 {
        public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> r1=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        temp.add(1);
        r1.add(temp);
        for(int i=1;i < numRows;i++){ 
            List<Integer> curr=new ArrayList<>();
            curr.add(1);
            for(int j=0;j<temp.size()-1;j++){
                 int x=temp.get(j)+temp.get(j+1);
                 curr.add(x);
            }
            curr.add(1);
            temp=curr;
            r1.add(temp);
        }
        // for(List obj:r1){
        //     List<Integer> te = obj;
        //     for(Integer x: te){
        //         System.out.print(x);
        //     }
        //     System.out.println();
        // }
        return r1;
    }
    public List<List<Integer>> generate1(int numRows) {
    int[][] result=new int[numRows][];
    for(int i=0;i < numRows;i++){
        int[] temp=new int[i+1];
        temp[0]=1;
        for(int j=0;j < i-1;j++){
            temp[j+1]=result[i-1][j] + result[i-1][j+1];
        }
        temp[temp.length-1]=1;
        result[i]=temp;
    }
    // for(int i=0;i<numRows;i++){
    //     for(int j=0;j<result[i].length;j++){
    //         System.out.print(result[i][j]);
    //     }
    //     System.out.println();
    // }
    return (List)Arrays.asList(result);
    }
        public static int ncr(int n,int k){
        int result;
        result=(int) (fact(n)/(fact(n-k)*fact(k)));
        return result;
    }
    public static long fact(int no){
        if(no == 0 || no==1){
            return 1;
        }
        long result=no;
        for(int i=no-1;i >0;i--){
            result=result*i;
        }
        return result;
    }
    public static void main(String[] args) {
        roblem118 obj1=new roblem118();
        int r=5;
        obj1.generate1(r);
    }
}
