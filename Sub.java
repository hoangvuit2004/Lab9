import java.util.Comparator;

public class Sub implements Comparator<BookManagement> {
    @Override
    public int compare(BookManagement o1, BookManagement o2) {
        return Integer.compare(o1.getPublishingYear(),o2.getPublishingYear());
    }
}

