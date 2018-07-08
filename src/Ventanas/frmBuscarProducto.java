/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Dao.EntidadesDAO.CategoriaProductoDAO;
import Dao.EntidadesDAO.MarcaDAO;
import Dao.EntidadesDAO.ProductoDAO;
import Entidades.CategoriaProducto;
import Entidades.Marca;
import Entidades.Producto;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Roberto
 */
public class frmBuscarProducto extends javax.swing.JFrame {

    /**
     * Creates new form frmBuscarProducto
     */
    public frmBuscarProducto() {
        initComponents();
        this.setTitle("Buscar Producto");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        llenarTabla();
         this.getContentPane().setBackground(new java.awt.Color(245, 204, 196));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBuscador = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBuscarProducto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jLabel1.setText("Buscar Producto ");

        txtBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscadorKeyPressed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1434610269_old-edit-find.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tableBuscarProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "NombreProducto", "CantidadProducto", "PrecioCompra", "PrecioVenta", "FechaIngreso", "FechaCaducidad", "DescripcionProducto", "Marca", "Categoria"
            }
        ));
        tableBuscarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBuscarProductoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableBuscarProducto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1112, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        llenarTablaFiltro(); 
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tableBuscarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBuscarProductoMouseClicked

    }//GEN-LAST:event_tableBuscarProductoMouseClicked

    private void txtBuscadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            llenarTablaFiltro();
        }
    }//GEN-LAST:event_txtBuscadorKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyReleased

    public void llenarTabla(){
        //Se ocupa para borrar los datos de la tabla.
        DefaultTableModel modelos = (DefaultTableModel) tableBuscarProducto.getModel();
        while(modelos.getRowCount()>0)modelos.removeRow(0);
        MarcaDAO marcaDao = new MarcaDAO();
        CategoriaProductoDAO catProDao = new CategoriaProductoDAO();
        ProductoDAO proDao = new ProductoDAO();
        Marca marca = new Marca();
        CategoriaProducto catPro = new CategoriaProducto();
         for(Producto producto : proDao.findAll()){
             DefaultTableModel modelo = (DefaultTableModel) tableBuscarProducto.getModel();
             modelo.addRow(new Object[10]);
              int nuevaFila = modelo.getRowCount()-1;
              tableBuscarProducto.setValueAt(producto.getIdProducto(), nuevaFila, 0);
              tableBuscarProducto.setValueAt(producto.getNombreProducto(), nuevaFila, 1);
              tableBuscarProducto.setValueAt(producto.getCantidadProducto(), nuevaFila, 2);
              tableBuscarProducto.setValueAt(producto.getPrecioCompra(), nuevaFila, 3);
              tableBuscarProducto.setValueAt(producto.getPrecioVenta(), nuevaFila, 4);
              tableBuscarProducto.setValueAt(producto.getFechaIngresoProducto(), nuevaFila, 5);
              tableBuscarProducto.setValueAt(producto.getFechaCaducidadProducto(), nuevaFila, 6);
              tableBuscarProducto.setValueAt(producto.getDescripcionProducto(), nuevaFila, 7);
              marca.setIdMarca(producto.getFK_idMarca());
              tableBuscarProducto.setValueAt(marcaDao.findBy(marca, "idMarca").get(0).getNombreMarca(), nuevaFila, 8);//PARA FK ID MARCA
              catPro.setIdCategoriaProducto(producto.getFK_idCategoriaProducto());
              tableBuscarProducto.setValueAt(catProDao.findBy(catPro,"idCategoriaProducto").get(0).getNombreCategoriaProducto(), nuevaFila, 9);
               //PARA FK ID CATEGORIA PRODUCTO
              
        }
        
    }
    
    public void llenarTablaFiltro(){
        //Se ocupa para borrar los datos de la tabla.
        DefaultTableModel modelos = (DefaultTableModel) tableBuscarProducto.getModel();
        while(modelos.getRowCount()>0)modelos.removeRow(0);
        MarcaDAO marcaDao = new MarcaDAO();
        CategoriaProductoDAO catProDao = new CategoriaProductoDAO();
        ProductoDAO proDao = new ProductoDAO();
        Producto pro = new Producto();
        Marca marca = new Marca();
        pro.setIdProducto(txtBuscador.getText());
        CategoriaProducto catPro = new CategoriaProducto();
         for(Producto producto : proDao.findByIdProducto(pro)){
             DefaultTableModel modelo = (DefaultTableModel) tableBuscarProducto.getModel();
             modelo.addRow(new Object[10]);
              int nuevaFila = modelo.getRowCount()-1;
              tableBuscarProducto.setValueAt(producto.getIdProducto(), nuevaFila, 0);
              tableBuscarProducto.setValueAt(producto.getNombreProducto(), nuevaFila, 1);
              tableBuscarProducto.setValueAt(producto.getCantidadProducto(), nuevaFila, 2);
              tableBuscarProducto.setValueAt(producto.getPrecioCompra(), nuevaFila, 3);
              tableBuscarProducto.setValueAt(producto.getPrecioVenta(), nuevaFila, 4);
              tableBuscarProducto.setValueAt(producto.getFechaIngresoProducto(), nuevaFila, 5);
              tableBuscarProducto.setValueAt(producto.getFechaCaducidadProducto(), nuevaFila, 6);
              tableBuscarProducto.setValueAt(producto.getDescripcionProducto(), nuevaFila, 7);
              marca.setIdMarca(producto.getFK_idMarca());
              tableBuscarProducto.setValueAt(marcaDao.findBy(marca, "idMarca").get(0).getNombreMarca(), nuevaFila, 8);//PARA FK ID MARCA
              catPro.setIdCategoriaProducto(producto.getFK_idCategoriaProducto());
              tableBuscarProducto.setValueAt(catProDao.findBy(catPro,"idCategoriaProducto").get(0).getNombreCategoriaProducto(), nuevaFila, 9);
               //PARA FK ID CATEGORIA PRODUCTO
              
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBuscarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableBuscarProducto;
    private javax.swing.JTextField txtBuscador;
    // End of variables declaration//GEN-END:variables
}
