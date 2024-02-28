package in.kgcoding.collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {
        // create an object of linked list
        Queue<Integer> queue = new LinkedList<>();

        // insert values into queue
        queue.add(1); // it will throw exception
        queue.offer(2); // it will return false
        Utility.displayCollection(queue);

        System.out.println(queue.peek());
        System.out.println(queue.element());

        System.out.println(queue.remove());
        System.out.println(queue.poll());
        Utility.displayCollection(queue);

        System.out.println(queue.poll());
    }
}
