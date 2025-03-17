package KunalKushwaha.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class InBuiltExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(46);
        queue.add(36);
        queue.add(26);
        queue.add(16);
        queue.add(10);
        queue.add(5);

        // First In First Out || Last In Last Out
        System.out.println("peek : "+ queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());


    }
}
