package ArrayList;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapdemo {
    public static void main(String[] args) {
       // HashMap<String, Integer> groceries=new HashMap<>();
       // LinkedHashMap<String, Integer> groceries=new LinkedHashMap<>();
        TreeMap<String, Integer> groceries=new TreeMap<>();

        groceries.put("Apples",10);
        groceries.put("egg",15);
        groceries.put("milk",26);
        groceries.put("poultry",16);
        groceries.put("butter",17);
        System.out.println(groceries.get("milk"));
        System.out.println(groceries);
        System.out.println(groceries.isEmpty());
        System.out.println(groceries.size());
      groceries.remove("milk");
        System.out.println(groceries);



    }
}
