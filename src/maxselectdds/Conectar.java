/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxselectdds;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author erick
 */
public class Conectar {
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "1234";
    private static final String url = "jdbc:mysql://localhost:3306/disenio";

    public static Connection Conectar() {
        Connection conn = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,password);
            if(conn != null){
                System.out.println("Conexion establecida..");
            }
            Statement estado =  conn.createStatement();
            ResultSet resultado = estado.executeQuery("select * from persona");        
                      
            
        } catch(ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar con "+e);
        }
        return conn;
    
    }
    public Connection getConnection(){
        return conn;
    }

    
}

