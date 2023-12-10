import java.util.ArrayList;
import java.util.List;

public class problem39 {
     public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp =new ArrayList<>();
        back_track(candidates, target, result, temp, 0);
        return result;

        

        
    }
    public static void back_track(int[] candidates,int remain,List<List<Integer>> result,List<Integer> temp,int start){
        if(remain < 0){
            return;
        }
        if(start == candidates.length){
            if(remain == 0){
            result.add(new ArrayList<>(temp));
        }
            return;
        }
        if(candidates[start] < remain){
        
            temp.add(candidates[start]);
            // System.err.println(temp+"a");
            back_track(candidates,remain-candidates[start], result, temp,start);
            temp.remove(temp.size()-1);
            // System.err.println(temp);
        }
        back_track(candidates, remain, result, temp, start+1);
    }
    public static void back_track1(int[] candidates,int remain,List<List<Integer>> result,List<Integer> temp,int start){
        if(remain < 0){
            return;
        }

        if(remain == 0){
            result.add(new ArrayList<>(temp));
        }
        else{

        for(int i = start;i< candidates.length;i++){
            temp.add(candidates[i]);
            // System.err.println(temp+"a");
            back_track1(candidates,remain-candidates[i], result, temp,i);
            temp.remove(temp.size()-1);
            // System.err.println(temp);

        }
    }
    }
    public static void main(String[] args) {
        int[] a = {2,3,6,7};
        int target = 7;
        List<List<Integer>> x1 = combinationSum(a, target);
        for(List<Integer> i :x1){
            for(Integer value : i){
                System.out.print(value+" ");
            }
            System.out.println();
            
        }
    }
}
