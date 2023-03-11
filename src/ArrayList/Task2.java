package ArrayList;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        /*  create list of cars and printout 3 ways */

        ArrayList<String>cars=new ArrayList<>();
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Honda");
        System.out.println(cars);
        for(String car:cars){

            System.out.println(car);
        }

        for (int i = 0; i <cars.size() ; i++) {
            String car=cars.get(i);
            System.out.println(car);
        }

        }


}
