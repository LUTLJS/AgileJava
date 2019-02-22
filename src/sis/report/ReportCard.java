package sis.report;

import sis.studentinfo.Student;

import javax.rmi.CORBA.Stub;
import java.util.EnumMap;
import java.util.Map;

public class ReportCard {
    static final String A_MESSAGE="Excellent";
    static final String B_MESSAGE="Very good";
    static final String C_MESSAGE="Hmm....";
    static final String D_MESSAGE="You're not trying";
    static final String F_MESSAGE="Loser";
    private Map<Student.Grade,String> messages=null;
    public String getMessage(Student.Grade grade){
        return getMessages().get(grade);
    }
    private Map<Student.Grade,String> getMessages(){
        if (messages==null){
            loadMessages();
        }
        return messages;
    }
    private void loadMessages(){
        messages = new EnumMap<>(Student.Grade.class);
        messages.put(Student.Grade.A,A_MESSAGE);
        messages.put(Student.Grade.B,B_MESSAGE);
        messages.put(Student.Grade.C,C_MESSAGE);
        messages.put(Student.Grade.D,D_MESSAGE);
        messages.put(Student.Grade.F,F_MESSAGE);
    }
}
