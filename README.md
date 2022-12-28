# StudentGrades
Reading student's record from an input text file, calculate and write out the average according to the student's classes to an output file

1. StudentInformation.java - base class for storing student's name and the subject they take inherited by EnglishStudents.java, MathsStudents.java, and History.java respectively.

2.  EnglishStudents.java, MathsStudents.java, and History.java - subclasses of StudentInformation.  java for storing student's scores according the subjects they take.

3. readFromFile() - function/method that reads data from the input.txt file

4. writeToFile() - function/method that writes data to the output.txt file. Called inside  readFromFile()

5. grade() -  function/method for grading average score

6. gradeDistribution() - function/method showing count of each letter grade

7. Main.java - entry point for executing the program

Requirements:
IDE: IntellijIdea
JDK: 17.0.2 and 8u301 or later.