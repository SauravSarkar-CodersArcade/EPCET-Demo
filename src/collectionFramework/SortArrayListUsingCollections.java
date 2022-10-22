package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListUsingCollections {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(0);
        numbers.add(5);
        Collections.reverse(numbers);
        Collections.sort(numbers);
        for (int i : numbers){
            System.out.print(i + " ");
        }
    }
}
