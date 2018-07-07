/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import Dao.EntidadesDAO.*;
import Entidades.*;
import Ventanas.frmMarca;
import Ventanas.CategoriaProducto;

/**
 *
 * @author LN710Q
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado Demp = new Empleado();
        EmpleadoDAO Cemp = new EmpleadoDAO();
        frmMarca pro = new frmMarca();
        pro.setVisible(true);
        
        /*Demp.setNombreEmpleado("Eduardo");
        Demp.setApellidoEmpleado("Lopez");
        Demp.setDuiEmpleado("090909");
        Demp.setNitEmpleado("wewerwr");
        Demp.setCorreoEmpleado("okrioejrk");
        Demp.setFk_idCargo(1);
        Demp.setFk_idEstado(1);
        Demp.setSueldoEmpleado(123.2);
        Demp.setFechaEmpleado("06/06/2018");*/
        
        //System.out.println(Cemp.findAll().get(0).getNombreEmpleado());
        
        //Cemp.insert(Demp);
    }
    
}
