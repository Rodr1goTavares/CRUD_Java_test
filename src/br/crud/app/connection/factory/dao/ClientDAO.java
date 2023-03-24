package br.crud.app.connection.factory.dao;

import java.sql.*;

public class ClientDAO {
    private Connection connection = null;
    public ClientDAO(){
        try{
            // Import driver
            String driverMySQL = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverMySQL);

            final String DATABASE_URL = "jdbc:mysql://localhost:3306/java_crud";
            final String USERNAME = "root";
            final String PASS = "rodrikgamer123";

            // Connect to database
            this.connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASS);

            //Test connection
            if(connection != null){
                System.out.println("STATUS---> Connected to database");
            } else {
                System.out.println("STATUS---> Connection failed");
            }
        }
        catch(SQLException | ClassNotFoundException error){
            System.out.println("A error has occurred (br.crudi.app.connection.factory.connectMySQL): " + error);
        }
    }

    public boolean insertClient(DAOmodel clientCreated) {
        try{
            String sql = "INSERT INTO accounts (user, password) VALUES (?, ?)";
            PreparedStatement statement = this.connection.prepareStatement(sql);
            statement.setString(1, clientCreated.getUsername());
            statement.setString(2, clientCreated.getPassword());
            statement.execute();

            System.out.println("(br.crud.app.connection.factory.dao) Added on Database !!!!");
            return true;
        }
        catch(SQLException error){
            System.out.println("A error as occurred: " + error);
            return false;
        }
    }


}
