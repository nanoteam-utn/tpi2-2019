/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxselectdds;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author erick
 */
public class Metodos_sql {
    public static Conectar conn = new Conectar();
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;
    
    public int guardar(String nombre, String apellidos, String correo, String contrasena){
        int resultado = 0;
        Connection conn = null;
        
        String sentencia_guardar = ("INSERT INTO tabla ()");
        
        try{
            conn = Conectar.Conectar();
            sentencia_preparada = conn.prepareStatement(sentencia_guardar);
            
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, apellido);
            sentencia_preparada.setString(3, correo);
            sentencia_preparada.setString(4, contrasena);
            
            
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
        } catch(Esception e){
            System.out.println(e);
        }
        return resultado;
    }
}
