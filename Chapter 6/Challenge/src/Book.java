class Book {
    // static variables
    static int totalBooks;

    // instance variables
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    // static block
    static {
        totalBooks = 0;
    }

    // object init
    {
        totalBooks++;
    }

    // constructor
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    Book(String isbn) {
        this("Unknown", "Unknown", isbn);
    }

    // static method
    static int getTotalBooks() {
        return totalBooks;
    }

    // instance methods
    public void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy " + this.title);
        }

    }

    public void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope ypu enjoyed!");
        } else {
            System.out.println("This book is already in stock");
        }

    }
}
