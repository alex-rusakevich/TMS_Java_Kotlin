package lesson7.Homework.OOP.Task3;

import java.util.Objects;

class Book {
    String title;
    Author author;
    int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%s \"%s\" (%d)", this.author.name, this.title, this.year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Book book = (Book) obj;

        return Objects.equals(title, book.title) &&
                this.author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }
}