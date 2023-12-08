public class problem1616 {
    public boolean checkPalindromeFormation(String a, String b) {
        String ap = "",as=a,bp="",bs =b;
        for(int i = 0; i < b.length();i++){
            
            // for(int j =0 ; j <  a.length();j++){
               
            // }
            //  if ((ispalindrome(ap+bs))) {
            //         return true;
            //     }
            // else if((palindrome(bp+as))){
            //         return true;
            //     }
            ap = a.substring(0,i);
            as = a.substring(i, a.length());
            System.out.println(as);

            bp = b.substring(0,i);
            bs = b.substring(i, b.length());
        }
        return false;
    }
    public boolean checkPalindromeFormation1(String a, String b) {

        int i = 0;
        int j = b.length()-1;
        while(i < j && a.charAt(i) == b.charAt(j)){
            i++;
            j--;
        }
        return isPalindrome(a, i, j) || isPalindrome(b, i, j);

    }
 static boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                System.out.println(str.charAt(start)+str.charAt(end));
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        problem1616 obj1 = new problem1616();
        // System.out.println(obj1.checkPalindromeFormation1("ulakcf","fckgij"));
        System.out.println(obj1.checkPalindromeFormation1("fcgijgvjhh", "ulakcf"));
    }
}
