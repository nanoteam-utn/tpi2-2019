/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxselectdds;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    
    public int guardar(String dni, String nomyap, String direccion, String localidad, String provincia, String telefono, String CP){
        int resultado = 0;
        Connection conn = null;
        
        String sentencia_guardar = ("INSERT INTO clientes (dni,nomyap,direccion,localidad,provincia,telefono,CP) VALUES (?,?,?,?,?,?,?)");
        
        try{
            conn = Conectar.Conectar();
            sentencia_preparada = conn.prepareStatement(sentencia_guardar);
            
            sentencia_preparada.setString(1, dni);
            sentencia_preparada.setString(2, nomyap);
            sentencia_preparada.setString(3, direccion);
            sentencia_preparada.setString(4, localidad);
            sentencia_preparada.setString(5, provincia);
            sentencia_preparada.setString(6, telefono);
            sentencia_preparada.setString(7, CP);
            
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conn.close();
        } catch(Exception e){
            System.out.println(e);
        }
        return resultado;
    }
    public static String buscarNombre(String correo) throws SQLException{
        String busqueda_nombre = null;
        Connection conn = null;
        try{
            conn = Conectar.Conectar();
            String sentencia_buscar = ("SELECT dni FROM usuarios WHERE correo = '" + correo + "'");
            sentencia_preparada = conn.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();
            if(resultado.next()){
                String nombre = resultado.getString("nombre");
                String apellidos = resultado.getString("apellidos");
                busqueda_nombre = (nombre + " " + apellidos);
            
        }
        conn.close();
        
        }catch(Exception e){
            System.out.println(e);
        
        }
        return busqueda_nombre;
    }
    public static String buscarUsuarioRegistrado(String correo,String contrasena){
        String busqueda_usuario = null;
        Connection conn = null;
        
        try{
            conn = Conectar.Conectar();
            String sentencia_buscar_usuario = ("SELECT nombre,correo,contrasena FROM usuarios WHERE correo = '"+correo+"' && contrasena = '"+contrasena+"'");
            sentencia_preparada = conn.prepareStatement(sentencia_buscar_usuario);
            resultado = sentencia_preparada.executeQuery();

            
            if (resultado.next()){
                busqueda_usuario = "usuario encontrado";
            }else{
                busqueda_usuario = "usuario no encontrado";
            }
            conn.close();
            
        } catch(Exception e){
            System.out.println(e);
            
            
        }
        return busqueda_usuario;
    }
    public static String buscarDNI(String dni) throws SQLException{
        String busqueda_dni = null;
        Connection conn = null;

        try{
            conn = Conectar.Conectar();
            String sentencia_buscar_usuario = ("SELECT dni FROM clientes WHERE dni = '" + dni + "'");
            sentencia_preparada = conn.prepareStatement(sentencia_buscar_usuario);
            resultado = sentencia_preparada.executeQuery();
            
            if(resultado.next()){
                busqueda_dni = "usuario encontrado";
            
            }else{
                busqueda_dni = "usuario no encontrado";
                }
        
        conn.close();
  
        }catch(Exception e){
            System.out.println(e);
        
        }
        return busqueda_dni;
    }
    public int guardarMotivo(String motivo,String dni){
        int resultado = 0;
        Connection conn = null;
        
        String sentencia_guardar = ("INSERT INTO motivos (motivo,dni) VALUES (?,?)");
        
        try{
            conn = Conectar.Conectar();
            sentencia_preparada = conn.prepareStatement(sentencia_guardar);
            
            sentencia_preparada.setString(1, motivo);
            sentencia_preparada.setString(2, dni);
            
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conn.close();
        } catch(Exception e){
            System.out.println(e);
        }
        return resultado;
    }
    
}
