public class recusioneasy27 {
    public static void main(String[] args) {
        recusioneasy27 obj1 = new recusioneasy27();
        // obj1.print_n1(5);
        // obj1.print_both(6);
        // System.out.println(obj1.factorial(5));
        // System.out.println(obj1.sum_of_numbers(1342));
        // System.out.println(obj1.product_of_digits(5606));
        // obj1.concept(8);
        obj1.reverse_number(12345);
    }
    public void print_n(int n){
        if(n == 0){
            // System.out.println(n);
            return ;
        }
        System.out.println(n);
        print_n(n-1);
    }
    public void print_n1(int n){
        if(n == 0){
            return;
        }
        print_n1(n-1);
        System.out.println(n);
    }
    public void print_both(int n){
        if(n > 0){
            System.out.println(n);
            print_both(n-1);
        }
        System.out.println(n);
    }
    public int factorial(int n){
        if(n == 1){
            return 1;
        }
        int x =n*factorial(n-1);
        // System.out.println(x);
        return n*factorial(n-1);
    }
    public int sum_of_numbers(int n){
        if(n < 10){
            return n;
        }
        int x = n%10 + sum_of_numbers(n/10);
        return x;
    }
    public int product_of_digits(int n){
        if(n < 10){
            return n;
        }
        int x = n%10 * product_of_digits(n/10);
        return x;
    }
    void concept(int n){
        if(n == 0 ){
            return;
        }
        System.out.println(n);
        // concept(n--); stack overflow 
        concept(--n);
    }
    public void reverse_number (int n){
        int digit= (int)Math.log10(n) + 1;
        int reverse_number = helper(n,digit);
        System.out.println(reverse_number);
    }
    public int helper(int n , int digit){
        if(n%10 == n){
            return n;
        }
        int sum = (int) n%10 * (int)Math.pow(10, digit-1)+helper(n/10, digit-1);
        return sum;

    }
    public void remainder(int n,int count){
        if(n%10 == n){
            return ;
        }
        if(n%10 == 0){
            count++;
            remainder(n/10, count);
        }
        else if(n%10 !=0){
            remainder(n/10, count);
        }
    } 
}
