package sis.report;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AllTests extends TestCase {
    public static TestSuite suite(){
        TestSuite suite = new TestSuite();
        suite.addTestSuite(RosterReporterTest.class);
        return suite;
    }
}
