package ArrayList;

import java.util.HashSet;

public class SetsDemo {

    public static void main(String[] args) {
        HashSet<String>fruit=new HashSet<>();// HashSet doesn't allow duplicate values, prints out only one value
        // and doesn't follow sequence or insertion order.
        fruit.add("Apple");
        fruit.add("pineApple");
        fruit.add("grapeApple");
        fruit.add("Apple");
        System.out.println(fruit);

    }

}
