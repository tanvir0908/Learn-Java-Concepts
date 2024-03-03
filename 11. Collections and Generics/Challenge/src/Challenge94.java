import java.util.Comparator;
import java.util.PriorityQueue;

public class Challenge94 {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getGrade() - t1.getGrade();
            }
        });

        queue.offer(new Student("Tanvir", 'B'));
        queue.offer(new Student("Hasan", 'C'));
        queue.offer(new Student("Emon", 'A'));
        queue.offer(new Student("Hablu", 'D'));
        queue.offer(new Student("Kablu", 'E'));
        queue.offer(new Student("Lablu", 'A'));
        queue.offer(new Student("Tanku", 'F'));

//        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }

    private static class Student {
        private final String name;
        private final char grade;

        Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + ": " + grade;
        }
    }
}
