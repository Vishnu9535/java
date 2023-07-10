import java.util.*;

public class App {

    public static void main(String[] args) 
    { double tc,famt,disc;  
    Scanner scnr=new Scanner(System.in);
    System.out.println("Enter the price of the colth");
    tc =scnr.nextDouble();
    if(tc<2000){
        disc=(tc*5)/100;
        tc=tc-disc;
    }
    System.err.println(tc);
}
}
