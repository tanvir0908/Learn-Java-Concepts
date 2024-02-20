class Challenge51 {
    public static void main(String[] args) {
        Book designOfThings = new Book("Design", "Tanvir", "1");
        Book myBook = new Book("1");

        System.out.println("Total number of books: " + Book.getTotalBooks());

        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }
}