public class problem1017 {
    public String gcdOfStrings(String str1, String str2) {
        String s1 = str1 + str2;
        String s2 = str2 + str1;
        int len1 = str1.length();
        int len2 = str2.length();
        if(!s1.equals(s2)){
            System.out.println(s1);
            return "";
        }
        // else if(len2 % 2 != 0 || len1 % len2 == 0){
        //     return str1.substring(0,len2);
        // }
        // else{
        //     return str1.substring(0,len1 % len2);
        // }
        int x;
        while(len2!=0){
        x = len1;
        len1= len2;
        len2 = x % len2;
        }
        return str1.substring(0, len1);
    }
    public static void main(String[] args) {
        String s1 = "ABCABC";
        String s2 = "ABC";
        problem1017 obj1 = new problem1017();
        System.out.println(obj1.gcdOfStrings(s1, s2));
    }
}
