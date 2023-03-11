package ArrayList;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetsDemo3 {
    public static void main(String[] args) {
        TreeSet<String> fruit=new TreeSet<>();
        // doesn't allow duplicates just like HashSet,
        // but it will arrange output in  alphabetical order or sorts the data
        fruit.add("Apple");
        fruit.add("Apple");
        fruit.add("kiwi");
        fruit.add("grape");



        System.out.println(fruit);
    }
}
