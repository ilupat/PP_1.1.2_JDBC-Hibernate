package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DATABASE_DRIVE = "com.mysql.cj.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String USERNAME = "ilupat";
    private static final String PASSWORD = "ilupat123";

    public static Connection getConnect() {
        Connection connection = null;
        try {
            Class.forName(DATABASE_DRIVE);
            connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

}
