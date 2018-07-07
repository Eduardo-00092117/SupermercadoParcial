/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import Dao.EntidadesDAO.*;
import Entidades.*;
import Ventanas.*;

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
        
        frmLogin lo = new frmLogin();
        lo.setVisible(true);
    }
    
}
