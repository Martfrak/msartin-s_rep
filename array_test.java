    package arrays;
    import java.util.*;
public class array_test {
    public static void main(String args[]) throws Exception {
        System.out.println("Hello, World!");
          Scanner ni=new Scanner(System.in);
          System.out.println("Enter Size : ");
          int k= ni.nextInt();
         int num[]=new int[k];
         System.out.println("ENTER UR NUMBER : ");
         int h=ni.nextInt();

       for(int i=0;i<num.length;i++){
        System.out.printf("Enter your marks [%d] :   ",i);
            num[i]=ni.nextInt();

        }
        for(int j=0;j<num.length;j++){
         if (num[j]==h){
            System.out.println("i found ur number at index : "+j);
         }
         /*else {
            System.out.println("Nigga i did not find ur damn no !");
         }*/
            
        }


    }
}
