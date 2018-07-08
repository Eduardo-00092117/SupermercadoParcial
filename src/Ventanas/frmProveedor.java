/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Dao.EntidadesDAO.*;
import Entidades.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class frmProveedor extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public frmProveedor() {
        initComponents();
        txtId.setVisible(false);
        llenarTabla();
        this.setTitle("Proveedor");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    public void limpiar() {
        txtDui.setText("");
        txtEmpresa.setText("");
        txtEncargado.setText("");
        txtId.setText("");
        txtTelefono.setText("");
        txtUrl.setText("");
    }

    public void llenarTabla() {
        //Se ocupa para borrar los datos de la tabla.
        DefaultTableModel modelos = (DefaultTableModel) tblTabla.getModel();
        while (modelos.getRowCount() > 0) {
            modelos.removeRow(0);
        }

        //Se comienza a llenar la tabla.
        ProveedorDAO pro = new ProveedorDAO();
        for (Proveedor proveedor : pro.findAll()) {
            DefaultTableModel modelo = (DefaultTableModel) tblTabla.getModel();
            modelo.addRow(new Object[10]);
            int nuevaFila = modelo.getRowCount() - 1;
            tblTabla.setValueAt(proveedor.getIdProveedor(), nuevaFila, 0);
            tblTabla.setValueAt(proveedor.getNombreEmpresa(), nuevaFila, 1);
            tblTabla.setValueAt(proveedor.getNombreEncargado(), nuevaFila, 2);
            tblTabla.setValueAt(proveedor.getDuiEncargado(), nuevaFila, 3);
            tblTabla.setValueAt(proveedor.getTelefonoEncargado(), nuevaFila, 4);
            tblTabla.setValueAt(proveedor.getUrlEncargado(), nuevaFila, 5);
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        txtEncargado = new javax.swing.JTextField();
        txtDui = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtUrl = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre del encargado: ");

        jLabel2.setText("Nombre de la empresa: ");

        jLabel3.setText("DUI:");

        jLabel4.setText("Telefono:");

        jLabel5.setText("URL:");

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        jButton4.setText("Guardar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Empresa", "Encargador", "DUI", "Telefono", "URL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTabla);
        if (tblTabla.getColumnModel().getColumnCount() > 0) {
            tblTabla.getColumnModel().getColumn(0).setMinWidth(0);
            tblTabla.getColumnModel().getColumn(0).setMaxWidth(0);
            tblTabla.getColumnModel().getColumn(1).setResizable(false);
            tblTabla.getColumnModel().getColumn(2).setResizable(false);
            tblTabla.getColumnModel().getColumn(3).setResizable(false);
            tblTabla.getColumnModel().getColumn(4).setResizable(false);
            tblTabla.getColumnModel().getColumn(5).setResizable(false);
        }

        jMenu1.setText("Regresar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(btnModificar))
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addGap(12, 12, 12)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaMouseClicked
        Integer id = (Integer) tblTabla.getValueAt(tblTabla.getSelectedRow(), 0);
        String empresa = (String) tblTabla.getValueAt(tblTabla.getSelectedRow(), 1);
        String encargado = (String) tblTabla.getValueAt(tblTabla.getSelectedRow(), 2);
        String dui = (String) tblTabla.getValueAt(tblTabla.getSelectedRow(), 3);
        String telefono = (String) tblTabla.getValueAt(tblTabla.getSelectedRow(), 4);
        String url = (String) tblTabla.getValueAt(tblTabla.getSelectedRow(), 4);
        txtId.setText(Integer.toString(id));
        txtEmpresa.setText((empresa));
        txtEncargado.setText((encargado));
        txtDui.setText((dui));
        txtTelefono.setText((telefono));
        txtUrl.setText((url));
    }//GEN-LAST:event_tblTablaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            if (!txtEmpresa.getText().isEmpty() && !txtEncargado.getText().isEmpty()
                    && !txtTelefono.getText().isEmpty() && !txtUrl.getText().isEmpty() && !txtDui.getText().isEmpty()) {
                ProveedorDAO pro = new ProveedorDAO(); //Se instancia la clase para buscar el id del proveedor.
                Proveedor prod = new Proveedor(); //Se instancia la clase para guardar los datos.
                prod.setNombreEmpresa(txtEmpresa.getText());
                prod.setNombreEncargado(txtEncargado.getText());
                prod.setDuiEncargado(txtDui.getText());
                prod.setTelefonoEncargado(txtTelefono.getText());
                prod.setUrlEncargado(txtUrl.getText());

                pro.insert(prod);
                JOptionPane.showMessageDialog(null, "Dato ingresado con Exito!");

                limpiar();
                llenarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Debe llenar todos los campos!!!");
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            if (!txtEmpresa.getText().isEmpty() && !txtEncargado.getText().isEmpty()
                    && !txtTelefono.getText().isEmpty() && !txtUrl.getText().isEmpty() && !txtDui.getText().isEmpty()
                    && !txtId.getText().isEmpty()) {
                ProveedorDAO pro = new ProveedorDAO(); //Se instancia la clase para buscar el id del proveedor.
                Proveedor prod = new Proveedor(); //Se instancia la clase para guardar los datos.
                prod.setNombreEmpresa(txtEmpresa.getText());
                prod.setNombreEncargado(txtEncargado.getText());
                prod.setDuiEncargado(txtDui.getText());
                prod.setTelefonoEncargado(txtTelefono.getText());
                prod.setUrlEncargado(txtUrl.getText());
                prod.setIdProveedor(Integer.parseInt(txtId.getText()));

                pro.update(prod);
                JOptionPane.showMessageDialog(null, "Dato modificado con Exito!");

                limpiar();
                llenarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Debe llenar todos los campos!!!");
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            if (!txtId.getText().isEmpty()) {
                ProveedorDAO pro = new ProveedorDAO();
                Proveedor prod = new Proveedor();
                prod.setIdProveedor(Integer.parseInt(txtId.getText()));

                pro.delete(prod);

                JOptionPane.showMessageDialog(null, "Dato borrado con Exito!");

                limpiar();
                llenarTabla();
            } else{
                JOptionPane.showMessageDialog(null, "Debe seleccionar un dato!");
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        frmMenuGerente menu = new frmMenuGerente();
        menu.show();
        this.hide();
    }//GEN-LAST:event_jMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(frmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtDui;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtEncargado;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUrl;
    // End of variables declaration//GEN-END:variables
}
