import java.util.*;
public class problem387 {
    public int uniquechar(String s){;
        int index=-1;
         char[] c=s.toCharArray();
         HashMap<Character,Integer> d1=new HashMap<>();
        for(char ch:c){
            if(d1.containsKey(ch)){
                d1.put(ch, d1.get(ch)+1);
            }
            else{
                d1.put(ch,1);
            }
        }
        for(int i=0;i<c.length;i++){
            if(d1.containsKey(c[i])&&d1.get(c[i])==1){
                return i;
            }
        }
         return index;
    }
    public static void main(String[] args) {
        problem387 obj1=new problem387();
        String s="loveleetcode";
        int index=obj1.uniquechar(s);
        System.out.println(index);
    }
}
