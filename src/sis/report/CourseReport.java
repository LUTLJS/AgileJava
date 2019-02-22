package sis.report;

import sis.studentinfo.CourseSession;

import java.util.*;

import static sis.report.ReportConstant.NEWLINE;

public class CourseReport {
    private ArrayList<CourseSession> sessions = new ArrayList<>();

    public void add(CourseSession session) {
        sessions.add(session);
    }

    public String text() {

        Collections.sort(sessions);
        StringBuilder buffer = new StringBuilder();
        for (CourseSession session : sessions) {
            buffer.append(session.getDepartment() + " " + session.getNumber() + NEWLINE);
        }
        return buffer.toString();
    }
}
