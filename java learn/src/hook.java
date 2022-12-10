class Threadchild extends Thread{
    public void run(){
        System.out.println("in clean up code");
        System.out.println("shutdown hook");
    }
}



public class hook {
    public static void main(String[] args)
    {
    //     Runtime.getRuntime().addShutdownHook(new Thread()
    //     {
    //         public void run()
    //         {
    //             System.out.println("shutdownhook is running");
    //             System.out.println("its good");
    //         }
    //     });
    //     System.out.println("its getting terminated");
    // }
    Runtime current=Runtime.getRuntime();
    current.addShutdownHook(new Threadchild());
     for(int i=1;i<=10;i++)
     {
        System.out.println("2 *"+i+" = "+2*i); 
     } 
}
}
