package studentinfo;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;


public class AllTests extends TestCase {

    public static TestSuite suite(){
        TestSuite suite = new TestSuite();
        suite.addTestSuite(StudentTest.class);
        suite.addTestSuite(CourseSessionTest.class);
        suite.addTestSuite(RosterReporterTest.class);
        suite.addTestSuite(DateUtilsTest.class);
        return suite;
    }
}
