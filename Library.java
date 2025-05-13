import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("✅ Book added!");
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("📚 No books in library.");
            return;
        }
        System.out.println("📘 Books in Library:");
        for (Book book : books) {
            System.out.println("- " + book);
        }
    }

    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
        System.out.println("🗑️ Book removed (if found).");
    }
}
