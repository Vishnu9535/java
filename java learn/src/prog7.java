abstract class emp{
    float da;
    float hr;
    float it;
    float ba;
    emp(int bac_sal){
          ba=bac_sal;
          da=(float) (ba*0.7);
          hr=(float) (ba*0.3);
          it=(float)  (ba*0.40);
    }
    abstract void gross();
}
class man extends emp{
      man(int ba){
        super(ba);
      }
      void gross(){
        float inc=(float) (ba*0.1); 
        float gross=ba+hr+da-it+inc;
        System.out.println(gross);
      }
}
class tec extends emp{
    tec(int ba){
        super(ba);
      }
      void gross(){
        float inc=(float) (ba*0.15); 
        float gross=ba+hr+da-it+inc;
        System.out.println(gross);
      }
}
public class prog7 {
    public static void main(String[] args) {
        man m1=new man(5000);
        man m2=new man(6000);
        tec t1=new tec(8000);
        m1.gross();
        m2.gross();
        t1.gross();
    }
}
