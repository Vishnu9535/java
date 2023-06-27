import java.util.*;

public class roblem118 {
        public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> r1=new ArrayList<>();
        for(int i=0;i < numRows;i++){ 
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<=i;j++){
                 int x=ncr(i,j);
                 temp.add(x);
            }
            r1.add(temp);
        }
        // for(List obj:r1){
        //     List<Integer> temp = obj;
        //     for(Integer x: temp){
        //         System.out.print(x);
        //     }
        //     System.out.println();
        // }
        return r1;
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
        obj1.generate(r);
    }
}
