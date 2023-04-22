import java.util.*;
public class problem387 {
    public int uniquechar(String s){;
        int index=-1;
         char[] c=s.toCharArray();
        //  int[] x=new int[c.length];
        // Arrays.sort(c);
        // System.out.println(Arrays.toString(c));
        // for(int i=1;i<c.length;i++){
        //     if(c[i]!=c[i-1]){
        //      index=i-1;
        //      break;
        //     }
        // }
        
         return index;
    }
    public static void main(String[] args) {
        problem387 obj1=new problem387();
        String s="loveleetcode";
        int index=obj1.uniquechar(s);
        System.out.println(index);
    }
}
