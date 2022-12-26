import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        readFromFile();


    }


    // function to read student's record from file
    public static void readFromFile() {

        String firstName = null;
        String middleName = null;
        String lastName = null;
        String subject;
        String line;
        int total;
        int quiz1, quiz2, quiz3, quiz4, quiz5, test1, test2, finalExam;
        int englishTermPaper, englishMidTerm, englishFinalExam;
        int historyAttendance, historyProject, historyMidTerm, historyFinalExam;

        // Array to store all student's info
        List<Object> stringList = new ArrayList<>();

        try {

            // TODO: change to your system's input.txt path
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("C:\\Users\\tooch\\IdeaProjects\\StudentGrades" +
                            "\\src\\file\\input.txt"));

            // iterate through the input file and read them
            while ((line = bufferedReader.readLine()) != null) {

                // store each line into this array, splitting each word for
                // easy access
                String[] split = line.split(" ");

                if (split.length == 1) {
                    total = Integer.parseInt(split[0]);
                    System.out.println("Total: " + total);

                } else if (split.length == 2) {
                    firstName = split[0];
                    lastName = split[1];

                } else if (split.length == 3) {

                    firstName = split[0];
                    middleName = split[1];
                    lastName = split[2];

                } else if (split.length == 4) {

                    subject = split[0];
                    englishTermPaper = Integer.parseInt(split[1]);
                    englishMidTerm = Integer.parseInt(split[2]);
                    englishFinalExam = Integer.parseInt(split[3]);

                    if (middleName == null) {
                        System.out.println();
                    } else {
                        firstName = "%s %s".formatted(firstName, middleName);
                    }


                    // storing english record to array
                    stringList.add(new EnglishStudents(firstName, lastName,
                            subject, englishTermPaper, englishMidTerm,
                            englishFinalExam));

                } else if (split.length == 5) {
                    subject = split[0];
                    historyAttendance = Integer.parseInt(split[1]);
                    historyProject = Integer.parseInt(split[2]);
                    historyMidTerm = Integer.parseInt(split[3]);
                    historyFinalExam = Integer.parseInt(split[4]);

                    if (middleName == null) {
                        System.out.println();
                    } else {
                        firstName = "%s %s".formatted(firstName, middleName);
                    }

                    stringList.add(new HistoryStudents(firstName, lastName,
                            subject, historyAttendance, historyProject,
                            historyMidTerm, historyFinalExam));

                } else if (split.length == 9) {

                    subject = split[0];
                    quiz1 = Integer.parseInt(split[1]);
                    quiz2 = Integer.parseInt(split[2]);
                    quiz3 = Integer.parseInt(split[3]);
                    quiz4 = Integer.parseInt(split[4]);
                    quiz5 = Integer.parseInt(split[5]);
                    test1 = Integer.parseInt(split[6]);
                    test2 = Integer.parseInt(split[7]);
                    finalExam = Integer.parseInt(split[8]);

                    if (middleName == null) {
                        System.out.println();
                    } else {
                        firstName = "%s %s".formatted(firstName, middleName);
                    }

                    stringList.add(new MathsStudents(firstName, lastName,
                            subject, quiz1, quiz2, quiz3, quiz4, quiz5, test1
                            , test2, finalExam));
                }

            }
            bufferedReader.close();


        } catch (IOException sE) {
            sE.printStackTrace();
        }


        // as the name implies
        writeToFile(stringList);
    }

    //function to write record to output.txt file called inside readFromFile()
    private static void writeToFile(List<Object> sStringList) {

        PrintWriter printWriter;

        String className = "", lastClassName = "";
        String name, average;
        int finalExam;
        String title;

        try {

            // TODO: change to your system's output.txt path
            printWriter = new PrintWriter(new FileWriter(
                    "C:\\Users\\tooch\\IdeaProjects\\StudentGrades" +
                            "\\src\\file\\output.txt"
                    , true));


            title = """
                                         
                                         STUDENT GRADE SUMMARY\s
                                         ----------------------
                    """;

            printWriter.println(title);

            for (Object sO : sStringList) {

                if (sO instanceof EnglishStudents sEnglishStudents) {

                    // Student's name
                    name =
                            sEnglishStudents.getStudentFirstName() + " " +
                                    sEnglishStudents.getStudentLastName();

                    finalExam = sEnglishStudents.getFinalExam();

                    average = sEnglishStudents.calculateAverage();


                    className = """
                                                    
                            ENGLISH CLASS\s
                                                    
                            STUDENT                               FINAL       FINAL        LETTER
                            NAME                                  EXAM        AVERAGE      GRADE
                            ----------------------------------------------------------------------
                            """;

                    if (className.equals(lastClassName)) {
                        className = "";

                    } else {
                        printWriter.write(className);
                    }

                    printWriter.println(formatRecord(name, finalExam, average
                            , grade(average)));

                }
                lastClassName = className;

            }


            for (Object sO : sStringList) {

                if (sO instanceof HistoryStudents sHistoryStudents) {

                    name =
                            sHistoryStudents.getStudentFirstName() + " " +
                                    sHistoryStudents.getStudentLastName();

                    finalExam = sHistoryStudents.getFinalExam();
                    average = sHistoryStudents.calculateAverage();

                    className = """
                                                    
                            HISTORY CLASS\s
                                                    
                            STUDENT                               FINAL       FINAL        LETTER
                            NAME                                  EXAM        AVERAGE      GRADE
                            ----------------------------------------------------------------------
                            """;

                    if (className.equals(lastClassName)) {
                        className = "";

                    } else {
                        printWriter.write(className);
                    }

                    printWriter.println(formatRecord(name, finalExam, average
                            , grade(average)));


                }
                lastClassName = className;

            }

            for (Object sO : sStringList) {
                if (sO instanceof MathsStudents sMathsStudents) {

                    name =
                            sMathsStudents.getStudentFirstName() + " " +
                                    sMathsStudents.getStudentLastName();

                    finalExam = sMathsStudents.getFinalExam();
                    average = sMathsStudents.calculateAverage();

                    className = """
                                                    
                            MATHS CLASS\s
                                                    
                            STUDENT                               FINAL       FINAL        LETTER
                            NAME                                  EXAM        AVERAGE      GRADE
                            ----------------------------------------------------------------------
                            """;


                    if (className.equals(lastClassName)) {
                        className = "";

                    } else {
                        printWriter.write(className);
                    }
                    printWriter.println(formatRecord(name, finalExam, average
                            , grade(average)));


                }
                lastClassName = className;


            }

            printWriter.println(gradeDistribution());

            printWriter.close();
        } catch (IOException sE) {
            sE.printStackTrace();
        }


    }


    // function to arrange records in fashion order called inside writeToFile()
    public static String formatRecord(String sName, int sExam,
                                      String sAverage, String sGrade) {

        return "%-36s  %-11s %-14s %-11s".formatted(sName, sExam, sAverage,
                sGrade);
    }

    // function to return grade called inside writeToFile()
    public static String grade(String sS) {

        double value = Double.parseDouble(sS);

        if (value <= 59) {
            sS = "F";
        } else if (value <= 69) {
            sS = "D";
        } else if (value <= 79) {
            sS = "C";
        } else if (value <= 89) {
            sS = "B";
        } else if (value <= 100) {
            sS = "A";
        }

        return sS;

    }

   // called inside writeToFile()
    public static String gradeDistribution() {

        return """


                OVERALL GRADE DISTRIBUTION\s

                A:
                B:
                C:
                D:
                F:
                """;
    }


}
//08123370118

