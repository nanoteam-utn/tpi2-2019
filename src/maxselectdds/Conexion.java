/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxselectdds;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author erick
 */
public class Conexion {
    public static void main(String[] args) {
        try{
            System.out.println("Estoy intentando acceder a la base de datos");
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/disenio","root","1234");
            System.out.println("Conexion exitosa");
            
            Statement estado = con.createStatement();
            ResultSet resultado  = estado.executeQuery("SELECT * FROM persona");
            
            System.out.println("dni \t nomyap");
            
            System.out.println("El tipo de dato es: " + resultado.getClass());
            
            while (resultado.next()){
                System.out.println(resultado.getInt("dni") + "\t" + resultado.getString("nomyap"));
            }
            
        }
        catch(Exception e){
            System.out.println("Error de MySQL");
            
        /*catch(ClassNotFoundException e){
            e.printStackTrace();
        } 
        catch(Exception e){
                System.out.println("Se ha encontrado el error " + e.getMessage());
        }*/
        }
    }
    
}
