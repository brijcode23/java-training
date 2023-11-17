
public class Test {
    public static void main(String[] args) {
        DAO bookDAO = new DAO();

        // Adding books
        Book book1 = new Book(1, "Book1", "Author1", 100);
        Book book2 = new Book(2, "Book2", "Author2", 200);
        System.out.println(bookDAO.addBook(book1));
        System.out.println(bookDAO.addBook(book2));

        // Display all available books
        System.out.println("Available books: " + bookDAO.getBooksAvailable());

        // Get details of a book
        Book bk1 = (Book) bookDAO.getBookDetails(1);
        System.out.println(bk1.getAuthor() + " " + bk1.getPrice());
        System.out.println("Details of book 1: " + bookDAO.getBookDetails(1));
        System.out.println("Details of book 2: " + bookDAO.getBookDetails(2));

        // Remove a book
        Book removedBook = bookDAO.removeBook(1);
        System.out.println("Removed book: " + removedBook.getName());

        // Display all available books
        System.out.println("Available books: " + bookDAO.getBooksAvailable());
    }
}