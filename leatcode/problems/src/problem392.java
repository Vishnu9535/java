public class problem392 {
    public boolean isSubsequence(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        String m="";
        for(int i=0;i < arr1.length;i++){
            m=m+"0";
        }
        int j =0;

        for(int i=0 ; i< arr1.length ; i++){
            while(j < arr2.length){
                if(arr1[i] == arr2[j]){
                    arr1[i] = '0';
                    arr2[j] = '0';
                    break;
                }
                j++;
            }
        }
        // System.out.println(m);
        String str = new String(arr1);
        if(str.equals(m)){
            return true  ;
  }
        return false;
        
    }
    public static void main(String[] args) {
        problem392 obj1 = new problem392();
        System.out.println(obj1.isSubsequence("abc","ahbgdc"));
    }
}
