package server;

import server.data.Database;

public class register {
    public static void createAccount(String user, String pass){
        Object account = new Object(){
            String username = user;
            String password = pass;
        };

        String[] acnt = {user, pass};

        Database.accounts(acnt);
    }
}
