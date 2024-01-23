package BankManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

    public Statement s;
    public Connection C;

    public Conn()
    {

        try {
            C = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Atharva@123");

            s = C.createStatement();

        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
