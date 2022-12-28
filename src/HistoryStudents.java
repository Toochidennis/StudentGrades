import java.text.DecimalFormat;

public class HistoryStudents extends StudentInformation {

    private int mAttendance;
    private int mProject;
    private int mMidTerm;
    private int mFinalExam;

    public HistoryStudents() {
        // empty constructor required
    }

    public HistoryStudents(int sAttendance, int sProject, int sMidTerm, int sFinalExam) {
        mAttendance = sAttendance;
        mProject = sProject;
        mMidTerm = sMidTerm;
        mFinalExam = sFinalExam;
    }


    public HistoryStudents(String sStudentFirstName, String sStudentLastName,
                           String sStudentSubject, int sAttendance,
                           int sProject, int sMidTerm, int sFinalExam) {
        super(sStudentFirstName, sStudentLastName, sStudentSubject);
        mAttendance = sAttendance;
        mProject = sProject;
        mMidTerm = sMidTerm;
        mFinalExam = sFinalExam;
    }

    public int getAttendance() {
        return mAttendance;
    }

    public void setAttendance(int sAttendance) {
        mAttendance = sAttendance;
    }

    public int getProject() {
        return mProject;
    }

    public void setProject(int sProject) {
        mProject = sProject;
    }

    public int getMidTerm() {
        return mMidTerm;
    }

    public void setMidTerm(int sMidTerm) {
        mMidTerm = sMidTerm;
    }

    public int getFinalExam() {
        return mFinalExam;
    }

    public void setFinalExam(int sFinalExam) {
        mFinalExam = sFinalExam;
    }


    // method/function to calculate student's average
    public String calculateAverage() {

        double average =
                getAttendance() + getProject() + getMidTerm() + getFinalExam();
        average = average / 4;
        DecimalFormat format = new DecimalFormat("#.00");

        return format.format(average);
    }
}
