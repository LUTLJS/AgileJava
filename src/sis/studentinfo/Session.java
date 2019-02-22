package sis.studentinfo;

import java.util.*;

abstract public class Session implements Comparable<Session>{
    private String department;
    private String number;
    private List<Student> students = new ArrayList<>();
    private Date startDate;
    private static int count = 0;
    private int numberOfCredits;

    void setNumberOfCredits(int numberOfCredits){
        this.numberOfCredits = numberOfCredits;
    }

    protected Session(String department, String number, Date startDate) {
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
        final int daysInWeek = 7;
        final int daysFromFridayToMonday = 3;
        GregorianCalendar calender = new GregorianCalendar();
        calender.setTime(getStartDate());
        int numberOfDays = getSessionLength() * daysInWeek - daysFromFridayToMonday;
        calender.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calender.getTime();
    }


    protected Date getStartDate() {
        return startDate;
    }

    public List<Student> getAllStudents() {
        return students;

    }


    @Override
    public int compareTo(Session that) {
        int compare = this.getDepartment().compareTo(that.getDepartment());
        if (compare==0){
            compare = this.getNumber().compareTo(that.getNumber());
        }
        return compare;
    }

    abstract protected int getSessionLength();

}
