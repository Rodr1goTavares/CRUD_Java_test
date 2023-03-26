package com.test.crud.application;

import com.test.crud.database.models.AccountModel;
import com.test.crud.database.operations.Create;

public class Register {
    public static void startRegister(String username, String password){

        AccountModel account = new AccountModel();
        account.setUsername(username);
        account.setPassword(password);

        Create.verifyAccount(account);
    }
}
