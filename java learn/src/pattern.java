public class pattern {
    public void pattern0(){
    char x='*';
    for(int i=0;i < 5;i++){
        for(int j=0;j < 5;j++){
            System.out.print(x);
        }
        System.out.println();
     }   
    }
    public void pattern1(){
        for(int i=4;i >= 0;i--){
            for(int j=i;j >= 0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern2(){
        for(int i=1;i <= 4;i++)
        {
            for(int j=0;j < i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    public void pattern3(int n){
        // for(int i=1;i<=4;i++){
        //     for (int j=0;j < i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=0 ; i < 4;i++){
        //     for(int j=0;j < 4-i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        for(int i=1;i<=2*n;i++){
            int j=i > n ? 2*n -i:i;
            for (int c=0;c < j;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern4(int n){
    
    for (int i=0;i < 2 * n ;i++){
        int j=i > n ? 2 * n-i : i;
        int f=n-j;
        // for(int z=0;z < f;z++){
        //     System.out.print(" ");
        // }
        String m=" ".repeat(f);
        System.out.print(m);
         for(int c=0; c<j ;c++){
            System.out.print("* ");
         }
         System.out.println();
    }
    }
    public void pattern5(int n){
        for (int i=1;i<=n;i++){
            int space=n-i;
            System.out.print("  ".repeat(space));
            int k=2;
            for(int j=0;j<i*2-1;j++){
                int no=i-j; 
                if(no < 1){
                    no=k;
                    k++;
                }
                System.out.print(no+" ");
            }
            System.out.println();
        }
    }
    public void pattern6(int n){
             for (int i=1;i<=2*n;i++){
            int col=i > n ? 2 * n-i : i;
            int space=n-col;
            System.out.print("  ".repeat(space));
            int k=2;
            for(int j=0;j<2*col-1;j++){
                int no=col-j; 
                if(no < 1){
                    no=k;
                    k++;
                }
                System.out.print(no+" ");
            }
            System.out.println();
        }
    }
       public void pattern7(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j< 2*n-1;j++){
                
            }
        }
       }

    public static void main(String[] args) {
    pattern obj= new pattern();
        obj.pattern6(5);
    }
}
