package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double>numbers=new ArrayList<>();
        numbers.add(10.0);
        numbers.add(15.1);
        numbers.add(21.4);
        numbers.add(45.2);
        numbers.add(11.5);
        numbers.add(19.0);
      //  numbers.remove(3);
        System.out.println(numbers);
      //  numbers.removeIf(number -> number > 19);// doesn't work in iterator
       Iterator<Double>iterator=numbers.iterator() ;
// getting the object of iterator
      /*  System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(numbers);*/
        //hasNext keeps on returning true as long s there are elements left to be iterated
        while (iterator.hasNext()){
            double number=iterator.next();
            if(number>19){
                iterator.remove();
            }
        }
        System.out.println(numbers);



    }
}
