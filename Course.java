import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Course  {
    private String id;
    private String title;
    private String type;
    private  List<Student> students;

    public Course(String id, String title, String type, List<Student> students) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.students = students;
    }

    public Course() {

    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    public int getMaxStudent(){
        int count = 0;
        for (Student temp: students) {
            count++;
        }
        return count;
    }

    public String getType() {
        return type;
    }


    public List<Student> getStudents() {
        return students;
    }



}
