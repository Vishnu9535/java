public class casear {
    public static void main(String[] args) {
        String s = "All the best";
        int shift = 1;
        charspace(s, shift);
    }
    public static   void charspace(String s, int shift){
        int x;
        String  result = "";
        for(int i =0 ; i < s.length();i++){
            if(s.charAt(i) != ' '){
            x = s.charAt(i) - '0' + shift;
            result = result +(char) (x + '0');
            }
            else{
                result = result + s.charAt(i);
            }
        }   
        System.out.println(result);
    }
}
