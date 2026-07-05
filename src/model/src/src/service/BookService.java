package service;

import java.util.ArrayList;
import model.Book;

public class BookService {

    private ArrayList<Book> books = new ArrayList<>();

    // Add Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    // View All Books
    public void viewBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.printf("%-5s %-30s %-20s %-15s %-5s%n",
                "ID", "TITLE", "AUTHOR", "CATEGORY", "QTY");

        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Search Book by ID
    public Book searchBook(int id) {

        for (Book book : books) {

            if (book.getId() == id) {
                return book;
            }

        }

        return null;
    }

}
