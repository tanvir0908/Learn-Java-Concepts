class Course {
    // static variables
    static int maxCapacity = 100;

    // instance variables
    String courseName;
    int enrollments;
    String[] enrolledStudents = new String[maxCapacity];

    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    // static methods
    public static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
        System.out.println("The max capacity has changed to " + maxCapacity);
    }

    // instance methods
    public void enrollStudent(String studentName) {
        enrolledStudents[enrollments] = studentName;
        enrollments++;
        System.out.println(studentName + " has enrolled to the " + this.courseName + " course.");
    }

    public void unEnrollStudent(String studentName) {
        for (int i = 0; i <= enrollments; i++) {
            if (studentName == this.enrolledStudents[i]) {
                this.enrolledStudents[i] = "";
                enrollments--;
                System.out.println(studentName + "has successfully un enrolled from" + this.courseName + " course.");
            }
        }
    }
}