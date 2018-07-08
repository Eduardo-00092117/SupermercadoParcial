/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Correo;
import Dao.EntidadesDAO.CargoDAO;
import Dao.EntidadesDAO.EmpleadoDAO;
import Dao.EntidadesDAO.EstadoEmpleadoDAO;
import Dao.EntidadesDAO.UsuarioDAO;
import Clases.Encriptacion;
import Entidades.Cargo;
import Entidades.Empleado;
import Entidades.EstadoEmpleado;
import Entidades.Usuario;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduardo Alberto López Torres <Carnet: 00092117>
 */
public class frmEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form frmUsuario
     */
    public frmEmpleado() {
        initComponents();
        this.setTitle("Empleado");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new java.awt.Color(245, 204, 196));
        CargoDAO car = new CargoDAO();
        for (Cargo cargo : car.findAll()) {
            cmbCargo.addItem(cargo.getNombreCargo());
        }
        EstadoEmpleadoDAO esta = new EstadoEmpleadoDAO();
        for (EstadoEmpleado estado : esta.findAll()) {
            cmbEstado.addItem(estado.getEstado());
        }
        SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
        txtFecha.setDateFormat(formateador);
        llenarTabla();
        txtId.setVisible(false);
        panelUsuario1.setVisible(false);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFecha = new datechooser.beans.DateChooserCombo();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDui = new javax.swing.JFormattedTextField();
        txtCorreo = new javax.swing.JTextField();
        txtNit = new javax.swing.JFormattedTextField();
        cmbCargo = new javax.swing.JComboBox<>();
        cmbEstado = new javax.swing.JComboBox<>();
        txtSueldo = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        panelUsuario1 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnEliminar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleado"));

        jLabel1.setText("Nombres:");

        jLabel2.setText("apellidos:");

        jLabel3.setText("Fecha de nacimiento:");

        jLabel4.setText("DUI:");

        jLabel5.setText("NIT:");

        jLabel6.setText("Sueldo:");

        jLabel7.setText("Correo:");

        jLabel8.setText("Estado:");

        jLabel9.setText("Cargo:");

        txtFecha.setBehavior(datechooser.model.multiple.MultyModelBehavior.SELECT_SINGLE);

        try {
            txtDui.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorreoKeyPressed(evt);
            }
        });

        try {
            txtNit.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-######-###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));
        cmbCargo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCargoItemStateChanged(evt);
            }
        });

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNit)
                        .addGap(258, 258, 258))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSueldo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)))
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1434608001_save_as-2.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1434607676_system-software-update.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1434664404_edit-clear.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellido", "Fecha de nacimiento", "DUI", "NIT", "Correo", "Sueldo", "Estado", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false, false
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
        jScrollPane2.setViewportView(tblTabla);
        if (tblTabla.getColumnModel().getColumnCount() > 0) {
            tblTabla.getColumnModel().getColumn(0).setMinWidth(0);
            tblTabla.getColumnModel().getColumn(0).setMaxWidth(0);
            tblTabla.getColumnModel().getColumn(8).setResizable(false);
            tblTabla.getColumnModel().getColumn(9).setResizable(false);
        }

        panelUsuario1.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuario"));

        txtUsuario.setFocusable(false);

        jLabel12.setText("Usuario: ");

        jLabel13.setText("Contraseña: ");

        javax.swing.GroupLayout panelUsuario1Layout = new javax.swing.GroupLayout(panelUsuario1);
        panelUsuario1.setLayout(panelUsuario1Layout);
        panelUsuario1Layout.setHorizontalGroup(
            panelUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuario1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(panelUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUsuario1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuario1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        panelUsuario1Layout.setVerticalGroup(
            panelUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuario1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(panelUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(20, 20, 20)
                .addGroup(panelUsuario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1434841655_f-cross_256.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1434853539_go-back.png"))); // NOI18N
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addGap(3, 3, 3)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar)
                        .addGap(236, 236, 236))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            if (!txtNombre.getText().isEmpty() && !txtApellido.getText().isEmpty() && !txtCorreo.getText().isEmpty()
                    && txtDui.getText().length() > 5 && txtNit.getText().length() > 5 && cmbCargo.getSelectedIndex() > 0
                    && cmbEstado.getSelectedIndex() > 0 && !txtSueldo.getText().isEmpty()) {
                Correo correo = new Correo();
                EmpleadoDAO emp = new EmpleadoDAO();
                Empleado empd = new Empleado();
                Usuario used = new Usuario();
                UsuarioDAO use = new UsuarioDAO();
                empd.setNombreEmpleado(txtNombre.getText());
                empd.setApellidoEmpleado(txtApellido.getText());
                empd.setFechaEmpleado(txtFecha.getText());
                empd.setCorreoEmpleado(txtCorreo.getText());
                empd.setDuiEmpleado(txtDui.getText());
                empd.setNitEmpleado(txtNit.getText());
                empd.setSueldoEmpleado(Double.parseDouble(txtSueldo.getText()));
                CargoDAO car = new CargoDAO();
                Cargo card = new Cargo();
                EstadoEmpleadoDAO esta = new EstadoEmpleadoDAO();
                EstadoEmpleado estad = new EstadoEmpleado();
                card.setNombreCargo(cmbCargo.getSelectedItem().toString());
                estad.setEstado(cmbEstado.getSelectedItem().toString());
                empd.setFk_idCargo(car.findBy(card, "cargo").get(0).getIdCargo());
                empd.setFk_idEstado(esta.findBy(estad, "estado").get(0).getIdEstado());

                if (car.findBy(card, "cargo").get(0).isAccesso()) {
                    used.setUsuario(txtUsuario.getText());
                    used.setPass(Encriptacion.encriptar(txtPass.getText()));
                    correo.SendMail("Bienvenido a nuestra comunidad, se te brindara a continuacion su usuario y contraseña:"
                            + "\n\nUsuario: " + txtUsuario.getText() + "\nContraseña: " + txtPass.getText(), txtCorreo.getText(), "Bienvenido a la empresa!!!!!");
                    emp.insert(empd);
                    use.insert(used);
                } else {
                    emp.insert(empd);
                }
                JOptionPane.showMessageDialog(null, "Dato ingresado con exito!");
                limpiar();
                llenarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Debe llenar todos los campos!");
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            if (!txtNombre.getText().isEmpty() && !txtApellido.getText().isEmpty() && !txtCorreo.getText().isEmpty()
                    && txtDui.getText().length() > 5 && txtNit.getText().length() > 5 && cmbCargo.getSelectedIndex() > 0
                    && cmbEstado.getSelectedIndex() > 0 && !txtSueldo.getText().isEmpty() && !txtId.getText().isEmpty()) {
                EmpleadoDAO emp = new EmpleadoDAO();
                Empleado empd = new Empleado();
                empd.setNombreEmpleado(txtNombre.getText());
                empd.setIdEmpleado(Integer.parseInt(txtId.getText()));
                empd.setApellidoEmpleado(txtApellido.getText());
                empd.setFechaEmpleado(txtFecha.getText());
                empd.setCorreoEmpleado(txtCorreo.getText());
                empd.setDuiEmpleado(txtDui.getText());
                empd.setNitEmpleado(txtNit.getText());
                empd.setSueldoEmpleado(Double.parseDouble(txtSueldo.getText()));
                CargoDAO car = new CargoDAO();
                Cargo card = new Cargo();
                EstadoEmpleadoDAO esta = new EstadoEmpleadoDAO();
                EstadoEmpleado estad = new EstadoEmpleado();
                card.setNombreCargo(cmbCargo.getSelectedItem().toString());
                estad.setEstado(cmbEstado.getSelectedItem().toString());
                empd.setFk_idCargo(car.findBy(card, "cargo").get(0).getIdCargo());
                empd.setFk_idEstado(esta.findBy(estad, "estado").get(0).getIdEstado());
                emp.update(empd);
                JOptionPane.showMessageDialog(null, "Dato modificado con exito!");
                limpiar();
                llenarTabla();
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tblTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaMouseClicked
        Integer id = (Integer) tblTabla.getValueAt(tblTabla.getSelectedRow(), 0);
        String nombre = (String) tblTabla.getValueAt(tblTabla.getSelectedRow(), 1);
        String apellido = (String) tblTabla.getValueAt(tblTabla.getSelectedRow(), 2);
        String fecha = (String) tblTabla.getValueAt(tblTabla.getSelectedRow(), 3);
        String dui = (String) tblTabla.getValueAt(tblTabla.getSelectedRow(), 4);
        String nit = (String) tblTabla.getValueAt(tblTabla.getSelectedRow(), 5);
        String correo = (String) tblTabla.getValueAt(tblTabla.getSelectedRow(), 6);
        Double sueldo = (Double) tblTabla.getValueAt(tblTabla.getSelectedRow(), 7);
        String estado = (String) tblTabla.getValueAt(tblTabla.getSelectedRow(), 8);
        String cargo = (String) tblTabla.getValueAt(tblTabla.getSelectedRow(), 9);
        txtId.setText(Integer.toString(id));
        txtNombre.setText(nombre);
        txtApellido.setText(apellido);
        txtCorreo.setText(correo);
        txtNit.setText(nit);
        txtDui.setText(dui);
        txtSueldo.setText(String.valueOf(sueldo));
        cmbEstado.setSelectedItem(estado);
        cmbCargo.setSelectedItem(cargo);
        txtFecha.setText(fecha);
        panelUsuario1.setVisible(false);
    }//GEN-LAST:event_tblTablaMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyPressed
        txtUsuario.setText(txtCorreo.getText());
        boolean bandera = true;
        for (int i = 0; i < txtCorreo.getText().length(); i++) {
            if (txtCorreo.getText().charAt(i) == '@') {
                bandera = false;
            }
        }
        if (bandera) {
            txtUsuario.setText(txtCorreo.getText());
            txtPass.setText(txtCorreo.getText());
        }
    }//GEN-LAST:event_txtCorreoKeyPressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            if (!txtId.getText().isEmpty()) {
                EmpleadoDAO emp = new EmpleadoDAO();
                Empleado empd = new Empleado();
                empd.setIdEmpleado(Integer.parseInt(txtId.getText()));
                emp.delete(empd);
                JOptionPane.showMessageDialog(null, "Dato eliminado con exito!");
                limpiar();
                llenarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un dato!");
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        frmMenuGerente frm = new frmMenuGerente();
        frm.show();
        this.hide();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void cmbCargoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCargoItemStateChanged
        if (cmbCargo.getSelectedIndex() > 0) {
            CargoDAO cargo = new CargoDAO();
            Cargo cargad = new Cargo();
            cargad.setNombreCargo(cmbCargo.getSelectedItem().toString());
            if (cargo.findBy(cargad, "cargo").get(0).isAccesso()) {
                panelUsuario1.setVisible(true);
            } else {
                panelUsuario1.setVisible(false);
            }
        }
    }//GEN-LAST:event_cmbCargoItemStateChanged

    public void limpiar() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtDui.setText("");
        txtNit.setText("");
        txtCorreo.setText("");
        cmbCargo.setSelectedIndex(0);
        cmbEstado.setSelectedIndex(0);
        txtSueldo.setText("");
        try {
            txtPass.setText("");
            txtUsuario.setText("");
        } catch (Exception e) {

        }
        panelUsuario1.setVisible(false);
    }

    public void llenarTabla() {
        //Se ocupa para borrar los datos de la tabla.
        DefaultTableModel modelos = (DefaultTableModel) tblTabla.getModel();
        while (modelos.getRowCount() > 0) {
            modelos.removeRow(0);
        }

        //Se comienza a llenar la tabla.
        EmpleadoDAO emp = new EmpleadoDAO();
        CargoDAO marc = new CargoDAO();
        EstadoEmpleadoDAO esta = new EstadoEmpleadoDAO();
        Cargo car = new Cargo();
        EstadoEmpleado est = new EstadoEmpleado();
        for (Empleado empleado : emp.findAll()) {
            DefaultTableModel modelo = (DefaultTableModel) tblTabla.getModel();
            modelo.addRow(new Object[11]);
            int nuevaFila = modelo.getRowCount() - 1;
            tblTabla.setValueAt(empleado.getIdEmpleado(), nuevaFila, 0);
            tblTabla.setValueAt(empleado.getNombreEmpleado(), nuevaFila, 1);
            tblTabla.setValueAt(empleado.getApellidoEmpleado(), nuevaFila, 2);
            tblTabla.setValueAt(empleado.getFechaEmpleado(), nuevaFila, 3);
            tblTabla.setValueAt(empleado.getDuiEmpleado(), nuevaFila, 4);
            tblTabla.setValueAt(empleado.getNitEmpleado(), nuevaFila, 5);
            tblTabla.setValueAt(empleado.getCorreoEmpleado(), nuevaFila, 6);
            car.setIdCargo(empleado.getFk_idCargo());
            est.setIdEstado(empleado.getFk_idEstado());
            tblTabla.setValueAt(empleado.getSueldoEmpleado(), nuevaFila, 7);
            tblTabla.setValueAt(esta.findBy(est, "idEstadoEmpleado").get(0).getEstado(), nuevaFila, 8);
            tblTabla.setValueAt(marc.findBy(car, "idCargo").get(0).getNombreCargo(), nuevaFila, 9);
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
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelUsuario1;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JFormattedTextField txtDui;
    private datechooser.beans.DateChooserCombo txtFecha;
    private javax.swing.JTextField txtId;
    private javax.swing.JFormattedTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
