package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListInJava {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(0, 10);

        for (int num : numbers){
            System.out.println(num);
        }
        Iterator<Integer>  it = numbers.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
