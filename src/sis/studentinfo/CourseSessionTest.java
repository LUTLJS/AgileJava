package sis.studentinfo;

import junit.framework.TestCase;

import java.util.Date;

import static sis.studentinfo.DateUtils.createDate;

public class CourseSessionTest extends SessionTest {

    private CourseSession session;
    private Date startDate;
    private static final int CREDITS=3;


    public void testCourseDates(){
        Date startDate = createDate(2003, 1, 6);
        Session session = createSession("ENGL", "200", startDate);
        Date sixteenWeeksOut = createDate(2003, 4, 25);
        assertEquals(sixteenWeeksOut,session.getEndDate());

    }
    @Override
    protected Session createSession(String department, String number, Date startDate) {
        return CourseSession.create(department,number,startDate);
    }

    public void testCount(){
        CourseSession.resetCount();
        createSession("","",new Date());
        assertEquals(1,CourseSession.getCount());
        createSession("","",new Date());
        assertEquals(2,CourseSession.getCount());
    }

}
