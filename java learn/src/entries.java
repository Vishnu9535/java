// import java.lang.reflect.Field;
// import java.lang.reflect.Method;
import java.util.*;
public class entries{
    // public static void main(String[] args)
    // {
    //     // Scanner scn =new Scanner(System.in);
    //     // String str1=scn.next();
    //     // System.out.println("Entered string str1 is  "+str1);
    //     // System.out.println("Enter a sentence  ");
    //     // String str2=scn.nextLine();
    //     // System.out.println(str2);

    //     // Scanner 
    //     int num=35,result;
    //     result=~num;
    //     System.out.println(result);
    public static int sum(int num1, int num2){
        int ans = num1 + num2;
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();
        
        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();
        
        int sum = sum(n1,n2);
        
        System.out.println("The sum of "+n1+" and "+n2+" is "+sum);
    }
}
    
