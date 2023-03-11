package ArrayList;

import java.util.TreeSet;

public class Practice01 {
    public static void main(String[] args) {
        /* ArrayList<>();
aList.add("John");
aList.add("Jane");
aList.add("James");
aList.add("Jasmine");
aList.add("Jane");
aList.add("James");
How can you remove all duplicates from ArrayList? */

        TreeSet<String>aList=new TreeSet<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);
   }
}
