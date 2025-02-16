package lesson9.task2.Book;

public class PhysicalBook implements Book {
    private final String title;
    private final String author;
    private final int year;
    private final int pageNum;

    public PhysicalBook(String title, String author, int year, int pageNum) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pageNum = pageNum;
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
                "Physical book \"%s\" by %s, %d year, %d pages\n",
                title, author, year, pageNum
        );
    }
}
