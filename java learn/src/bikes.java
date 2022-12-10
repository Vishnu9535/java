
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }
// class bike{
//     int speed = 5;
//     int gear = 2;
//     CharSequence type = "petrol";
    
//     void changespeed(int extraspeed){
//         speed=speed+extraspeed;
//     }
//     void changegear(int gearincrease){
//         gear=gear+gearincrease;
//     }
//     void changetype(CharSequence changedtype){
//         type=changedtype;
//         }
//     void bikedetails(CharSequence name){
//             System.out.println(name +":" + "speed="+speed +"gear="+gear+"type="+type);
//         }
    
// }
// public class bikes {
//     public static void main(String[] args){
//      bike hero= new bike();
//      bike tata =new bike();
//      hero.changespeed(10);
//      hero.changegear(4);
//      hero.changetype("disel");
//      hero.bikedetails("hero");
//      tata.changespeed(20);
//      tata.changegear(3);
//      tata.changetype("disel");
//      tata.bikedetails("tata");  
//     }
// }
// class  racingbike extends bike{
    
// } 
interface bike{
    void changespeed(int speedvalue);
    void changegear(int gearvalue);
    void changetype(CharSequence typevalue);
    void bikedetails(CharSequence name);
}
class bmwbike implements bike{
    int speed = 5;
    int gear = 2;
    CharSequence type = "petrol";
    
    public void changespeed(int extraspeed){
        speed=speed+extraspeed;
    }
    public void changegear(int gearincrease){
        gear=gear+gearincrease;
    }
    public void changetype(CharSequence changedtype){
        type=changedtype;
        }
    public void bikedetails(CharSequence name){
            System.out.println(name +"  :  " + "speed=  "+speed +  "  gear=  " +  gear +"  type=  "+type);
        }
    }
public class bikes{
public static void main(String[] args){
    bike bike1=new bmwbike();
    bike1.changespeed(100);
    bike1.changegear(5);
    bike1.changetype("electric");
    bike1.bikedetails("bmwbike1");
}
}
// long creditCardNumber = 1234_5678_9012_3456L;
// long socialSecurityNumber = 999_99_9999L;
// float pi =  3.14_15F;
// long hexBytes = 0xFF_EC_DE_5E;
// long hexWords = 0xCAFE_BABE;
// long maxLong = 0x7fff_ffff_ffff_ffffL;
// byte nybbles = 0b0010_0101;
// long bytes = 0b11010010_01101001_10010100_10010010;
// // Invalid: cannot put underscores
// // adjacent to a decimal point
// float pi1 = 3_.1415F;
// // Invalid: cannot put underscores 
// // adjacent to a decimal point
// float pi2 = 3._1415F;
// // Invalid: cannot put underscores 
// // prior to an L suffix
// long socialSecurityNumber1 = 999_99_9999_L;

// // OK (decimal literal)
// int x1 = 5_2;
// // Invalid: cannot put underscores
// // At the end of a literal
// int x2 = 52_;
// // OK (decimal literal)
// int x3 = 5_______2;

// // Invalid: cannot put underscores
// // in the 0x radix prefix
// int x4 = 0_x52;
// // Invalid: cannot put underscores
// // at the beginning of a number
// int x5 = 0x_52;
// // OK (hexadecimal literal)
// int x6 = 0x5_2; 
// // Invalid: cannot put underscores
// // at the end of a number
// int x7 = 0x52_;

