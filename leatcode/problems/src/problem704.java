public class problem704 {
    public int search(int[] nums, int target) {
        int first=0;
        int last=nums.length-1;
        int mid=0;
        while(first <= last){
             mid=first+ (last-first)/2;
             if(nums[mid]==target){
                return mid;
             }
             if(nums[mid] > target){
                last=mid-1;
             }
             if(nums[mid] < target){
                first=mid+1;
             }
        }
        return -1;
    }
    public static void main(String[] args) {
        problem704 obj1=new problem704();
        int[] nums={-1,0,3,5,9,12};
        int target=9;
        int r=obj1.search(nums, target);
        System.out.println(r);
    }
}
