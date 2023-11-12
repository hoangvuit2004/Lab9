public class Magazine extends  BookManagement {
    private String magaTitle;

    public Magazine(String title, int numberOfPages, int publishingYear, String author, double price, String magaTitle) {
        super(title, numberOfPages, publishingYear, author, price);
        this.magaTitle = magaTitle;
    }

}
