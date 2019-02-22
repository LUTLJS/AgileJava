package sis.studentinfo;

import java.util.*;

/**
 * provides a representation of a single-semester session of a specified university course.
 *
 * @author lutljs
 */
public class CourseSession extends Session{

    private static int count = 0;

    protected CourseSession(String department, String number, Date startDate) {
        super(department,number,startDate);
        CourseSession.incrementCount();
    }

    static void incrementCount() {
        ++count;
    }

    static int getCount() {
        return count;
    }

    static void resetCount() {
        count = 0;
    }

    //静态工厂方法，用来创建类的实例
    public static CourseSession create(String department,String number, Date startDate){
        return new CourseSession(department,number,startDate);
    }

    protected int getSessionLength(){
        return 16;
    }


}
