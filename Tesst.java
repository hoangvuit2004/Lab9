import java.util.ArrayList;
import java.util.List;

public class Tesst {
    public static void main(String[] args) {
        Student a1 = new Student("100","Vu", 2004);
        Student a2 = new Student("101","Vu1", 2004);
        Student a3 = new Student("102","Vu2" , 2004);
        Student a4 = new Student("103","Vu3", 2004);
        Student a5 = new Student("104","Vu4", 2004);
        Student a6 = new Student("105","Vu5", 2004);
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(a1);
        listStudent.add(a2);
        listStudent.add(a3);
        listStudent.add(a4);
        listStudent.add(a5);
        listStudent.add(a6);

        Student b1 = new Student("100","Vu", 2004);
        Student b2 = new Student("101","Vu1", 2004);
        Student b3 = new Student("102","Vu2" , 2005);
        Student b4 = new Student("103","Vu3", 2004);
        Student b5 = new Student("104","Vu4", 2004);
        Student b6 = new Student("105","Vu5", 2004);
        Student b7 = new Student("105","Vu5", 2004);
        List<Student> listStudent1 = new ArrayList<>();
        listStudent1.add(b1);
        listStudent1.add(b2);
        listStudent1.add(b3);
        listStudent1.add(b4);
        listStudent1.add(b5);
        listStudent1.add(b6);
        listStudent1.add(b7);
        Course s1 = new Course("100",  "Xac Suat", "Ly Thuyet", listStudent);
        Course s2 = new Course("101",  "Thong Ke", "Thuc Hanh", listStudent1);

        // System.out.println(s1.getMaxStudent());
        List<Course> e1 = new ArrayList<>();
        e1.add(s1);
        e1.add(s2);
        Faculty c1 = new Faculty("103","24" , e1);
        System.out.println(c1.getMaxPracticalCourse().toString());
        System.out.println(c1.groupStudentsByYear().toString());
        System.out.println(c1.filterCourses("Thuc Hanh"));
    }



}
