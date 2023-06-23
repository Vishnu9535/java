import java.util.Arrays;

public class problme557 {
       public String reverseWords(String s) {
        String result="";
        String[] arr1=s.split(" ");
        // System.out.println(Arrays.toString(arr1));
        for(int i=0;i<arr1.length;i++){
                for(int j=arr1[i].length()-1;j>=0;j--){
                    result=result+arr1[i].charAt(j);
                }
                if(i<arr1.length-1)
                result=result+" ";
        }
        // System.out.println(result);
        return result;

    }
    public static void main(String[] args) {
        problme557 obj1=new problme557();
        String s="Let's take LeetCode contest";
        String result=obj1.reverseWords(s);
        System.out.println(result);
    } 
}
