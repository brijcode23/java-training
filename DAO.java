import java.util.*;

public class DAO {
    private Map<Integer, Book> books = new HashMap<>();
    private Map<Integer, Integer> bookQuantities = new HashMap<>();

    public String addBook(Book book) {
        books.put(book.getId(), book);
        bookQuantities.put(book.getId(), bookQuantities.getOrDefault(book.getId(), 0) + 1);
        return "Book added successfully!";
    }

    public Book removeBook(int id) {
        Book removedBook = books.remove(id);
        if (removedBook != null) {
            int quantity = bookQuantities.get(id);
            if (quantity > 1) {
                bookQuantities.put(id, quantity - 1);
            } else {
                bookQuantities.remove(id);
            }
        }
        return removedBook;
    }

    public Map<Integer, Integer> getBooksAvailable() {
        return bookQuantities;
    }

    public Object getBookDetails(int id) {
        Book book = books.get(id);
        if (book == null) {
            return "Book not present";
        } else {
            return book;
        }
    }
}
