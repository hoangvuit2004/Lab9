import java.util.ArrayList;

public class TestBook {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        // Thêm tạp chí vào danh mục
        Magazine magazine = new Magazine("Magazine 1", 50, 2000, "Author 1", 15.99, "Journal A");
        catalog.addBookManagement(magazine);

       Chapter a1 = new Chapter("Chuong 1" ,  20);
        Chapter a2 = new Chapter("Chuong 2" ,  30);
        ArrayList<Chapter> a3 = new ArrayList<>();
        a3.add(a1);
        a3.add(a2);
        Chapter d1 = new Chapter("Chuong 1" ,  30);
        Chapter d2 = new Chapter("Chuong 2" ,  30);
        ArrayList<Chapter> d3 = new ArrayList<>();
        d3.add(d1);
        d3.add(d2);
        ReferenceBooks s2 = new ReferenceBooks("VuFontEnd",2,2003,"Hoangvu",23.3,"dsfs",a3);
        ReferenceBooks s3 = new ReferenceBooks("VuBackEnd",2,2003,"Hoangvu",23.3,"dsfs",d3);
        catalog.addBookManagement(s2);
        catalog.addBookManagement(s3);
       // System.out.println(catalog.getReReferenceBook().getTitle());
        //System.out.println(catalog.checkBook1("Magazine 1"));
        catalog.NumberOfStatistics();

    }
}
