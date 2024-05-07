// Clase Connection_JDBC con patrón Singleton
package default_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_JDBC {
    private static Connection_JDBC instance = null;
    private Connection connection;

    private Connection_JDBC() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/instituto", "root", "aucas1945");
    }

    public static Connection_JDBC getInstance() throws SQLException {
        if (instance == null) {
            instance = new Connection_JDBC();
        }
        return instance;
    }

    public void closeConnection() throws SQLException {
        if (connection != null)
            connection.close();
    }

    public Connection getConnection() {
        return connection;
    }
}
