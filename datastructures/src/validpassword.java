public class validpassword {
    public static void main(String[] args) {
        String s = "#Vishnu9535";
        if(s.length() < 5 || Character.isDigit(s.charAt(0))){
            System.out.println("false");
        }
        int cap =0;
        int alpha = 0;
        int number = 0;
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                alpha ++;
            }
            else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
            {
                cap++;
            }
            else if(Character.isDigit(s.charAt(i))){
                number++;
            }
            if(number > 0 && alpha >=3 && cap >0){
                System.out.println("true");
                break;
            }
        }
    }
}
