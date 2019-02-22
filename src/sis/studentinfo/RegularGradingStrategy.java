package sis.studentinfo;

public class RegularGradingStrategy implements GradingStrategy{
    @Override
    public double getGradePointsFor(Student.Grade grade) {
        return BasicGradePoints.basicGradePointsFor(grade);
    }
}
