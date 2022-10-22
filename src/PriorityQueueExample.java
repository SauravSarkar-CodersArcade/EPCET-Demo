import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(15);
        System.out.println(pq);

        System.out.println(pq.peek()); // 10

        System.out.println(pq.poll()); // 10
        System.out.println(pq.peek()); // 15

    }
}
