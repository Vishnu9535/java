public class problem345 {
    public static void main(String[] args) {
        problem345 obj1 = new problem345();
    }    
    public String reverseVowels(String s) {
        char[] s1=s.toCharArray();
        char x='y';
        int index;
        String s2="";
        for(int i=0; i< s1.length;i++){
            if (s1[i] == 'a' || s1[i] == 'e' || s1[i] == 'i' || s1[i] == 'o' || s1[i] == 'u' )
            {
             if(x != 'y'){
                
             }
            }
            else{
                s2=s2+s1[i];
            }
        }
        return s2;

    }

}
