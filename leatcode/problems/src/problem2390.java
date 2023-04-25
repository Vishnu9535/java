class problem2390{
    public  String removestars(String s){
        // String result="";
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='*'){
                result=result.append(ch);
            }
            else {
               result=result.deleteCharAt(result.length()-1);

            }
        }
        
        return result.toString();

    }
    public static void main(String[] args) {
        problem2390 obj1=new problem2390();
        String s="erase****";
        String r=obj1.removestars(s);
        System.out.println(r);

    }
}