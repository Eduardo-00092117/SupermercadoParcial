/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author LN710Q
 */
public class Usuario {
    private int idUsuario, FK_idEmpleado;
    private String usuario, pass;
    
    public Usuario(){
        
    }
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getFK_idEmpleado() {
        return FK_idEmpleado;
    }

    public void setFK_idEmpleado(int FK_idEmpleado) {
        this.FK_idEmpleado = FK_idEmpleado;
    }
    
}
