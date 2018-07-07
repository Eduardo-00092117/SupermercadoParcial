/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author UCA
 */
public class Conexion {
    private String user;
    private String pass;
    private String driver;
    private String nombre_base;
    private String security;
    
    private Connection cnx;
    
    public static Conexion instance;
    
    public synchronized static Conexion getInstanceConexion(){
        if(instance == null){
            return new Conexion();
        }
        return instance;
    }
    
    private Conexion(){
        cargarCredenciales();
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }catch(Exception ex){
            System.out.println("Error en la conexion");
        }
    }
    
    private void cargarCredenciales(){
        user = "";
        pass = "";
        driver = "jdbc:sqlserver://DESKTOP-VRHLQKB\\SQLEXPRESS;";//Aqui cambiar lo de 'DESKTOP-VRHLQKB'
        nombre_base = "databaseName=PROYECTO_SUPER;";
        security = "integratedSecurity=true;";
    }
    
    public Connection getCnx(){
        try {
            //Abre la conexion cuando se necesita.
            return DriverManager.getConnection(this.driver+this.nombre_base+this.security);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void cerrarConexion(){
        instance = null;
    }
}
