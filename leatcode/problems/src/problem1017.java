public class problem1017 {
    public String gcdOfStrings(String str1, String str2) {
        String s1 = str1 + str2;
        String s2 = str2 + str1;
        if(str1 == str2){
            return "";
        }
        else{
            
        }
    }
    public static void main(String[] args) {
        String s1 = "ABABAB";
        String s2 = "ABAB";
        problem1017 obj1 = new problem1017();
        System.out.println(obj1.gcdOfStrings(s1, s2));
    }
}
