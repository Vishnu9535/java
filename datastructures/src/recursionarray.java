import java.util.ArrayList;

public class recursionarray {
    static boolean check_sorted(int[] arr , int index){
        if(arr.length-1 == index){
            return true;
        }
        else if(arr[index] <= arr[index+1]){
            return check_sorted(arr, index+1);
        }
        else {
            return false;
        }
    }
    static boolean linear_search(int[] arr, int index, int target){
        if(arr.length ==index){
            return false;
        }
        else if(arr[index] == target){
            return true;
        }
            return linear_search(arr, index+1, target);
    }
     static int linear_searchindex(int[] arr, int index, int target){
        if(arr.length ==index){
            return -1;
        }
        else if(arr[index] == target){
            return index;
        }
        else
            return linear_searchindex(arr, index+1, target);
    }
    static ArrayList<Integer> a1 = new ArrayList<>();
     static void linear_search_all(int[] arr, int index, int target){
        if(arr.length ==index){
            return ;
        }
        else if(arr[index] == target){
            a1.add(index);
        }
        linear_search_all(arr, index+1, target);
    }
    public static void main(String[] args) {
        int[] arr = {1,4,2,8,10,12,12};
        recursionarray obj1 = new recursionarray();
        // System.out.println(check_sorted(arr, 0));
        linear_search_all(arr, 0, 12);
        System.out.println(a1);
    }
}
