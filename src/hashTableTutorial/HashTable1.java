package hashTableTutorial;

import java.util.Hashtable;
import java.util.Map;

public class HashTable1 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hm = new Hashtable<>();

        hm.put(100, "Sanjay");
        hm.put(102, "Rahul");
        hm.put(101, "Vijay");
        hm.put(103, "Raman");

        for (Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
/** Important Points
 * A hashTable is an array of a list. Each list in a HashTable is called a bucket (K-V)
 * The position of the bucket is determined using hashcode & it ha a hashcode() method as well.
 * A HashTable has values based on keys
 * HashTable contains unique elements
 * It doesn't allow null values (null key or null value)
 * HashTable is synchronized/Thread-Safe
 * Initial Capacity : 11 LoadFactor : 0.75
 */
