package hashTableTutorial;

import java.util.Hashtable;

// putIfAbsent() Adding or inserting elements
public class HashTable4 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hm = new Hashtable<>();
        hm.put(100, "Sanjay");
        hm.put(102, "Rahul");
        hm.put(101, "Vijay");
        hm.put(103, "Raman");

        System.out.println("Initial HashTable : " + hm);
        // It will insert as the K-V pair is unique
        hm.putIfAbsent(104, "Sameer");
        System.out.println("Updated HashTable : " + hm);
        hm.putIfAbsent(100, "Sanjay");
        // returns the current value because the specified K-V pair already exists
        System.out.println("Updated HashTable : " + hm);
    }
}
