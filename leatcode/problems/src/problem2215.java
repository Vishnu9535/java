import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class problem2215 {
      public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet <>();
        HashSet<Integer> s2 = new HashSet<>();
        List<List<Integer>> f1 = new ArrayList<>();
        for(int i = 0 ; i < nums1.length; i++){
            int flag=0;
            for(int j = 0;j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    flag =1;
                    break;
                }
            }
            if(flag == 0){
                s1.add(nums1[i]);
            }
        }
          for(int i = 0 ; i < nums2.length; i++){
            int flag=0;
            for(int j = 0;j < nums1.length; j++){
                if(nums2[i] == nums1[j]){
                    flag =1;
                    break;
                }
            }
            if(flag == 0){
                s2.add(nums2[i]);
            }
        }
        List<Integer> s1List = new ArrayList<>(s1);
        List<Integer> s2List = new ArrayList<>(s2);
        f1.add(s1List);
        f1.add(s2List);
        return f1;
    }
    public static void main(String[] args) {
        int[] n1 = {1,2,3,4,5};
        int[] n2 = {2,3,4};
    }
}
