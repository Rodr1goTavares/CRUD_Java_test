package br.crud.app.controller.Models;

import br.crud.app.connection.factory.dao.ClientDAO;
import br.crud.app.connection.factory.dao.DAOmodel;

public class Register {
   public static void startRegister(String user, String password){

       DAOmodel client = new DAOmodel();
       client.setUsername(user);
       client.setPassword(password);

       System.out.println("(br.crud.app.controller)" + "user = " + client.getUsername() + ", password = " + client.getPassword());

       try {
           ClientDAO account = new ClientDAO();
           account.insertClient(client);
           System.out.println("Registered Successfully !!");
       }
       catch (Exception error){
           System.out.println("A error has occurred: (br.crudi.app.controller)");
       }
   }
}
