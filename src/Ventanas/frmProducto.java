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
import Entidades.Proveedor;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Roberto
 */
public class frmProducto extends javax.swing.JFrame {

    /**
     * Creates new form frmProducto
     */
    public frmProducto() {
        initComponents();
        MarcaDAO marcaDao = new MarcaDAO();
        CategoriaProductoDAO catProDao =  new CategoriaProductoDAO();
        for(Marca marca : marcaDao.findAll()){
            ComboBoxMarca.addItem(marca.getNombreMarca());
        }
        for(CategoriaProducto catPro:catProDao.findAll()){
            ComboBoxCategoriaProducto.addItem(catPro.getNombreCategoriaProducto());
        }
        llenarTabla();
        txtId.setVisible(false);
        this.setTitle("Producto");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPrecioCompra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFechaIngreso = new javax.swing.JTextField();
        txtFechaCaducidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProducto = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaDescripcion = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        SpnCantidad = new javax.swing.JSpinner();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        ComboBoxMarca = new javax.swing.JComboBox<>();
        ComboBoxCategoriaProducto = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });

        jLabel1.setText("Producto");

        jLabel2.setText("Precio Compra");

        jLabel3.setText("Precio Venta");

        jLabel4.setText("Fecha Ingreso");

        jLabel5.setText("Fecha Caducidad");

        jLabel6.setText("Descripcion");

        tableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idProducto", "NombreProducto", "CantidadProducto", "PrecioCompra", "PrecioVenta", "FechaIngreso", "FechaCaducidad", "DescripcionProducto", "FK_idMarca", "FK_idCategoriaProducto"
            }
        ));
        jScrollPane2.setViewportView(tableProducto);
        if (tableProducto.getColumnModel().getColumnCount() > 0) {
            tableProducto.getColumnModel().getColumn(0).setMinWidth(0);
            tableProducto.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        txtAreaDescripcion.setColumns(20);
        txtAreaDescripcion.setRows(5);
        jScrollPane3.setViewportView(txtAreaDescripcion);

        jLabel7.setText("Cantidad");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel9.setText("ID");

        txtId.setText("jTextField1");

        ComboBoxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ComboBoxCategoriaProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addGap(8, 8, 8)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtProducto)
                                    .addComponent(txtPrecioCompra)
                                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SpnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnModificar)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnEliminar))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboBoxMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBoxCategoriaProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFechaCaducidad)
                            .addComponent(txtFechaIngreso)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtFechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(SpnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnEliminar)
                                    .addComponent(btnModificar)
                                    .addComponent(btnAgregar)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBoxCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        ProductoDAO proDao = new ProductoDAO();
        Producto producto = new Producto();
        MarcaDAO marcaDao = new MarcaDAO();
        CategoriaProductoDAO catProDao = new CategoriaProductoDAO();
        Marca marca = new Marca();
        CategoriaProducto catPro = new CategoriaProducto();
        producto.setNombreProducto(txtProducto.getText());
        producto.setCantidadProducto(Integer.parseInt(SpnCantidad.getValue().toString()));//Convirtiendo el tipo objeto del spinner
        producto.setPrecioCompra(Double.parseDouble(txtPrecioCompra.getText().toString()));//Convirtiendo  
        producto.setPrecioVenta(Double.parseDouble(txtPrecioVenta.getText().toString()));//Convirtiendo 
        producto.setFechaIngresoProducto(txtFechaIngreso.getText());
        producto.setFechaCaducidadProducto(txtFechaCaducidad.getText());
        producto.setDescripcionProducto(txtAreaDescripcion.getText());
        producto.setFK_idMarca(marcaDao.findBy(marca,"Nombre_empresa").get(0).getIdMarca());//PARA FK ID MARCA
        producto.setFK_idCategoriaProducto(catProDao.findBy(catPro, "Nombre_empresa").get(0).getIdCategoriaProducto()); //PARA FK ID CATEGORIA PRODUCTO
        proDao.insert(producto);
        JOptionPane.showMessageDialog(null, "Datos ingresado con exitos");
        limpiar();
        llenarTabla();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        ProductoDAO proDao = new ProductoDAO();
        Producto producto = new Producto();
        CategoriaProducto catPro = new CategoriaProducto();
        MarcaDAO marcaDao = new MarcaDAO();
        CategoriaProductoDAO catProDao = new CategoriaProductoDAO();
        Marca marca = new Marca();
        producto.setNombreProducto(txtProducto.getText());
        producto.setCantidadProducto(Integer.parseInt(SpnCantidad.getValue().toString()));//Convirtiendo el tipo objeto del spinner
        producto.setPrecioCompra(Double.parseDouble(txtPrecioCompra.getText().toString())); //Convirtiendo 
        producto.setPrecioVenta(Double.parseDouble(txtPrecioVenta.getText().toString()));
        producto.setFechaIngresoProducto(txtFechaIngreso.getText());
        producto.setFechaCaducidadProducto(txtFechaCaducidad.getText());
        producto.setDescripcionProducto(txtAreaDescripcion.getText());
        producto.setFK_idMarca(marcaDao.findBy(marca,"Nombre_empresa").get(0).getIdMarca());//PARA FK ID MARCA
        producto.setFK_idCategoriaProducto(catProDao.findBy(catPro, "Nombre_empresa").get(0).getIdCategoriaProducto()); //PARA FK ID CATEGORIA PRODUCTO
        proDao.update(producto);
        JOptionPane.showMessageDialog(null, "Datos actualizados con exito");
        limpiar();
        llenarTabla();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        ProductoDAO proDao = new ProductoDAO();
        Producto producto = new Producto();
        producto.setIdProducto(Integer.parseInt(txtId.getText()));
        proDao.delete(producto);
        JOptionPane.showMessageDialog(null, "Producto Eliminado");
        limpiar();
        llenarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed
    public void limpiar(){
        txtProducto.setText("");
        txtPrecioVenta.setText("");
        txtFechaCaducidad.setText("");
        txtFechaIngreso.setText("");
        txtPrecioCompra.setText("");
        txtAreaDescripcion.setText("");
        SpnCantidad.setValue(0);
    }
    public void llenarTabla(){
        //Se ocupa para borrar los datos de la tabla.
        DefaultTableModel modelos = (DefaultTableModel) tableProducto.getModel();
        while(modelos.getRowCount()>0)modelos.removeRow(0);
        MarcaDAO marcaDao = new MarcaDAO();
        CategoriaProductoDAO catProDao = new CategoriaProductoDAO();
        ProductoDAO proDao = new ProductoDAO();
        Marca marca = new Marca();
        CategoriaProducto catPro = new CategoriaProducto();
        for(Producto producto : proDao.findAll()){
             DefaultTableModel modelo = (DefaultTableModel) tableProducto.getModel();
             modelo.addRow(new Object[10]);
              int nuevaFila = modelo.getRowCount()-1;
              tableProducto.setValueAt(producto.getIdProducto(), nuevaFila, 0);
              tableProducto.setValueAt(producto.getNombreProducto(), nuevaFila, 1);
              tableProducto.setValueAt(producto.getCantidadProducto(), nuevaFila, 2);
              tableProducto.setValueAt(producto.getPrecioCompra(), nuevaFila, 3);
              tableProducto.setValueAt(producto.getPrecioVenta(), nuevaFila, 4);
              tableProducto.setValueAt(producto.getFechaIngresoProducto(), nuevaFila, 5);
              tableProducto.setValueAt(producto.getFechaCaducidadProducto(), nuevaFila, 6);
              tableProducto.setValueAt(producto.getDescripcionProducto(), nuevaFila, 7);
              marca.setIdMarca(producto.getFK_idMarca());
              tableProducto.setValueAt(marcaDao.findBy(marca, "idMarca").get(0).getNombreMarca(), nuevaFila, 8);//PARA FK ID MARCA
              //catPro.setIdCantidadProducto(producto.getFK_idCategoriaProducto());
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
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxCategoriaProducto;
    private javax.swing.JComboBox<String> ComboBoxMarca;
    private javax.swing.JSpinner SpnCantidad;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tableProducto;
    private javax.swing.JTextArea txtAreaDescripcion;
    private javax.swing.JTextField txtFechaCaducidad;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
