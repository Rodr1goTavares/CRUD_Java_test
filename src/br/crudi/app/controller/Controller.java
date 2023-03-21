package br.crudi.app.controller;

import br.crudi.app.connection.factory.dao.ClientDAO;
import br.crudi.app.controller.Models.Register;

import java.sql.SQLException;

public class Controller {
    public static void verifyLogin(String user, String password){
        System.out.println("user = " + user + ", password = " + password);
    }

    public static void verifyRegister(String user, String password, String confirmPassword){
        if(!password.equals(confirmPassword)){
            System.out.println("The passwords don't match.");
            return;
        }

        //Sends register form to ClientDAO
        Register.Client client = new Register.Client();
        client.setUsername(user);
        client.setPassword(password);

        System.out.println("user = " + client.getUsername() + ", password = " + client.getPassword());

        try{
            ClientDAO.addClient(client);
            System.out.println("Registered");
        }
        catch(Exception error){
            System.out.println("A error as ocurred (br.crudi.app.controller): " + error);
        }

    }

}
