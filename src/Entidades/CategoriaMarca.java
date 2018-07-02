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
public class CategoriaMarca {
    public CategoriaMarca(){
        
    }

    public int getIdCategoriaMarca() {
        return idCategoriaMarca;
    }

    public void setIdCategoriaMarca(int idCategoriaMarca) {
        this.idCategoriaMarca = idCategoriaMarca;
    }

    public String getNombreCategoriaMarca() {
        return nombreCategoriaMarca;
    }

    public void setNombreCategoriaMarca(String nombreCategoriaMarca) {
        this.nombreCategoriaMarca = nombreCategoriaMarca;
    }

    public String getDescripcionCategoriaMarca() {
        return descripcionCategoriaMarca;
    }

    public void setDescripcionCategoriaMarca(String descripcionCategoriaMarca) {
        this.descripcionCategoriaMarca = descripcionCategoriaMarca;
    }
    private int idCategoriaMarca;
    private String nombreCategoriaMarca, descripcionCategoriaMarca;
}
