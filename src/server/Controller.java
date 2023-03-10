package server;

import server.register;
import server.login;

public class Controller {
    public static void verifyLogin(String user, String password){

    }

    public static void verifyRegister(String user, String password, String passwordConfirm) {
        if (password.equals(passwordConfirm)){
            register.createAccount(user, password);
        } else{
            System.out.println("Passwords do not match. Try again");
        }
    }
}
