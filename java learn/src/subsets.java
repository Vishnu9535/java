import java.util.*;
public class subsets {
    static void generateSubsets(String a , String q){
        if(a.isEmpty()){
            System.out.println(q);
            return;
        }
        generateSubsets(a.substring(1),q+a.charAt(0));
        generateSubsets(a.substring(1),q);
        
    }
 public static void main(String[] args) {
        String a = "abc";
        String result = "";
        // make_subsets(a,result,0);
        // skipas(a, result);
        // System.out.println(result);
        // System.out.println(skipas(a));
        // System.out.println(skipapple(a));
        // System.out.println(skipapplenotapp(a));
        generateSubsets(a, "");


 }   

 public static String make_subsets(String a,String result,int i){
        if(i == a.length()){
            return result;
        }
        else if(a.charAt(i) != 'a'){
            result = result + a.charAt(i);
        }
        i=i+1;
        return make_subsets(a, result, i);
 }
 static void skipas(String a,String result){
    if (a.isEmpty()){
        System.out.println(result);
        return ; 
    }
    char ch = a.charAt(0);
    if(ch == 'a'){
        skipas(a.substring(1),result);
    }
    skipas(a.substring(1),result+ch);
 }
 static String skipas(String a){
    if (a.isEmpty()){
        return ""; 
    }
    char ch = a.charAt(0);
    if(ch == 'a'){
        return skipas(a.substring(1));
    }

    return ch +skipas(a.substring(1));
 }
static String skipapple(String a){
    if(a.isEmpty()){
        return "";
    }
    if(a.startsWith("apple")){
        return skipapple(a.substring(5));
    }
    return a.charAt(0)+skipapple(a.substring(1));
}
static String skipapplenotapp(String s){
    if(s.isEmpty()){
        return "";
    }
    if(s.startsWith("app") && !s.startsWith("apple")){
        return skipapplenotapp(s.substring(3));
    }
    return s.charAt(0) + skipapplenotapp(s.substring(1));
}

}
