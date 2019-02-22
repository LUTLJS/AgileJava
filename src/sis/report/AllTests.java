package sis.report;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AllTests extends TestCase {
    public static TestSuite suite(){
        TestSuite suite = new TestSuite();
        suite.addTestSuite(RosterReporterTest.class);
        suite.addTestSuite(CourseReportTest.class);
        suite.addTestSuite(ReportCardTest.class);
        return suite;
    }
}
