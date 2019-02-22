package sis;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import sis.report.CourseReportTest;

public class AllTests extends TestCase {
    public static TestSuite suite(){
        TestSuite suite = new TestSuite();
        suite.addTest(sis.studentinfo.AllTests.suite());
        suite.addTest(sis.report.AllTests.suite());
        return suite;
    }
}
