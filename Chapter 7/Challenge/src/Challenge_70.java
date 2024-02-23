class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student name: " + this.name + "\nStudent age: " + age;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Tanvir", 24);
        System.out.println(student1);
    }
}