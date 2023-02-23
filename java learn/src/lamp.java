class lamp {
   public  boolean lampon=false;
    void changelamp(){
        if(lampon){
            lampon=false;
        }
        else{
            lampon=true;
        }
    }
    boolean return_status(){
         return lampon;
    }
    void check_status(){
        if(return_status()){
            System.out.println("its on");
            return;
        }
        System.out.println("its off");
    } 
    public static void main(String[] args) {
        lamp x1=new lamp();
        x1.check_status();
        x1.changelamp();
        x1.check_status();
        x1.changelamp();
        x1.check_status();
    }
}
