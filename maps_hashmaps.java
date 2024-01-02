package maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class maps_hashmaps
 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Map m=new LinkedHashMap();
        m.put("NAga",100);
        m.put("Raju", 1);
        m.put("a","B");
        boolean j= m.isEmpty();
       boolean n= m.containsValue("B");
        boolean x= m.containsKey(5);
      System.out.println(j);
        System.out.println(n);
        System.out.println(m);
        System.out.println(x);
        System.out.println(m.get("Raju"));
        System.out.println(m.values());

    }
}
