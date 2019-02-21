package studentinfo;

import junit.framework.TestCase;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class RosterReporterTest extends TestCase {

    public void testRosterReport(){
        CourseSession session = new CourseSession("ENGL", "101", DateUtils.createDate(2003, 1, 6));
        session.enroll(new Student("A"));
        session.enroll(new Student("B"));

        String rosterReport=new RosterReporter(session).getReport();
        assertEquals(RosterReporter.ROSTER_REPORTER_HEADER+
                "A"+RosterReporter.NEWLINE+
                "B"+RosterReporter.NEWLINE+
                RosterReporter.ROSTER_REPORTER_FOOTER+
                "2"+RosterReporter.NEWLINE,rosterReport);
    }

}
