package ArrayList;

import java.util.TreeSet;

public class SetDemo4 {
    public static void main(String[] args) {
        TreeSet<Integer> num=new TreeSet<>();
        // doesn't allow duplicates just like HashSet,
        // but it will arrange output in  alphabetical order or sorts the data
        num.add(20);
        num.add(25);
        num.add(55);
        num.add(11);
        System.out.println(num);
    }
}
