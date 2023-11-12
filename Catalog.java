import java.util.*;

public class Catalog  {
    private ArrayList<BookManagement> listBook;

    public Catalog() {
        this.listBook = new ArrayList<>();
    }

    public void addBookManagement(BookManagement book) {
        this.listBook.add(book);
    }

    public void displayBook() {
        for (BookManagement temp : listBook) {
            System.out.print(temp.getTitle() + " ");
        }

    }

    public String checkBook(BookManagement book) {
        if (book instanceof ReferenceBooks) {
            return "ReferenceBooks";
        } else {
            return "Magazine";
        }
    }

    public boolean checkMagazineYear(BookManagement book) {
        if (book instanceof Magazine && 2021 - book.getPublishingYear() >= 10) {
            return true;
        }
        return false;
    }

    public boolean checkAuthor(BookManagement book1, BookManagement book2) {
        if (book1.getAuthor().equals(book2.getAuthor()) && book1.getTitle().equals(book2.getTitle())) {
            return true;
        }
        return false;
    }

    public double totalPrice() {
        double sum = 0;
        for (BookManagement temp : listBook) {
            sum += temp.getPrice();
        }
        return sum;
    }

    public ReferenceBooks getReReferenceBook() {
        ReferenceBooks temp = null;
        int temp1 = 0;
        for (BookManagement s1 : listBook) {
            if (s1 instanceof ReferenceBooks) {
                int count = 0;
                for (Chapter a1 : ((ReferenceBooks) s1).getChapters()) {
                    count += a1.getNumberOfPages();
                }
                if (count > temp1) {
                    temp1 = count;
                    temp = (ReferenceBooks) s1;
                }
            }
        }
        return temp;
    }

    public boolean checkBook1(String name) {

        for (BookManagement s1 : listBook) {
            if (!(s1 instanceof Magazine)) {
                continue;
            }
            if (s1.getTitle().equals(name)) {
                return true;
            }
        }
        return false;
    }
    public ArrayList<BookManagement> getListBookYear(int year){
        ArrayList<BookManagement> list = new ArrayList<>();
        for (BookManagement s1:
             listBook) {
            if(!(s1 instanceof  Magazine)){
                continue;
            }
            if(s1.getPublishingYear() == year){
                list.add(s1);
            }
        }
        return new ArrayList<>(list);
    }
public void sortList(){
Collections.sort(listBook);
Collections.sort(listBook,new Sub());
}
public Map<Integer, Integer> NumberOfStatistics(){
    Map<Integer, Integer> result= new HashMap<>();
    for (BookManagement s1:
         listBook) {
        int year = s1.getPublishingYear();
        if(result.containsKey(year)){
            int count = result.get(year);
            result.put(year,count+1);
        }else{
            result.put(year,1);
        }
    }
    for (Map.Entry s: result.entrySet()
         ) {
        System.out.println(s.getKey() + " " + s.getValue());
    }
    return result;
}
}



