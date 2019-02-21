package sis.studentinfo;

import junit.framework.TestCase;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtilsTest extends TestCase {
    public void testCreateDate() {

        Date date = DateUtils.createDate(2003, 1, 24);
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        assertEquals(2003,calendar.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY,calendar.get(Calendar.MONTH));
        assertEquals(24,calendar.get(Calendar.DAY_OF_MONTH));

    }
}
