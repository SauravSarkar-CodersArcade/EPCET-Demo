package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> names = new LinkedHashSet<>();
        names.add("Sanjay");
        names.add("Sanjay");
        names.add("Sanjay");
        names.add("Rahul");
        names.add("Sneha");
        System.out.println(names);
        System.out.println(names.contains("Sanjay"));
        System.out.println(names.isEmpty());
    }
}
