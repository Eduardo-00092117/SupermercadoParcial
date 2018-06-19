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
public class Proveedor {

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEncargado() {
        return nombreEncargado;
    }

    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }

    public String getDuiEncargado() {
        return duiEncargado;
    }

    public void setDuiEncargado(String duiEncargado) {
        this.duiEncargado = duiEncargado;
    }

    public String getTelefonoEncargado() {
        return telefonoEncargado;
    }

    public void setTelefonoEncargado(String telefonoEncargado) {
        this.telefonoEncargado = telefonoEncargado;
    }

    public String getUrlEncargado() {
        return urlEncargado;
    }

    public void setUrlEncargado(String urlEncargado) {
        this.urlEncargado = urlEncargado;
    }
    private int idProveedor;
    private String nombreEmpresa, nombreEncargado, duiEncargado,telefonoEncargado,urlEncargado;
    
    public Proveedor(){
        
    }
}
