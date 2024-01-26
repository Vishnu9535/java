public class recrsionpaterns {
    public static void main(String[] args) {
        triangle2(4, 0);
    
    }
    static void triangle(int r, int c){
        if(r == 0){
            return;
        }
        else if (c > r){
            r=r-1;
            c=-1;
            System.err.println();
        }
        else{
        System.out.print("*");
        }

        triangle(r, c+1);
    }
    static void triangle2(int r, int c){
        if(r == 0){
            return;
        }
        if (c < r){
            triangle2(r, c+1);
            System.err.print("*");
        }
        else{
            triangle2(r-1, 0); 
        System.out.println();
        }
    }
}
