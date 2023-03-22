package br.crud.app;

import br.crud.app.controller.Controller;

import java.util.Scanner;

public class App {
    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the CRUD app. try: \n \"L\" to login. \n \"R\" to register.");
        String userChose = scanner.next();

        if(userChose.equals("L") || userChose.equals("l")){
            loginPage();
        } else if(userChose.equals("R") || userChose.equals("r")){
            registerPage();
        } else {
            System.out.println("Insert a valid prompt.");
        }
    }

    private static void loginPage(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("<< Login >> \n Username:");
        String username = scanner.next();

        System.out.println("Your password: ");
        String password = scanner.next();

        Controller.verifyLogin(username, password);
    }

    private static void registerPage(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("<< Register >> \n Username:");
        String username = scanner.next();

        System.out.println("Password:");
        String password = scanner.next();

        System.out.println("Confirm password");
        String confirmPassword = scanner.next();

        Controller.verifyRegister(username, password, confirmPassword);
    }
}
