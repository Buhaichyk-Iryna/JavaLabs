package lab5_java_buhaichyk;

import lab5_java_buhaichyk.contoller.StudentController;
import lab5_java_buhaichyk.viewer.StudentViewer;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        StudentViewer.view(StudentController.findStudentsInDatabase("01.01.2003", "01.04.2003"));
    }
}