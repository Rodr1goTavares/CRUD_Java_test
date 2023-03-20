package crudi.app.controller;

public class Controller {
    public static void verifyLogin(String user, String password){
        System.out.println("user = " + user + ", password = " + password);
    }

    public static void verifyRegister(String user, String password, String confirmPassword){
        if(!password.equals(confirmPassword)){
            System.out.println("The passwords don't match.");
            return;
        }

        System.out.println("Registered");
    }

}
