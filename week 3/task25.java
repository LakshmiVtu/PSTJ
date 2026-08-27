import java.util.PriorityQueue;

public class task25 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(30);
        queue.add(10);
        queue.add(20);
        queue.add(5);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
