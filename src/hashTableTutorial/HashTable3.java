package hashTableTutorial;
// getOrDefault() method to access elements
import java.util.Hashtable;

public class HashTable3 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hm = new Hashtable<>();
        hm.put(100, "Sanjay");
        hm.put(102, "Rahul");
        hm.put(101, "Vijay");
        hm.put(103, "Raman");

        System.out.println(hm.getOrDefault(102, "Not Found"));
        System.out.println(hm.getOrDefault(110, "Not Found"));
    }
}
