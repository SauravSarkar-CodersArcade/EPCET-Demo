package hashTableTutorial;
// (id, name, author, publisher, quantity) -> Book
import java.util.Hashtable;
import java.util.Map;
class Book{
    int id;
    String name, author, publisher;
    int quantity;
    public Book(int id,
            String name, String author, String  publisher, int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
// ISBN :
// IMEI :
public class HashTableExample {
    public static void main(String[] args) {
        Map<Integer, Book> map = new Hashtable<Integer, Book>();
        // Creating Object of the Book Class
        Book b1 = new Book(201, "Data Structures", "E Balaguruswamy", "TMH", 6);
        Book b2 = new Book(202, "DBMS", "D. Rathode", "WBH", 4);
        Book b3 = new Book(203, "DMS", "Eric Smith", "BBC", 7);
        // Add the books to the hashtable
        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);

        // Accessing the data inside each book
        for (Map.Entry<Integer, Book> entry : map.entrySet()){
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println(key + " Details");
            System.out.println("Name: " + b.name + " " + "Author: " + b.author + " " + "Publisher: " +  b.publisher + " " + "Quantity: " + b.quantity);
        }
    }
}
