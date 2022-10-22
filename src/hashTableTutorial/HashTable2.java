package hashTableTutorial;

import java.util.Hashtable;

// removing elements from an hashtable
// Removal of values is done using corresponding key
public class HashTable2 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hm = new Hashtable<>();
        hm.put(100, "Sanjay");
        hm.put(102, "Rahul");
        hm.put(101, "Vijay");
        hm.put(103, "Raman");
        System.out.println("Before removing: " + hm);
        hm.remove(102);
        System.out.println("After removing: " + hm);
    }
}
