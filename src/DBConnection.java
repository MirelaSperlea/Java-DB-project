package licitatiitelefoane;

import java.sql.*;

public class DBConnection {
    Connection con = null;
    
    public static Connection ConnectionDB(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:LicitatiiTelefoane_DB.db");
            System.out.println("Connection succeded");
            return con;
        }
        catch(Exception e){
            System.out.println("Connection failed" + e);
            return null;
        } 
    }
}

