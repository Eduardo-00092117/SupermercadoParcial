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
public class Empleado {
    public Empleado(){
        
    }
    
    private int idEmpleado, fk_idCargo, fk_idEstado;
    private double sueldoEmpleado;
    private String nombreEmpleado, apellidoEmpleado, duiEmpleado, nitEmpleado, correoEmpleado,fechaEmpleado;
    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldoEmpleado() {
        return sueldoEmpleado;
    }

    public void setSueldoEmpleado(double sueldoEmpleado) {
        this.sueldoEmpleado = sueldoEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public String getDuiEmpleado() {
        return duiEmpleado;
    }

    public void setDuiEmpleado(String duiEmpleado) {
        this.duiEmpleado = duiEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getFechaEmpleado() {
        return fechaEmpleado;
    }

    public void setFechaEmpleado(String fechaEmpleado) {
        this.fechaEmpleado = fechaEmpleado;
    }

    public int getFk_idCargo() {
        return fk_idCargo;
    }

    public void setFk_idCargo(int fk_idCargo) {
        this.fk_idCargo = fk_idCargo;
    }

    public int getFk_idEstado() {
        return fk_idEstado;
    }

    public void setFk_idEstado(int fk_idEstado) {
        this.fk_idEstado = fk_idEstado;
    }

    public String getNitEmpleado() {
        return nitEmpleado;
    }

    public void setNitEmpleado(String nitEmpleado) {
        this.nitEmpleado = nitEmpleado;
    }
}
