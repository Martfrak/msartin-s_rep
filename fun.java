package functions;
import java.util.*;
public class fun {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc=new Scanner(System.in);
       
        int a,b;
       a=sc.nextInt();
       b=sc.nextInt();
       int sum=calsum(a,b);//actual argument.
       System.out.println("THe calculated sum : "+ sum);

    }
    static int  calsum(int a,int b)/*formal argument or
    parameters*/
    {
        int d;
        d=a+b;
        return(d);
    }
}
