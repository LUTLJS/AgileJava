import junit.framework.TestSuite;
import org.junit.Test;


public class AllTests {

    @Test
    public static TestSuite suite(){
        TestSuite suite = new TestSuite();
        suite.addTestSuite(StudentTest.class);
        suite.addTestSuite(CourseSessionTest.class);
        return suite;
    }
}
