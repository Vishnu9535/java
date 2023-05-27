import java.util.Arrays;

public class problem242 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        //sorting the strings
        char temp[]=s.toCharArray();
        char temp2[]=t.toCharArray();
        Arrays.sort(temp);
        Arrays.sort(temp2);
        if(Arrays.equals(temp, temp2)){
            return true;
        }
        else{
            return false;
        }
        // Hashmap<String, Integer> x
        
    }
    // public boolean isAnagram2(String s, String t) {
    //     if(s.length()!=t.length()){
    //         return false;
    //     }
    //     //sorting the strings
    //     // Hashmap<String, Integer> 
    //     char temp[]=s.toCharArray();
    //     char temp2[]=t.toCharArray();
    //     char c=s.charAt(0);
    //     String result1;
    //     for(int i=0;i<s.length();i++){
    //         char x=s.charAt(i);
    //         for(int j=i+1;j<s.length();j++){
    //             char z=s.charAt(j);
    //             if(z<x){
    //                 char temp=x;
                    
    //             }
    //         }
    //     }        
    // }
    public static void main(String[] args) {
        
    }
}
