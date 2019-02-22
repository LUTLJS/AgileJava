package sis.studentinfo;

public class BasicGradePoints {
    public static double basicGradePointsFor(Student.Grade grade){
        switch (grade) {
            case A:
                return 4.0;
            case B:
                return 3.5;
            case C:
                return 3.0;
            case D:
                return 2.5;
            case E:
                return 2.0;
            case F:
                return 1.5;
            case G:
                return 1.0;
            default:
                return 0.0;
        }
    }
}
