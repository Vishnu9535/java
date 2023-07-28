public class problem345 {
    public static void main(String[] args) {
        problem345 obj1 = new problem345();
        System.out.println(obj1.reverseVowels("hello"));
    }    
    public String reverseVowels(String s) {
        char[] s1=s.toCharArray();
        int index=-1;
        for(int i=0; i< s1.length;i++){
            if (s1[i] == 'a' || s1[i] == 'e' || s1[i] == 'i' || s1[i] == 'o' || s1[i] == 'u' )
            { 
             if(index != -1){
                char temp=s1[i];
                s1[i]=s1[index];
                s1[index]=temp;
             }
             index=i;
            }
        }
        s=String.copyValueOf(s1);
        return s;
    }

}
