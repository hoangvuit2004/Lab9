import java.util.ArrayList;

public class ReferenceBooks extends BookManagement {
private String fieldOfActivity;
private ArrayList<Chapter> chapters;

    public ReferenceBooks(String title, int numberOfPages, int publishingYear, String author, double price, String fieldOfActivity, ArrayList<Chapter> chapters) {
        super(title, numberOfPages, publishingYear, author, price);
        this.fieldOfActivity = fieldOfActivity;
        this.chapters = chapters;
    }
    public int  getReferenceBook(){
        int temp = 0;
        for (Chapter s: chapters) {
            if(s.getNumberOfPages() > temp){
                temp = s.getNumberOfPages();
            }
        }
        return temp;
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }
}
