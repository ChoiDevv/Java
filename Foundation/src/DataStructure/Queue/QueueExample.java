package DataStructure.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.poll();

        queue.add(1);
        queue.remove();
        queue.clear();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
