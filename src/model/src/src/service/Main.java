import model.Book;
import service.BookService;

public class Main {

    public static void main(String[] args) {

        BookService library = new BookService();

        library.addBook(new Book(101, "Clean Code", "Robert C. Martin", "Programming", 10));
        library.addBook(new Book(102, "Java Complete Reference", "Herbert Schildt", "Programming", 8));
        library.addBook(new Book(103, "Data Structures", "Mark Allen", "Computer Science", 5));

        library.viewBooks();

    }

}
