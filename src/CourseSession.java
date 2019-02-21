import java.util.ArrayList;

public class CourseSession {
    private String department;
    private String number;
    private ArrayList<Student> students=new ArrayList<>();
    CourseSession(String department,String number){
        this.department=department;
        this.number=number;
        int i=0;
        int ii=0;
        int iii=0;
    }
    String getDepartment(){
        return department;
    }
    String getNumber(){
        return number;
    }
    int getNumberOfStudents(){
        return students.size();
    }
    void enroll(Student student){
        students.add(student);
    }
    ArrayList<Student> getAllStudents(){
        return students;
    }
}
