public class problem345 {
    public static void main(String[] args) {
        problem345 obj1 = new problem345();
        System.out.println(obj1.reverseVowels("hello"));
    }    
    public String reverseVowels(String s) {
        char[] s1=s.toCharArray();
        int index=-1;
        String s2="";
        for(int i=0; i< s1.length;i++){
            if (s1[i] == 'a' || s1[i] == 'e' || s1[i] == 'i' || s1[i] == 'o' || s1[i] == 'u' )
            { 
             if(index != -1){
                char temp=s1[i];
                System.out.println(s1[i]);  
                s1[i]=s1[index];
                System.out.println(s1[i]);
                s1[index]=temp;
                System.out.println(s1[index]);

             }
             index=i;
             
            }
            s2=s2+s1[i];
        }
        return s2;

    }

}
