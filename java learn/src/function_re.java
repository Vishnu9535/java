import java.util.Arrays;

public class function_re {
    public static void main(String[] args) {
        int a=10; 
        int b= 20;
        {
            // int a=10;
            System.out.println(a);
            a= 20;
            int c= 20;
            System.out.println(c);

        }
        // System.out.println(c);//error
        System.out.println(a);
        function_re obj1 = new function_re();
        function_re.varrgs(5,6,7,8);
    }
    public static void varrgs(int  ...v){
        System.out.println(Arrays.toString(v));
    }
}
