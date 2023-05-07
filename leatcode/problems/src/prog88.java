import java.util.*;
public class prog88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int k=0;
        for(int i=m;i<nums1.length;i++){
        nums1[i]=nums2[k];
        k++;
      }
      Arrays.sort(nums1);
      
    }
    public static void main(String[] args) {
        
    }
}
