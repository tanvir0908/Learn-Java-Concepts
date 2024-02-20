class Challenge51 {
    public static void main(String[] args) {
        Book myBook = new Book();
        // instance methods
        myBook.borrowBook();
        myBook.returnBook();

        // static methods
        Book.getTotalBooks();
    }
}