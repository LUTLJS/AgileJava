package studentinfo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *  provides a representation of a single-semester session of a specified university course.
 * @author lutljs
 */
public class CourseSession {
    private String department;
    private String number;
    private ArrayList<Student> students = new ArrayList<>();
    private Date startDate;


    CourseSession(String department, String number, Date startDate) {
        this.department = department;
        this.number = number;
        this.startDate = startDate;
    }


    String getDepartment() {
        return department;
    }


    String getNumber() {
        return number;
    }


    int getNumberOfStudents() {
        return students.size();
    }


    void enroll(Student student) {
        students.add(student);
    }


    Student get(int index) {
        return students.get(index);
    }


    public Date getEndDate() {
        final int sessionLength = 16;
        final int daysInWeek = 7;
        final int daysFromFridayToMonday = 3;
        GregorianCalendar calender = new GregorianCalendar();
        calender.setTime(startDate);
        int numberOfDays = sessionLength * daysInWeek - daysFromFridayToMonday;
        calender.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calender.getTime();
    }


    public Date getStartDate() {
        return startDate;
    }

}
