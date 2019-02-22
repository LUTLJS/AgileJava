package sis.studentinfo;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import sis.report.RosterReporterTest;


public class AllTests extends TestCase {

    public static TestSuite suite(){
        TestSuite suite = new TestSuite();
        suite.addTestSuite(StudentTest.class);
        suite.addTestSuite(CourseSessionTest.class);
        suite.addTestSuite(DateUtilsTest.class);
        suite.addTestSuite(BasicGradingStrategyTest.class);
        suite.addTestSuite(HonorsGradingStrategyTest.class);
        return suite;
    }
}
