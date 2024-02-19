public class permutation {
    
    public static void print_combination(String s,String f){
            if(s.isEmpty()){
                System.out.println(f);
                return;
            }
            char ch = s.charAt(0);
            for(int i = 0 ; i <= f.length() ;i++){
                String start = f.substring(0,i);
                String end = f.substring(i,f.length());
                print_combination(s.substring(1),start + ch +end);
            }

    }
    
    public static void main(String[] args) {
        print_combination("abc","");
    }
}
