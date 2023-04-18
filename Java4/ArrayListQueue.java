import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayListQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(3);
        pq.offer(4);
        pq.offer(5);
        pq.offer(9);
        pq.offer(6);
        System.out.println(pq);

    }
}
