package sis.studentinfo;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Grade> grades = new ArrayList<>();
    public static final String IN_STATE = "CO";
    private String state = "";
    private String name;
    private int credits;
    static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;
    public enum Grade {A, B, C, D, E, F, G};
    private GradingStrategy gradingStrategy=new RegularGradingStrategy();

    public Student(String name) {
        this.name = name;
        credits = 0;
    }

    public String getName() {
        return name;
    }

    public boolean isFullTime() {
        return credits >= CREDITS_REQUIRED_FOR_FULL_TIME;
    }

    public int getCredits() {
        return credits;
    }

    public void addCredits(int credits) {
        this.credits += credits;
    }

    public boolean isInState() {
        return state.toUpperCase().equals(Student.IN_STATE);
    }

    public void setState(String state) {
        this.state = state;
    }

    void addGrade(Grade grade) {
        grades.add(grade);
    }

    double getGpa() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double total = 0.0;
        for (Grade grade : grades) {
            total += gradingStrategy.getGradePointsFor(grade);
        }
        return total / grades.size();
    }
    void setGradingStrategy(GradingStrategy gradingStrategy){
        this.gradingStrategy=gradingStrategy;
    }
}
