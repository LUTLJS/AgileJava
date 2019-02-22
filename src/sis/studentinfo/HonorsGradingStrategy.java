package sis.studentinfo;

public class HonorsGradingStrategy extends BasicGradingStrategy {
    @Override
    public double getGradePointsFor(Student.Grade grade) {
        double points = super.getGradePointsFor(grade);
        return points > 0 ? ++points : points;
    }
}
