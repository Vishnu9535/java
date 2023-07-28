public class problem345 {
    public static void main(String[] args) {
        problem345 obj1 = new problem345();
        System.out.println(obj1.reverseVowels2("A man, a plan, a canal: Panama"));
    }    
    public String reverseVowels(String s) {
        char[] s1=s.toCharArray();
        int index=-1;
        for(int i=0; i< s1.length;i++){
            if (s1[i] == 'a' || s1[i] == 'e' || s1[i] == 'i' || s1[i] == 'o' || s1[i] == 'u'|| s1[i] == 'A' || s1[i] == 'E' || s1[i] == 'I' || s1[i] == 'O' || s1[i] == 'U' )
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
    public String reverseVowels2(String s){
      char[] arr1=s.toCharArray();
      int start=0;
      int end = s.length()-1;
      while(start < end){
        if(not_vowel(arr1[start])){
            start++;
        }
       else if(not_vowel(arr1[end])){
            end--;
        }
        else{
            char temp = arr1[start];
            arr1[start] = arr1[end];
            arr1[end] = temp;
            start++;
            end--;
        }
      }  
      return String.copyValueOf(arr1);
    }
    public static boolean not_vowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'|| c == 'O' || c == 'U')
        {
            return false;
        }
        return true;
    }
}
