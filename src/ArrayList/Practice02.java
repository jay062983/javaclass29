package ArrayList;

import java.util.HashMap;
import java.util.TreeSet;

public class Practice02 {
    public static void main(String[] args) {
        /*Create a Set of cities in which you want to make sure that insertion order is maintained.
        Then remove any city that starts with “A”;
Create a Set collection that will hold Objects of Student Type.
In this set we do not care about the insertion order.
Each student object should have name and studentID.
Display name of each student..*/

        TreeSet<String>city=new TreeSet<>();
        city.add("NewYork");
        city.add("Miami");
        city.add("Atlanta");
        city.add("Denver");
        System.out.println(city);
        city.removeIf(citi->citi.startsWith("A"));
        System.out.println(city);

        HashMap<String,String>DisplayName=new HashMap<>();
        DisplayName.put("Henry","ABc1234");
        DisplayName.put("Jerry","Aec1234");
        DisplayName.put("Kerry","ABc1237");
        DisplayName.put("sean","CDV1234");
        DisplayName.put("Johnson","ABc12715");
        System.out.println(DisplayName);

        System.out.println(DisplayName.size());
        System.out.println(DisplayName.get("Jerry"));
        System.out.println(DisplayName.remove("Henry"));
        System.out.println(DisplayName);
        System.out.println(DisplayName.put("Steve"," ZAS9867"));
        System.out.println(DisplayName);




    }
}
