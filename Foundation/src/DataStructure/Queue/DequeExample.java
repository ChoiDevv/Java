package DataStructure.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

    public static void main(String[] args) {

        Deque<String> stack = new ArrayDeque<>();
        stack.addFirst("1");
        stack.addFirst("2");
        stack.addFirst("3");
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());

        Deque<String> queue = new ArrayDeque<>();
        queue.addFirst("1");
        queue.addFirst("2");
        queue.addFirst("3");
        System.out.println(queue.removeLast());
        System.out.println(queue.removeLast());
        System.out.println(queue.removeLast());

    }
}
