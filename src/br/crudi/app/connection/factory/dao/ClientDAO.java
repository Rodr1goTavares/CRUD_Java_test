package br.crudi.app.connection.factory.dao;

import br.crudi.app.controller.Models.Register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientDAO {
    private Connection connection;

    public ClientDAO(){

        final String USERNAME = "root";
        final String PASS = "rodrikgamer123";
        final String DATABASE_URL = "jdbc:mysql://localhost:3306/java_crud";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASS);
        }
        catch(SQLException | ClassNotFoundException error){
            System.out.println("A error has occurred (br.crudi.app.connection.factory.connectMySQL): " + error);
        }
    }

    public void addClient(Register.Client clientCreated) {
        try{
            String sql = "INSERT INTO accounts (user, password) VALUES (?, ?)";
            PreparedStatement statement = this.connection.prepareStatement(sql);
            statement.setString(1, clientCreated.getUsername());
            statement.setString(2, clientCreated.getPassword());

            System.out.println("Added on Database");
        }
        catch(SQLException error){
            throw new RuntimeException(error);
        }
    }


}
