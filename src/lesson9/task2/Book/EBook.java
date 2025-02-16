package lesson9.task2.Book;

public class EBook implements Book {
    private final String title;
    private final String author;
    private final int year;
    private final String format;

    public EBook(String title, String author, int year, String format) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.format = format;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void displayInfo() {
        System.out.printf(
                "E-book \"%s\" by %s, %d year, %s format\n",
                title, author, year, format
        );
    }
}
