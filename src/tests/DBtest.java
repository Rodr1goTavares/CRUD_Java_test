package tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBtest {
    public static void connectDB() throws ClassNotFoundException, SQLException {
        // Import driver
        String driverName = "com.mysql.cj.jdbc.Driver";
        Class.forName(driverName);

        final String DATABASE_URL = "jdbc:mysql://localhost:3306/java_crud";
        final String USERNAME = "root";
        final String PASS = "rodrikgamer123";

        // Connect to database
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASS);

        //Insert
        String sql = "INSERT INTO accounts (user, password) VALUES (?, ?)";
        PreparedStatement ps = connection.prepareStatement(sql);

        AccountModel conta = new AccountModel();
        conta.setUsername("Lucas");
        conta.setEmail("lucas@gmail.com");
        conta.setPassword("lucas123");

        ps.setString(1, conta.getUsername());
        ps.setString(2, conta.getEmail());
        ps.execute();
    }
}
