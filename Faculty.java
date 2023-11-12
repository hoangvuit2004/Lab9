import java.util.*;

public class Faculty {
    private String name;
    private String address;
    private List<Course> courses;

    public Faculty(String name, String address, List<Course> courses) {
        this.name = name;
        this.address = address;
        this.courses = courses;
    }
    public Course getMaxPracticalCourse(){
     Course temp = null;
     int count = 0;
        for (Course temp1: courses ) {
            if(count < temp1.getMaxStudent() && temp1.getType().equals("Thuc Hanh")){
                count = temp1.getMaxStudent();
                temp = temp1;
            }
        }
        return temp;
    }
public Map<Integer, List<Student>> groupStudentsByYear(){
    Map<Integer, List<Student>> yearToStudentsMap = new HashMap<>();
    for (Course course: courses) {
        List<Student> student = course.getStudents();
        for (Student stu: student
             ) {
            int year = stu.getYear();
            if(!yearToStudentsMap.containsKey(year)){
                yearToStudentsMap.put(year,new ArrayList<>());
            }
            yearToStudentsMap.get(year).add(stu);
        }
    }

    return yearToStudentsMap;
}

public Set<Course> filterCourses(String type){
    List<Course> filteredCoursesList = new ArrayList<>();


    for (Course course : courses) {
        if (course.getType().equals(type)) {
            filteredCoursesList.add(course);
        }
    }



  filteredCoursesList.sort((cou1, cou2) -> cou2.getMaxStudent() - cou1.getMaxStudent());
    Set<Course> filteredCourses = new HashSet<>(filteredCoursesList);

    return filteredCourses;

}
    private class StudentCountComparator implements Comparator<Course> {
        @Override
        public int compare(Course course1, Course course2) {
            return course2.getMaxStudent() - course1.getMaxStudent();
        }
    }
}
