package tod_array;
import java.util.*;

public class mt_array {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner ni = new Scanner(System.in);  
        System.out.println("Enter ur size row and column : ");
        int j=ni.nextInt();
        int i= ni.nextInt();
        int ta[][]= new int[j][i];
        for(int r =0 ;r<j;r++){
            for(int c=0;c<i;c++){
                ta[r][c]=ni.nextInt();
                //System.out.printf("ur no row [%d] and column [%d] : %d",r,c, ta[r][c]);
}
 }
 for(int k=0;k<j;k++){
    for(int u=0;u<i;u++){
        System.out.print(ta[k][u] + " "+k+u);
    }
    System.out.println();
 }
 System.out.println("enter ur  no :  ");
 int x=ni.nextInt();
 for(int h=0;h<j;h++){
    for(int t=0;t<i;t++){
        if(ta[h][t]==x){
            System.out.println("ur no is found in : (" + h + " ,"+ t +")"  ); 
        }
    }
 }
}
}