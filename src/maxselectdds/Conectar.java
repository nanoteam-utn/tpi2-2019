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
    private static final String clase = "com.mysql.jdbc.Driver";
    private static final String usuario = "root";
    private static final String contrasena = "1234";
    private static final String url = "jdbc:mysql://localhost/disenio";

    public static Connection Conectar() {
        Connection conn = null;
        try{
            Class.forName(clase);
            conn = DriverManager.getConnection(url,usuario,contrasena);
            
            System.out.println("Conexion establecida..");
                            
            
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return conn;    
    }

}

