public class subsets {
 public static void main(String[] args) {
        String a = "baccab";
        String result = "";
        // make_subsets(a,result,0);
        // skipas(a, result);
        // System.out.println(result);
        System.out.println(skipas(a));

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
}
