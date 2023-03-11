package ArrayList;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TaskSet1 {

    public static void main(String[] args) {
        /* Create a Set collection in which you need to add names of countries
        * In this set we want all objects to be sorted in alphabetical order
        * using 2 different ways retrieve all elements from  set*/

        TreeSet<String> countries=new TreeSet<>();
        countries.add("America");
        countries.add("Zimbambe");
        countries.add("Russia");
        countries.add("Peru");
        countries.add("America");
        System.out.println(countries);
        for(String s:countries){
            System.out.println(s);
        }


    }
}
