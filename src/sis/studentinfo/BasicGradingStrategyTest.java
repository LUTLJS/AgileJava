package sis.studentinfo;

import junit.framework.TestCase;

public class BasicGradingStrategyTest extends TestCase {
    public void testGetGradePoints(){
        BasicGradingStrategy strategy = new BasicGradingStrategy();
        assertEquals(4.0,strategy.getGradePointsFor(Student.Grade.A));
        assertEquals(3.5,strategy.getGradePointsFor(Student.Grade.B));
        assertEquals(3.0,strategy.getGradePointsFor(Student.Grade.C));
        assertEquals(2.5,strategy.getGradePointsFor(Student.Grade.D));
        assertEquals(1.5,strategy.getGradePointsFor(Student.Grade.F));
    }
}
