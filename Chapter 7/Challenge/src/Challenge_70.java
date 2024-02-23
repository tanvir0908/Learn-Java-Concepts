class Student {
    String name;
    int age;
    String rollNumber;

    Student(String name, int age, String rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student name: " + this.name + "\nStudent age: " + age + "\nStudent Id: " + rollNumber;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Tanvir", 24, "011181077");
        System.out.println(student1);
    }
}