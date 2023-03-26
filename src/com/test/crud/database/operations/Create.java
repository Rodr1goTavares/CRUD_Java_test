package com.test.crud.database.operations;

import com.test.crud.database.dao.ClientDAO;
import com.test.crud.database.models.AccountModel;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

public class Create {
    public static void verifyAccount(AccountModel account){
        System.out.println("Checking account...");
        insertAccount(account);
    }
    private static void insertAccount(AccountModel account){
        String user = account.getUsername();
        String password = account.getPassword();

        try{
            String sql = "INSERT INTO accounts (user, password) VALUES (?, ?)";
            PreparedStatement statement = Objects.requireNonNull(ClientDAO.connectDB()).prepareStatement(sql);
            statement.setString(1, user);
            statement.setString(2, password);
            statement.execute();

            System.out.println("Registered successfully !!!");
        }
        catch (SQLException error){
            System.out.println("A error has occurred to insert account: " + error);
        }
    }
}
