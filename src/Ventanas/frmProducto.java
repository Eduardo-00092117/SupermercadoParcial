/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Validar;
import Dao.EntidadesDAO.CategoriaProductoDAO;
import Dao.EntidadesDAO.MarcaDAO;
import Dao.EntidadesDAO.ProductoDAO;
import Entidades.CategoriaProducto;
import Entidades.Marca;
import Entidades.Producto;
import Entidades.Proveedor;
import Ventanas.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
     Validar validando =new Validar();
    public frmProducto() {
        initComponents();
        MarcaDAO marcaDao = new MarcaDAO();

        for (Marca marca : marcaDao.findAll()) {
            ComboBoxMarca.addItem(marca.getNombreMarca());
        }

        actualizarCombobox();

        llenarTabla();
        SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
        txtFechaCaducidad.setDateFormat(formateador);
        txtFechaIngreso.setDateFormat(formateador);
        txtId.setVisible(true);
        this.setTitle("Producto");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new java.awt.Color(245, 204, 196));

    }

    public void actualizarCombobox() {
        CategoriaProductoDAO catProDao = new CategoriaProductoDAO();
        for (CategoriaProducto catPro : catProDao.findAll()) {
            ComboBoxCategoriaProducto.addItem(catPro.getNombreCategoriaProducto());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        txtProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPrecioCompra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnCategoriaProducto = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtFechaCaducidad = new datechooser.beans.DateChooserCombo();
        txtFechaIngreso = new datechooser.beans.DateChooserCombo();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnRegresar = new javax.swing.JMenu();

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

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });
        txtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductoKeyTyped(evt);
            }
        });

        jLabel1.setText("Producto:");

        jLabel2.setText("Precio Compra:");

        txtPrecioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioCompraActionPerformed(evt);
            }
        });

        jLabel3.setText("Precio Venta:");

        txtPrecioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioVentaActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha Ingreso:");

        jLabel5.setText("Fecha Caducidad:");

        jLabel6.setText("Descripcion:");

        tableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idProducto", "Nombre", "Cantidad", "Precio de Compra", "Precio de Venta", "Fecha Ingreso", "Fecha de Caducidad", "Descripcion Producto", "Marca", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableProducto);
        if (tableProducto.getColumnModel().getColumnCount() > 0) {
            tableProducto.getColumnModel().getColumn(0).setMinWidth(0);
            tableProducto.getColumnModel().getColumn(0).setMaxWidth(0);
            tableProducto.getColumnModel().getColumn(3).setMinWidth(0);
            tableProducto.getColumnModel().getColumn(3).setMaxWidth(0);
            tableProducto.getColumnModel().getColumn(6).setMinWidth(0);
            tableProducto.getColumnModel().getColumn(6).setMaxWidth(0);
            tableProducto.getColumnModel().getColumn(7).setMinWidth(0);
            tableProducto.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        txtAreaDescripcion.setColumns(20);
        txtAreaDescripcion.setRows(5);
        jScrollPane3.setViewportView(txtAreaDescripcion);

        jLabel7.setText("Cantidad:");

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1434607676_system-software-update.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1434841655_f-cross_256.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1434608001_save_as-2.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel9.setText("Codigo:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        ComboBoxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));

        ComboBoxCategoriaProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));

        jLabel10.setText("Marca:");

        jLabel11.setText("Categoria:");

        btnCategoriaProducto.setText("...");
        btnCategoriaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaProductoActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1434664404_edit-clear.png"))); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtFechaCaducidad.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);

        txtFechaIngreso.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1434853539_go-back.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnRegresar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SpnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(17, 17, 17)
                        .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel9)))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnAgregar)
                                                .addGap(6, 6, 6)
                                                .addComponent(btnModificar)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEliminar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboBoxCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SpnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnAgregar)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnModificar)
                                                .addComponent(btnEliminar)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(txtFechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(ComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(btnCategoriaProducto))
                        .addGap(143, 143, 143)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            if (!txtId.getText().isEmpty() && !txtProducto.getText().isEmpty() && !txtPrecioCompra.getText().isEmpty()
                    && !txtAreaDescripcion.getText().isEmpty() && !txtPrecioVenta.getText().isEmpty()
                    && ComboBoxMarca.getSelectedIndex() > 0 && ComboBoxCategoriaProducto.getSelectedIndex() > 0
                    && Integer.parseInt(SpnCantidad.getValue().toString()) > 0) {
                // TODO add your handling code here:
                ProductoDAO proDao = new ProductoDAO();
                Producto producto = new Producto();
                MarcaDAO marcaDao = new MarcaDAO();
                CategoriaProductoDAO catProDao = new CategoriaProductoDAO();
                Marca marca = new Marca();
                CategoriaProducto catPro = new CategoriaProducto();
                producto.setIdProducto(txtId.getText());
                producto.setNombreProducto(txtProducto.getText());//De tipo STRING
                producto.setCantidadProducto(Integer.parseInt(SpnCantidad.getValue().toString()));//Convirtiendo el tipo objeto del spinner
                producto.setPrecioCompra(Double.parseDouble(txtPrecioCompra.getText().toString()));//Convirtiendo  
                producto.setPrecioVenta(Double.parseDouble(txtPrecioVenta.getText().toString()));//Convirtiendo 
                producto.setFechaIngresoProducto(txtFechaIngreso.getText());
                producto.setFechaCaducidadProducto(txtFechaCaducidad.getText());
                producto.setDescripcionProducto(txtAreaDescripcion.getText());
                marca.setNombreMarca(ComboBoxMarca.getSelectedItem().toString());
                catPro.setNombreCategoriaProducto(ComboBoxCategoriaProducto.getSelectedItem().toString());
                producto.setFK_idMarca(marcaDao.findByNombreMarca(marca).get(0).getIdMarca());
                producto.setFK_idCategoriaProducto(catProDao.findByNombreCategoriaProducto(catPro).get(0).getIdCategoriaProducto());
                proDao.insert(producto);
                JOptionPane.showMessageDialog(null, "Datos ingresado con exitos");
                limpiar();
                llenarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Debe completar todos los datos!!");
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            if (!txtId.getText().isEmpty() && !txtProducto.getText().isEmpty() && !txtPrecioCompra.getText().isEmpty()
                    && !txtAreaDescripcion.getText().isEmpty() && !txtPrecioVenta.getText().isEmpty()
                    && ComboBoxMarca.getSelectedIndex() > 0 && ComboBoxCategoriaProducto.getSelectedIndex() > 0
                    && Integer.parseInt(SpnCantidad.getValue().toString()) > 0) {
                // TODO add your handling code here:
                ProductoDAO proDao = new ProductoDAO();
                Producto producto = new Producto();
                CategoriaProducto catPro = new CategoriaProducto();
                MarcaDAO marcaDao = new MarcaDAO();
                CategoriaProductoDAO catProDao = new CategoriaProductoDAO();
                Marca marca = new Marca();
                producto.setIdProducto(txtId.getText());
                producto.setNombreProducto(txtProducto.getText());
                producto.setCantidadProducto(Integer.parseInt(SpnCantidad.getValue().toString()));//Convirtiendo el tipo objeto del spinner
                producto.setPrecioCompra(Double.parseDouble(txtPrecioCompra.getText().toString())); //Convirtiendo 
                producto.setPrecioVenta(Double.parseDouble(txtPrecioVenta.getText().toString()));
                producto.setFechaIngresoProducto(txtFechaIngreso.getText());
                producto.setFechaCaducidadProducto(txtFechaCaducidad.getText());
                producto.setDescripcionProducto(txtAreaDescripcion.getText());
                marca.setNombreMarca(ComboBoxMarca.getSelectedItem().toString());
                catPro.setNombreCategoriaProducto(ComboBoxCategoriaProducto.getSelectedItem().toString());
                producto.setFK_idMarca(marcaDao.findByNombreMarca(marca).get(0).getIdMarca());
                producto.setFK_idCategoriaProducto(catProDao.findByNombreCategoriaProducto(catPro).get(0).getIdCategoriaProducto());

                proDao.update(producto);
                JOptionPane.showMessageDialog(null, "Datos actualizados con exito");
                limpiar();
                llenarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Debe llenar todos los campos!!");
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            if (!txtProducto.getText().isEmpty()) {
                // TODO add your handling code here:
                ProductoDAO proDao = new ProductoDAO();
                Producto producto = new Producto();
                producto.setIdProducto(txtId.getText());
                proDao.delete(producto);
                JOptionPane.showMessageDialog(null, "Producto Eliminado");
                limpiar();
                llenarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un dato!");
            }
        } catch (Exception e) {

        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnCategoriaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaProductoActionPerformed
        // TODO add your handling code here:
        frmCategoriaProducto frm = new frmCategoriaProducto(null, true);
        frm.show();
    }//GEN-LAST:event_btnCategoriaProductoActionPerformed

    private void tableProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductoMouseClicked
        // TODO add your handling code here:
        String id = (String) tableProducto.getValueAt(tableProducto.getSelectedRow(), 0);
        String nombreProducto = (String) tableProducto.getValueAt(tableProducto.getSelectedRow(), 1);
        Integer cantidadProducto = (Integer) tableProducto.getValueAt(tableProducto.getSelectedRow(), 2);
        Double precioVenta = (Double) tableProducto.getValueAt(tableProducto.getSelectedRow(), 3);
        Double precioCompra = (Double) tableProducto.getValueAt(tableProducto.getSelectedRow(), 4);
        String fechaIngreso = (String) tableProducto.getValueAt(tableProducto.getSelectedRow(), 5);
        String fechaCaducidad = (String) tableProducto.getValueAt(tableProducto.getSelectedRow(), 6);
        String descripcionProducto = (String) tableProducto.getValueAt(tableProducto.getSelectedRow(), 7);
        String marca = (String) tableProducto.getValueAt(tableProducto.getSelectedRow(), 8);
        String categoria = (String) tableProducto.getValueAt(tableProducto.getSelectedRow(), 9);

        txtId.setText(id);
        txtProducto.setText(nombreProducto);
        SpnCantidad.setValue(cantidadProducto);
        txtPrecioVenta.setText(Double.toString(precioVenta));
        txtPrecioCompra.setText(Double.toString(precioCompra));
        txtFechaIngreso.setText(fechaIngreso);
        txtFechaCaducidad.setText(fechaCaducidad);
        txtAreaDescripcion.setText(descripcionProducto);
        ComboBoxMarca.setSelectedItem(marca);
        ComboBoxCategoriaProducto.setSelectedItem(categoria);
    }//GEN-LAST:event_tableProductoMouseClicked

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        // TODO add your handling code here:
        frmMenuGerente frm = new frmMenuGerente();
        frm.show();
        this.hide();
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void txtPrecioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioCompraActionPerformed

    private void txtPrecioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioVentaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoKeyTyped
        // TODO add your handling code here:
        validando.soloLetras(evt);
    }//GEN-LAST:event_txtProductoKeyTyped

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
        validando.soloNumeros(evt);
    }//GEN-LAST:event_txtIdKeyTyped
    public void limpiar() {
        txtProducto.setText("");
        txtPrecioVenta.setText("");
        txtPrecioCompra.setText("");
        txtAreaDescripcion.setText("");
        SpnCantidad.setValue(0);
        ComboBoxMarca.setSelectedIndex(0);
        ComboBoxCategoriaProducto.setSelectedIndex(0);
        txtId.setText("");
    }

    public void llenarTabla() {
        //Se ocupa para borrar los datos de la tabla.
        DefaultTableModel modelos = (DefaultTableModel) tableProducto.getModel();
        while (modelos.getRowCount() > 0) {
            modelos.removeRow(0);
        }
        MarcaDAO marcaDao = new MarcaDAO();
        CategoriaProductoDAO catProDao = new CategoriaProductoDAO();
        ProductoDAO proDao = new ProductoDAO();
        Marca marca = new Marca();
        CategoriaProducto catPro = new CategoriaProducto();

        for (Producto producto : proDao.findAll()) {
            DefaultTableModel modelo = (DefaultTableModel) tableProducto.getModel();
            modelo.addRow(new Object[10]);
            int nuevaFila = modelo.getRowCount() - 1;
            tableProducto.setValueAt(producto.getIdProducto(), nuevaFila, 0);
            tableProducto.setValueAt(producto.getNombreProducto(), nuevaFila, 1);
            tableProducto.setValueAt(producto.getCantidadProducto(), nuevaFila, 2);
            tableProducto.setValueAt(producto.getPrecioCompra(), nuevaFila, 3);
            tableProducto.setValueAt(producto.getPrecioVenta(), nuevaFila, 4);
            tableProducto.setValueAt(producto.getFechaCaducidadProducto(), nuevaFila, 5);
            tableProducto.setValueAt(producto.getFechaCaducidadProducto(), nuevaFila, 6);
            tableProducto.setValueAt(producto.getDescripcionProducto(), nuevaFila, 7);
            marca.setIdMarca(producto.getFK_idMarca());
            tableProducto.setValueAt(marcaDao.findBy(marca, "idMarca").get(0).getNombreMarca(), nuevaFila, 8);//PARA FK ID MARCA
            catPro.setIdCategoriaProducto(producto.getFK_idCategoriaProducto());
            tableProducto.setValueAt(catProDao.findBy(catPro, "idCategoriaProducto").get(0).getNombreCategoriaProducto(), nuevaFila, 9);
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
    public javax.swing.JComboBox<String> ComboBoxCategoriaProducto;
    private javax.swing.JComboBox<String> ComboBoxMarca;
    private javax.swing.JSpinner SpnCantidad;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCategoriaProducto;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JMenu btnRegresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tableProducto;
    private javax.swing.JTextArea txtAreaDescripcion;
    private datechooser.beans.DateChooserCombo txtFechaCaducidad;
    private datechooser.beans.DateChooserCombo txtFechaIngreso;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
