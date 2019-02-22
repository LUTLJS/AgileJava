package sis.studentinfo;

public class HonorsGradingStrategy implements GradingStrategy {
    @Override
    public double getGradePointsFor(Student.Grade grade) {
        double points = BasicGradePoints.basicGradePointsFor(grade);
        return points > 0 ? ++points : points;
    }
}
