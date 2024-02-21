import java.lang.reflect.Array;
import java.util.*;

public class permutation {

    public static void print_combination(String s, String f, List<String> result) {
        if (s.isEmpty()) {
            System.out.println(f);
            result.add(f);
            return;
        }
        char ch = s.charAt(0);
        for (int i = 0; i <= f.length(); i++) {
            String start = f.substring(0, i);
            // System.out.println(start);
            String end = f.substring(i, f.length());
            // System.out.println(end);
            print_combination(s.substring(1), start + ch + end, result);
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }

    private static  void  backtrack(int[] nums, List<Integer> tempList, List<List<Integer>> result) {
        if (tempList.size() == nums.length) {
        result.add(new ArrayList<>(tempList));
        return;
  }
        for (int i = 0; i < nums.length; i++) {
            if (tempList.contains(nums[i]))
                continue;
            tempList.add(nums[i]);
            backtrack(nums, tempList, result);
            tempList.remove(tempList.size() - 1);
  }
}

    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<String>();
        // print_combination("abc", "", result);
        // System.out.println(result);
        System.out.println(permute(new int[] { 1, 2, 3 }));
    }
}
