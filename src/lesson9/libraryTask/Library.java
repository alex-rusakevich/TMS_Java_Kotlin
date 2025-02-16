package lesson9.libraryTask;

import lesson9.libraryTask.Book.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayInfo() {
        for(Book b : books) {
            b.displayInfo();
        }
    }
}
