package sis.studentinfo;

public interface GradingStrategy {
    double getGradePointsFor(Student.Grade grade);
}
