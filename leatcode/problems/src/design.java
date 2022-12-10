class design{
    public static void main(String[] args){
        String b="";
        String m="         ";
        String a="*";
        System.out.println(a+m+"  "+a);
        for(int i=0;i<5;i++){
            System.out.println(a+b+a+m+a+b+a);
            b=b+" ";
            m=m.replaceFirst("  ","");
        }
        String x="    ";
        String z="";
        for(int i=0;i<5;i++){
            System.out.println(a+x+a+z+a+" "+x+a);
            x=x.replaceFirst(" ","");
            z=z+"  ";
        }
        System.out.println(a+z+" "+a);
    }   
}