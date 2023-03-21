package br.crudi.app.controller;

import br.crudi.app.connection.factory.dao.ClientDAO;
import br.crudi.app.controller.Models.Register;

import java.sql.SQLOutput;

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
        Register.Client clientCreated = new Register.Client();
        clientCreated.setUsername(user);
        clientCreated.setPassword(password);

        System.out.println("user = " + clientCreated.getUsername() + ", password = " + clientCreated.getPassword());

        try {
            ClientDAO account = new ClientDAO();
            account.insertClient(clientCreated);
            System.out.println("Registered !!");
        }
        catch (Exception error){
            System.out.println("A error has occurred: (br.crudi.app.controller)");
        }

    }

}
