interface car{
    void car_speed(int x);
    void gear(int y);
}
class oops implements car{
    public void car_speed(int x){
     System.out.println("the car speed is "+x);
    }
    public void gear(int y){
        System.out.println("gear of the car is "+y);
    }
    void a(int m){
        System.out.println("hi");
    }
    void a(String z){
        System.out.println("hello "+z);
    }
    void a(int n,int k){
        System.out.println(n+k);
    }

    public static void main(String[] args) {
            oops x1=new oops();
            x1.car_speed(50);
            x1.gear(5);
            x1.a("this is my car");
            x1.a(55);
            x1.a(77,65);
        }
    }
