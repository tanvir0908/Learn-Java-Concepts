public class Book {
    // instance variables
    String title;
    String author;
    boolean isbn;

    // static variables
    static int totalBooks;

    // instance methods
    public void borrowBook() {
        System.out.println("This is inside borrow book method");
    }

    public void returnBook() {
        System.out.println("This is return book method");
    }

    // static method
    public static void getTotalBooks() {
        System.out.println("This is inside get total books method");
    }
}
