package sis.studentinfo;

import java.util.*;

/**
 * provides a representation of a single-semester session of a specified university course.
 *
 * @author lutljs
 */
public class CourseSession implements Comparable<CourseSession>{

    private String department;
    private String number;
    private List<Student> students = new ArrayList<>();
    private Date startDate;
    private static int count = 0;
    private int numberOfCredits;

    void setNumberOfCredits(int numberOfCredits){
        this.numberOfCredits = numberOfCredits;
    }

    private CourseSession(String department, String number, Date startDate) {
        this.department = department;
        this.number = number;
        this.startDate = startDate;
    }

    private static void incrementCount() {
        ++count;
    }

    static int getCount() {
        return count;
    }

    static void resetCount() {
        count = 0;
    }


    public String getDepartment() {
        return department;
    }


    public String getNumber() {
        return number;
    }


    public int getNumberOfStudents() {
        return students.size();
    }


    public void enroll(Student student) {
        student.addCredits(numberOfCredits);
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


    Date getStartDate() {
        return startDate;
    }

    public List<Student> getAllStudents() {
        return students;

    }
    //静态工厂方法，用来创建类的实例
    public static CourseSession create(String department,String number, Date startDate){
        CourseSession.incrementCount();
        return new CourseSession(department,number,startDate);
    }

    @Override
    public int compareTo(CourseSession that) {

        int compare = this.getDepartment().compareTo(that.getDepartment());
        if (compare==0){
            compare = this.getNumber().compareTo(that.getNumber());
        }
        return compare;
    }
}
