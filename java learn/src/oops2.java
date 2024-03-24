public class oops2 {
    public static void main(String[] args) {
        A obj1 = new A("hi this is vishnu");
        System.out.println(obj1);
    }
}
class A{
    String a; 

    A(String a){
        this.a = a; 
        int b = 10 ;
        int c =20;
    }
    @Override
    public String toString() {
        return a;
    }

}
 