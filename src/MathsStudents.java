import java.text.DecimalFormat;

public class MathsStudents extends StudentInformation {

    private int mQuiz1;
    private int mQuiz2;
    private int mQuiz3;
    private int mQuiz4;
    private int mQuiz5;
    private int mTest1;
    private int mTest2;
    private int mFinalExam;

    public MathsStudents() {
        // empty constructor required

    }

    public MathsStudents(int sQuiz1, int sQuiz2, int sQuiz3, int sQuiz4,
                         int sQuiz5, int sTest1, int sTest2, int sFinalExam) {
        mQuiz1 = sQuiz1;
        mQuiz2 = sQuiz2;
        mQuiz3 = sQuiz3;
        mQuiz4 = sQuiz4;
        mQuiz5 = sQuiz5;
        mTest1 = sTest1;
        mTest2 = sTest2;
        mFinalExam = sFinalExam;
    }


    public MathsStudents(String sStudentFirstName, String sStudentLastName,
                         String sStudentSubject, int sQuiz1, int sQuiz2,
                         int sQuiz3, int sQuiz4, int sQuiz5, int sTest1,
                         int sTest2, int sFinalExam) {
        super(sStudentFirstName, sStudentLastName, sStudentSubject);
        mQuiz1 = sQuiz1;
        mQuiz2 = sQuiz2;
        mQuiz3 = sQuiz3;
        mQuiz4 = sQuiz4;
        mQuiz5 = sQuiz5;
        mTest1 = sTest1;
        mTest2 = sTest2;
        mFinalExam = sFinalExam;
    }

    public int getQuiz1() {
        return mQuiz1;
    }

    public void setQuiz1(int sQuiz1) {
        mQuiz1 = sQuiz1;
    }

    public int getQuiz2() {
        return mQuiz2;
    }

    public void setQuiz2(int sQuiz2) {
        mQuiz2 = sQuiz2;
    }

    public int getQuiz3() {
        return mQuiz3;
    }

    public void setQuiz3(int sQuiz3) {
        mQuiz3 = sQuiz3;
    }

    public int getQuiz4() {
        return mQuiz4;
    }

    public void setQuiz4(int sQuiz4) {
        mQuiz4 = sQuiz4;
    }

    public int getQuiz5() {
        return mQuiz5;
    }

    public void setQuiz5(int sQuiz5) {
        mQuiz5 = sQuiz5;
    }

    public int getTest1() {
        return mTest1;
    }

    public void setTest1(int sTest1) {
        mTest1 = sTest1;
    }

    public int getTest2() {
        return mTest2;
    }

    public void setTest2(int sTest2) {
        mTest2 = sTest2;
    }

    public int getFinalExam() {
        return mFinalExam;
    }

    public void setFinalExam(int sFinalExam) {
        mFinalExam = sFinalExam;
    }


    // TODO: method/function to calculate student's average
    public String calculateAverage() {

        double average =
                getQuiz1() + getQuiz2() + getQuiz3() + getQuiz4() + getQuiz5()
                        + getTest1() + getTest2() + getFinalExam();

        average = average / 8;
        //converting average to 2 decimal place
        DecimalFormat format = new DecimalFormat("#.00");

        return format.format(average);
    }
}
