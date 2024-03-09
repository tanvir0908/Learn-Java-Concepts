package multithreading.runnable;

public class TestingRunnables {
    PrintTasks p1 = new PrintTasks('*');
    PrintTasks p2 = new PrintTasks('$');
    PrintTasks p3 = new PrintTasks('#');

    Thread t1 = new Thread(p1);
}
