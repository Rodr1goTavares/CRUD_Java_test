package br.crudi.app.connection.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    private static final String USERNAME = "root";
    private static final String PASS = "rodrikgamer123";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/java_crud";


    //Connection
    public static Connection connectMySQL() throws SQLException, ClassNotFoundException {
       Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASS);

        if(connection != null) {
            System.out.println("Connected !!");
            connection.close();
        }

        return connection;
    }
}
