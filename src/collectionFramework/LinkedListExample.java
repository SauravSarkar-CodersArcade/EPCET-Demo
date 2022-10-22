package collectionFramework;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Mango");
        names.add("Guava");
        names.add("Pineapple");
        System.out.println(names);
        names.addFirst("Apple");
        names.addLast("Jack fruit");
        System.out.println(names);
    }
}
