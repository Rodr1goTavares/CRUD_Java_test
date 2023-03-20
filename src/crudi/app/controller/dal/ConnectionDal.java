package crudi.app.controller.dal;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionDal {
    public static Connection connectDB(){
        Connection connect = null;

        try{
            String url = "jdbc:mysql://localhost:3306/java_crud?user=root&password=rodrikgamer123";
            connect = DriverManager.getConnection(url);
        } catch (SQLException error){
            JOptionPane.showMessageDialog(null, "<< Database.ConnectToDatabase >>" + error.getMessage());
        }

        return connect;
    }
}
