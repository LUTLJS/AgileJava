package studentinfo;

public class RosterReporter {
    static final String NEWLINE=System.getProperty("line.separator");
    static final String ROSTER_REPORTER_HEADER="Student"+NEWLINE+
            "-"+NEWLINE;
    static final String ROSTER_REPORTER_FOOTER=NEWLINE+"# studetns = ";
    private CourseSession session;
    RosterReporter(CourseSession session){
        this.session=session;
    }

    public String getReport() {

        StringBuilder buffer = new StringBuilder();

        buffer.append(ROSTER_REPORTER_HEADER);

        for (Student student:session.getAllStudents()){
            buffer.append(student.getName());
            buffer.append(NEWLINE);
        }
        buffer.append(ROSTER_REPORTER_FOOTER+session.getAllStudents().size()+NEWLINE);

        return buffer.toString();
    }
}
