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
public class Producto {
    public Producto(){
        
    }
    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getFechaIngresoProducto() {
        return fechaIngresoProducto;
    }

    public void setFechaIngresoProducto(String fechaIngresoProducto) {
        this.fechaIngresoProducto = fechaIngresoProducto;
    }

    public String getFechaCaducidadProducto() {
        return fechaCaducidadProducto;
    }

    public void setFechaCaducidadProducto(String fechaCaducidadProducto) {
        this.fechaCaducidadProducto = fechaCaducidadProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    private String  nombreProducto,descripcionProducto,fechaIngresoProducto,fechaCaducidadProducto,idProducto;
    private int cantidadProducto,FK_idMarca,FK_idCategoriaProducto;

    public int getFK_idMarca() {
        return FK_idMarca;
    }

    public void setFK_idMarca(int FK_idMarca) {
        this.FK_idMarca = FK_idMarca;
    }

    public int getFK_idCategoriaProducto() {
        return FK_idCategoriaProducto;
    }

    public void setFK_idCategoriaProducto(int FK_idCategoriaProducto) {
        this.FK_idCategoriaProducto = FK_idCategoriaProducto;
    }
    private double precioCompra,precioVenta;
}
