package studentinfo;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CourseSessionTest extends TestCase {
    private CourseSession session;

    public void setUp(){
       session=new CourseSession("ENGL","101");
    }
    @Test
    public void testCreate(){
        assertEquals("ENGL",session.getDepartment());
        assertEquals("101",session.getNumber());
        assertEquals(0,session.getNumberOfStudents());
    }
    @Test
    public void testEnrollStudents(){

        Student student1 = new Student("Joe Dow");
        session.enroll(student1);
        assertEquals(1,session.getNumberOfStudents());
        assertEquals(student1,session.get(0));

        Student student2 = new Student("Hug Born");
        session.enroll(student2);
        assertEquals(2,session.getNumberOfStudents());
        assertEquals(student1,session.get(0));
        assertEquals(student2,session.get(1));

    }
}
