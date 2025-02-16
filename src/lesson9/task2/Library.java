package lesson9.task2;

import lesson9.task2.Book.Book;

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
