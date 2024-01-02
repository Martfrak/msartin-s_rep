package sortingarraystringi;
import java.util.*;
public class sorting {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String[] ko={
            "maninigga","Nigga","LOL","Niggamani"
        };
        int i,j,reult;
        String temp;
        for(i=0;i<=ko.length-1;i++){
            for(j=0;j<=ko.length-1;j++){
                reult=ko[i].compareTo(ko[j]);
                if(reult>0){
                    temp=ko[i];
                    ko[i]=ko[j];
                    ko[j]=temp;
                }
            }
        }
        for(String n:ko){
            System.out.println(n);
        }

    }
}
