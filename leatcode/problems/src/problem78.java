import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> a1 = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        make_subsets(nums,0, a1, subset);
        System.out.println(a1);
        return a1;
    }
    public static void make_subsets(int[] nums,int index, List<List<Integer>> arr, List<Integer> subset) {
        if (index >= nums.length) {
            arr.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[index]);
        System.out.println(index);
        make_subsets(nums,index+1, arr, subset);
        subset.remove(subset.size() - 1);
        System.out.println(index+"hi");
        make_subsets(nums,index+1, arr, subset);
    }
    public static void make_subsets1(int[] nums, int index, List<List<Integer>> arr, List<Integer> subset) {
        if (index == nums.length) { // Check if all elements have been processed
            arr.add(new ArrayList<>(subset));
            return;
        }
        // Include current element
        subset.add(nums[index]);
        make_subsets1(nums, index + 1, arr, subset);
        subset.remove(subset.size() - 1); // Backtrack (exclude current element)
        make_subsets1(nums, index + 1, arr, subset);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        problem78 p78 = new problem78();
        p78.subsets(arr);
    }
}
