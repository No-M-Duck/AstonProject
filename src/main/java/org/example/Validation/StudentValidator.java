package org.example.Validation;

import org.example.models.Bus;
import org.example.models.Student;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentValidator implements Validator<Student> {

    private static final Logger logger = Logger.getLogger(BusValidator.class.getName());

    @Override
    public boolean isValid(Student student) {
        if(student.getAvgScore()<=0){
            logInvalidStudent(student,Level.SEVERE,"Average value of the student's grade is negative");
            return false;
        }
        if(student.getNumberGroup()<=0){
             logInvalidStudent(student,Level.SEVERE,"Number group is negative");
            return false;
        }
        if(student.getRecordBookNumber()<=0){
            logInvalidStudent(student,Level.SEVERE,"Record book number is negative");
            return false;
        }
        return true;
    }

    private void logInvalidStudent(Student student, Level level, String message) {
        String logMessage = String.format("Student validation failed: %s. Student details: %s", message, student.toString());
        logger.log(level, logMessage);
    }
}
