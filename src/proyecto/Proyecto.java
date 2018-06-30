/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import Dao.EntidadesDAO.ProveedorDAO;
import Entidades.Proveedor;

/**
 *
 * @author LN710Q
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proveedor Dpro = new Proveedor();
        ProveedorDAO Cpro = new ProveedorDAO();
        Dpro.setNombreEmpresa("Panini");
        Dpro.setNombreEncargado("CULERO");
        Dpro.setDuiEncargado("1233");
        Dpro.setTelefonoEncargado("12212");
        Dpro.setUrlEncargado("www.hola.com");
        
        Cpro.insert(Dpro);
    }
    
}
