package lab5_java_buhaichyk.contoller;

import lab5_java_buhaichyk.model.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentController {
    public static List<Student> findStudentsInDatabase(String fromDate, String toDate) throws SQLException {
        List<Student> students = new ArrayList<>();
        //пошук по базі даних
        PreparedStatement statement = DatabaseManager.getDbConnection()
                .prepareStatement("SELECT * FROM \"student\" WHERE birthday BETWEEN to_date(?, 'dd.MM.yyyy') and to_date(?, 'dd.MM.yyyy');");

        statement.setString(1, fromDate);
        statement.setString(2, toDate);

        ResultSet resultSet = statement.executeQuery();
        //створення студентів
        while (resultSet.next()) {
            students.add(new Student(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("surname"),
                    resultSet.getString("patronymic"),
                    resultSet.getDate("birthday"),
                    resultSet.getInt("gradebookId")
                )
            );
        }

        resultSet.close();
        statement.close();

        return students;
    }
}
