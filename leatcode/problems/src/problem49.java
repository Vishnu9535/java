import java.lang.reflect.Array;
import java.util.*;

public class problem49 {
        public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String x = new String(temp);
            if(!map.containsKey(x)){
                map.put(x,new ArrayList<>());
            }
            map.get(x).add(str);
        }
        System.out.println(map.toString());
        List<List<String>> res = new ArrayList<>(map.values());
            return res;
    }
    public void sameple(String str){
        char[] chars = new char[26];
        for(char x : str.toCharArray()){
            chars[x - 'a']++;

            }
            String m = new String(chars);
            System.out.println(m);
    }

    public static void main(String[] args) {
        String[] res = {"eat","tea","tan","ate","nat","bat"};
        problem49 obj1 = new problem49();
        obj1.groupAnagrams(res);
        obj1.sameple("eat");

    }
}
