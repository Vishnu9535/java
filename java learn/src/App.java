class bike{
    int speed = 5;
    int gear = 2;
    CharSequence type = "petrol";
    
    void changespeed(int extraspeed){
        speed=speed+extraspeed;
    }
    void changegear(int gearincrease){
        gear=gear+gearincrease;
    }
    void changetype(CharSequence changedtype){
        type=changedtype;
        }
    void bikedetails(CharSequence name){
            System.out.println(name +":" + "speed="+speed +"gear="+gear+"type="+type);
        }
    
}
class biublicekedemo{
    public static void main(String[] args){
     bike hero= new bike();
     bike tata =new bike();
     hero.changespeed(10);
     hero.changegear(4);
     hero.changetype("disel");
     hero.bikedetails("hero");
     tata.changespeed(20);
     tata.changegear(3);
     tata.changetype("disel");
     tata.bikedetails("tata");  
    }
}