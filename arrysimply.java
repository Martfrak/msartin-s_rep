package stringiarray;
import java.util.*;

public class arrysimply {
    public static void main(String[] args) throws Exception {
      //  System.out.println("Hello, World!");
        String[] names= {
            "Nagarajuna","Raju",
            "Nigga","Niggamani",
            "Maniniga"
        };
        int i,a;
        boolean f;
        String namecmf;
        Scanner sc=new Scanner(System.in);
        System.out.println("Entnter ur name");
        namecmf=sc.nextLine();
     
        for(i=0;i<5;i++){
            a=names[i].compareTo(namecmf);
            if(a==0){
                System.out.println("You can enter");
                f=true;
                break;
            
            }
        }
           f=false;
        if(!f);
        {
            System.out.println("Sorry");
        }

    }
}
