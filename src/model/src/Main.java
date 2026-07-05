import model.Book;

public class Main {

    public static void main(String[] args) {

        Book book = new Book(
                101,
                "Clean Code",
                "Robert C. Martin",
                "Programming",
                10
        );

        System.out.println("==============================================");
        System.out.println("     SMART LIBRARY MANAGEMENT SYSTEM");
        System.out.println("==============================================");

        System.out.printf("%-5s %-30s %-20s %-15s %-5s%n",
                "ID", "TITLE", "AUTHOR", "CATEGORY", "QTY");

        System.out.println(book);
    }
}
