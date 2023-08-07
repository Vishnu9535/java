public class problem9 {
    public boolean isPalindrome(int x) {
        int m=0;
        int z=x;
        while(z >0)
        {
            m=(m+z % 10);
            z=z/10;
            if(z > 0){
                m=m*10;
            }
        }
        if (m == x){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        problem9 x1 = new problem9();
        int x= 1000000001;
        System.out.println(x1.isPalindrome(x));
    }


}

