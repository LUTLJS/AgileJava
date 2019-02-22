package sis.studentinfo;

import junit.framework.TestCase;

public class HonorsGradingStrategyTest extends TestCase {
    public void testGetGradePoints(){
        HonorsGradingStrategy strategy = new HonorsGradingStrategy();
        assertEquals(5.0,strategy.getGradePointsFor(Student.Grade.A));
        assertEquals(4.5,strategy.getGradePointsFor(Student.Grade.B));
        assertEquals(4.0,strategy.getGradePointsFor(Student.Grade.C));
        assertEquals(3.5,strategy.getGradePointsFor(Student.Grade.D));
        assertEquals(2.5,strategy.getGradePointsFor(Student.Grade.F));
    }
}
