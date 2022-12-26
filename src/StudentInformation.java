
public class StudentInformation {

    private String mStudentFirstName;
    private String mStudentLastName;
    private String mStudentSubject;

    public StudentInformation() {
        // empty constructor required
    }

    public StudentInformation(String sStudentFirstName, String sStudentLastName,
                              String sStudentSubject) {
        mStudentFirstName = sStudentFirstName;
        mStudentLastName = sStudentLastName;
        mStudentSubject = sStudentSubject;
    }


    public String getStudentFirstName() {
        return mStudentFirstName;
    }

    public void setStudentFirstName(String sStudentFirstName) {
        mStudentFirstName = sStudentFirstName;
    }

    public String getStudentLastName() {
        return mStudentLastName;
    }

    public void setStudentLastName(String sStudentLastName) {
        mStudentLastName = sStudentLastName;
    }

    public String getStudentSubject() {
        return mStudentSubject;
    }

    public void setStudentSubject(String sStudentSubject) {
        mStudentSubject = sStudentSubject;
    }

}
