package crudi.app.controller.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDal2 {
    public static void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/java_crud", "root", "rodrikgamer123");

        } catch(ClassNotFoundException error){
            System.out.println("Database driver not found");

        } catch(SQLException error){
            System.out.println("An error as occurred in database connection");
        }
    }
}
