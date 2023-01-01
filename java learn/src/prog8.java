import java.util.*;
import java.lang.*;
class oddex extends Exception{
    oddex(){
        super("odd exception");
    }
    oddex(String msg){
      System.out.println(msg);
    }
}
class evenodd{
    void half(int num){
    try{
        if(num%2!=0 || num==0){
            throw(new oddex());
        }
        else{
            System.out.println("its even and half of it is "+num/2);
        }
    }
    catch(oddex ex){
        System.out.println("error "+ex.getMessage());
    }
}
}

public class prog8 {
    public static void main(String[] args) {
        evenodd e1=new evenodd();
        e1.half(55);
    }
}
