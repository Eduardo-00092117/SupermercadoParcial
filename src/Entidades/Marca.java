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
public class Marca {
    public Marca(){
        
    }
    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public String getDescripcionMarca() {
        return descripcionMarca;
    }

    public void setDescripcionMarca(String descripcionMarca) {
        this.descripcionMarca = descripcionMarca;
    }
    private int idMarca,fk_idProveedor;
    private String nombreEmpresa,nombreMarca,descripcionMarca;

    public int getFk_idProveedor() {
        return fk_idProveedor;
    }

    public void setFk_idProveedor(int fk_idProveedor) {
        this.fk_idProveedor = fk_idProveedor;
    }

    @Override
    public String toString() {
        return "Marca{" + "idMarca=" + idMarca + ", fk_idProveedor=" + fk_idProveedor + ", nombreEmpresa=" + nombreEmpresa + ", nombreMarca=" + nombreMarca + ", descripcionMarca=" + descripcionMarca + '}';
    }
    
    
}
