import java.util.Comparator;

public class BookManagement implements Comparable<BookManagement> {
    private String title;
    private int numberOfPages;
    private int publishingYear;
    private String author;
    private double price;

    public BookManagement(String title, int numberOfPages, int publishingYear, String author, double price) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publishingYear = publishingYear;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(BookManagement o) {
        return this.getTitle().compareTo(o.getTitle());
    }


}
