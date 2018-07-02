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
public class Facturacion {

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getHoraFactura() {
        return horaFactura;
    }

    public void setHoraFactura(String horaFactura) {
        this.horaFactura = horaFactura;
    }
    private int idFactura, fk_idEmpleado;

    public int getFk_idEmpleado() {
        return fk_idEmpleado;
    }

    public void setFk_idEmpleado(int fk_idEmpleado) {
        this.fk_idEmpleado = fk_idEmpleado;
    }
    private String fechaFactura,horaFactura;
    public Facturacion(){
        
    }
}
