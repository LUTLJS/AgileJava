package sis.summer;

import junit.framework.TestCase;
import sis.studentinfo.CourseSession;
import sis.studentinfo.DateUtils;
import sis.studentinfo.Session;
import sis.studentinfo.SessionTest;

import java.util.Date;

public class SummerCourseSessionTest extends SessionTest {
    public void testEndDate(){
        Date date = DateUtils.createDate(2003, 6, 9);
        Session session = createSession("ENGL", "200", date);
        Date eightWeeksOut = DateUtils.createDate(2003, 8, 1);
        assertEquals(eightWeeksOut,session.getEndDate());
    }

    @Override
    protected Session createSession(String department, String number, Date startDate) {
        return SummerCourseSession.create(department,number,startDate);
    }
}
