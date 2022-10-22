package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElementsFromACollection {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(31);
        numbers.add(2);
        numbers.add(20);
        numbers.add(5);
        numbers.removeIf(i -> i>10); // Lambda Expression or One Liner
//        Iterator<Integer> it = numbers.iterator();
//        while (it.hasNext()){
//            Integer i = it.next();
//            if (i>10){
//                it.remove();
//            }
//        }
        System.out.println(numbers);
    }
}
// We cannot use a for loop because while we are removing data, the
// array-list is changing size dynamically.