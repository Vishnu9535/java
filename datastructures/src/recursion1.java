public class recursion1 {
    public static void main(String[] args) {
        //  recursion obj1 = new recursion();
         print_numbers(1);
    }
    public static void  print_numbers(int n){
        if(n == 6){
            return;
        }  
        System.out.println(n);
        print_numbers(n+1);

    }

}
