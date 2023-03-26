package com.test.crud.database.dao;

import java.sql.*;

public class ClientDAO {
    public static Connection connectDB(){
        Connection connection = null;

        try{
            // Import driver
            String driverMySQL = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverMySQL);

            final String DATABASE_URL = "jdbc:mysql://localhost:3306/java_crud";
            final String USERNAME = "root";
            final String PASS = "rodrikgamer123";

            // Connect to com.test.crud.database
            connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASS);

            //Test connection
            if(connection == null){
                System.out.println("STATUS---> Connection failed");
            }

            System.out.println("STATUS---> Connected to database");
            return connection;
        }
        catch(SQLException | ClassNotFoundException error){
            System.out.println("A error has occurred (br.crudi.app.connection.factory.connectMySQL): " + error);
            return null;
        }
    }
}
