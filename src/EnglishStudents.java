import java.text.DecimalFormat;

public class EnglishStudents extends StudentInformation {

    private int mTermPaper;
    private int mMidTerm;
    private int mFinalExam;


    public EnglishStudents() {
        // empty constructor required
    }

    public EnglishStudents(int sTermPaper, int sMidTerm, int sFinalExam) {
        mTermPaper = sTermPaper;
        mMidTerm = sMidTerm;
        mFinalExam = sFinalExam;
    }

    public EnglishStudents(String sStudentFirstName, String sStudentLastName,
                           String sStudentSubject, int sTermPaper, int sMidTerm,
                           int sFinalExam) {
        super(sStudentFirstName, sStudentLastName, sStudentSubject);
        mTermPaper = sTermPaper;
        mMidTerm = sMidTerm;
        mFinalExam = sFinalExam;
    }

    public int getTermPaper() {
        return mTermPaper;
    }

    public void setTermPaper(int sTermPaper) {
        mTermPaper = sTermPaper;
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

    // TODO: method/function to calculate student's average
    public String calculateAverage() {

        double average = getTermPaper() + getMidTerm() + getFinalExam();
        average = average / 3;
        DecimalFormat format = new DecimalFormat("#.00");

        return format.format(average);
    }


}
