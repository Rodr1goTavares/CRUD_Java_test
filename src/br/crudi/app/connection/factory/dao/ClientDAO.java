package br.crudi.app.connection.factory.dao;

import br.crudi.app.connection.factory.ConnectionDB;
import br.crudi.app.controller.Models.Register;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientDAO {
    private static Connection connect;

    public void clientDAO() throws SQLException, ClassNotFoundException {
        connect = ConnectionDB.connectMySQL();
    }

    public static void addClient(Register.Client client) {
        String sql = "INSERT INTO accounts (user, password) VALUES (?, ?)";

        try{
            PreparedStatement statement = connect.prepareStatement(sql);
            statement.setString(1, client.getUsername());
            statement.setString(2, client.getPassword());
        }
        catch(SQLException error){
            throw new RuntimeException(error);
        }


    }


}
