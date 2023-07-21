public class pattern {
    public void pattern(){
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
    
    for (int i=1;i <= 2*n ;i++){
        int j=i > 4 ? n-i:i;
         for(int c=0;c<j;c++){
            
         }
    }
    }

    public static void main(String[] args) {
    pattern obj= new pattern();
        obj.pattern3(7);
    }
}
