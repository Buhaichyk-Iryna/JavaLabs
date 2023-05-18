package lab5_java_buhaichyk.contoller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private static Connection DbConnection;
    private DatabaseManager() {}
    //з'єднання з базою даних
    public static Connection getDbConnection() throws SQLException {
        if (DbConnection == null) {
            DbConnection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    "qwerty"
            );
        }
        return DbConnection;
    }
}
