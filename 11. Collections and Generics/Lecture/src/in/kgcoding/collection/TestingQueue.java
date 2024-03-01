package in.kgcoding.collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {
        // create an object of linked list
        Queue<Integer> queue = new LinkedList<>();

        // insert values into queue
        queue.add(10); // it will throw exception
        queue.offer(2); // it will return false

        Utility.displayCollection(queue);

        // check first element
        System.out.println(queue.peek()); // it will throw exception
        System.out.println(queue.element()); // it will return false

        // remove element from queue
        System.out.println(queue.remove()); // it will throw exception
        System.out.println(queue.poll()); // it will return null

        Utility.displayCollection(queue);
    }
}
