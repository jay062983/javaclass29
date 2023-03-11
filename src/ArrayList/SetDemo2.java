package ArrayList;

import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        LinkedHashSet<String>fruit=new LinkedHashSet<>();
        // doesn't allow duplicates just like HashSet, but it will retain the insertion order
        fruit.add("Apple");
        fruit.add("Apple");
        fruit.add("kiwi");
        fruit.add("grape");
        System.out.println(fruit);
    }
}
