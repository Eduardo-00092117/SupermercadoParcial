
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
        
        frmCargando frm = new frmCargando();
        frm.show();
        //frmFacturacion lo = new frmFacturacion();
        //lo.show();
    }
    
}
