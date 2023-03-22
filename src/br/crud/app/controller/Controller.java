package br.crud.app.controller;

import br.crud.app.controller.Models.Register;

public class Controller {
    public static void verifyLogin(String user, String password){
        System.out.println("user = " + user + ", password = " + password);
    }

    public static void verifyRegister(String user, String password, String confirmPassword){
        if(!password.equals(confirmPassword)){
            System.out.println("The passwords don't match.");
            return;
        }
        try{
            Register.startRegister(user, password);
        }
        catch (Exception e){
            System.out.println("An error has occurred at start Register (br.crud.app.controller): " + e);
        }
    }

}
