package ArrayList;

import java.util.ArrayList;

public class task4 {
    /*  replace the words with water, if the word contains "a" or "e" */
    public static void main(String[] args) {


        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("vola");
        drinks.add("kela");
        drinks.add("tol");
        drinks.add("vle");
        drinks.add("vol");
        for (int i = 0; i < drinks.size(); i++) {
            String drink=drinks.get(i);
            if(drink.contains("a")||drink.contains("e")){
                drinks.set(i,"water");
            }

        }
        System.out.println(drinks);
    }
}