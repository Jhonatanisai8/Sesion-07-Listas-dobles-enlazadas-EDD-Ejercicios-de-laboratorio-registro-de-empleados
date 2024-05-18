package org.Jhonatann.Ejercicios.app.EjercicioPropuesto;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jhonatan
 */
public class frmRegistroPersonal extends javax.swing.JFrame {

    DefaultTableModel modelo;
    String[] cabezera = {
        "Nº", "NOMBRE", "APP PATERNO", "APP MATERNO", "SLD. BASE", "VENTAS REA", "ESTD. CIVIL", "Nº HIJOS", "COM. VENTAS", "DESC. SEG", "DESC. IMPUSTOS", "SUEL. NETO"};
    String data[][] = {};

    ListaEmpleados listaEmpleados = new ListaEmpleados();

    public frmRegistroPersonal() {
        initComponents();
        this.setTitle("Bienvenido al sistema");
        modelo = new DefaultTableModel(data, cabezera);
        tblDatos.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbxEstadoCivil = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtAppPaterno = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtAppMaterno = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtSueldoBase = new javax.swing.JTextField();
        txtVentasRealizadas = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtNumHijos = new javax.swing.JTextField();
        lblHijos = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtSueldoNeto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnAtrasAdelante = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnAdelanteAtras = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMontoTotalSueldo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMontoTotalComiones = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMontoTotalImpuestos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMontoTotalSeguros = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Personal");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resgistro de datos:"));

        jLabel6.setFont(new java.awt.Font("Calisto MT", 1, 15)); // NOI18N
        jLabel6.setText("Nombres");

        txtNombres.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 15)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Calisto MT", 1, 15)); // NOI18N
        jLabel11.setText("Estado Civil:");

        cbxEstadoCivil.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 15)); // NOI18N
        cbxEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoCivilActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Calisto MT", 1, 15)); // NOI18N
        jLabel14.setText("Apellido Paterno:");

        txtAppPaterno.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 15)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Calisto MT", 1, 15)); // NOI18N
        jLabel15.setText("Apellido Materno:");

        txtAppMaterno.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 15)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Calisto MT", 1, 15)); // NOI18N
        jLabel16.setText("Sueldo Base:");

        txtSueldoBase.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 15)); // NOI18N

        txtVentasRealizadas.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 15)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Calisto MT", 1, 15)); // NOI18N
        jLabel17.setText("Ventas Realizadas:");

        txtNumHijos.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 15)); // NOI18N
        txtNumHijos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumHijosActionPerformed(evt);
            }
        });

        lblHijos.setFont(new java.awt.Font("Calisto MT", 1, 15)); // NOI18N
        lblHijos.setText("Nº de Hijos:");

        jLabel19.setFont(new java.awt.Font("Calisto MT", 1, 15)); // NOI18N
        jLabel19.setText("Sueldo Neto:");

        txtSueldoNeto.setEditable(false);
        txtSueldoNeto.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 15)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAppPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAppMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSueldoBase, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxEstadoCivil, 0, 278, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVentasRealizadas, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblHijos, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumHijos, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSueldoNeto, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)))
                .addGap(91, 91, 91))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtNombres)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtAppPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(txtAppMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSueldoBase, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(txtSueldoNeto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(txtNumHijos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtVentasRealizadas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de empleados:"));

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº", "NOMBRE", "APELLIDO PATERNO", "APELLIDO MATERNO", "SUELDO BASE", "VENTAS REALIZADAS", "ESTADO CIVIL", "NUMERO DE HIJOS", "CM.VENTAS", "DESC. SEG", "DESC. IMP", "SLD. NETO"
            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnAtrasAdelante.setText("Atras-Adelate");
        btnAtrasAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasAdelanteActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnAdelanteAtras.setText("Adelante-Atras");
        btnAdelanteAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdelanteAtrasActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdelanteAtras, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtrasAdelante, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addGap(70, 70, 70))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdelanteAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtrasAdelante))
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("SimSun", 1, 15)); // NOI18N
        jLabel2.setText("Monto total por sueldos: ");

        txtMontoTotalSueldo.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N

        jLabel3.setFont(new java.awt.Font("SimSun", 1, 15)); // NOI18N
        jLabel3.setText("Monto total por comsiones: ");

        txtMontoTotalComiones.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N

        jLabel4.setFont(new java.awt.Font("SimSun", 1, 15)); // NOI18N
        jLabel4.setText("Monto total desc. Impuestos:");

        txtMontoTotalImpuestos.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N

        jLabel5.setFont(new java.awt.Font("SimSun", 1, 15)); // NOI18N
        jLabel5.setText("Monto total desc. Seguro:");

        txtMontoTotalSeguros.setFont(new java.awt.Font("Segoe UI Black", 1, 15)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMontoTotalComiones, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(txtMontoTotalSueldo))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMontoTotalImpuestos)
                    .addComponent(txtMontoTotalSeguros, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMontoTotalSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMontoTotalImpuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMontoTotalComiones, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMontoTotalSeguros, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombre;
        String appPaterno;
        String appMaterno;
        float sueldoBase;
        int ventaRealizadas;
        String estadoCivil;
        int numHijos;
        //float sueldoNeto;

        //capturamos los datos
        nombre = txtNombres.getText();
        appPaterno = txtAppPaterno.getText();
        appMaterno = txtAppMaterno.getText();
        sueldoBase = Float.parseFloat(txtSueldoBase.getText());
        ventaRealizadas = Integer.parseInt(txtVentasRealizadas.getText());
        estadoCivil = cbxEstadoCivil.getSelectedItem().toString();
        if (cbxEstadoCivil.getSelectedItem().toString().equalsIgnoreCase("Casado")) {
            numHijos = Integer.parseInt(txtNumHijos.getText());
            Empleado empleado = new Empleado(nombre, appPaterno, appMaterno, sueldoBase, ventaRealizadas, estadoCivil, numHijos);
            listaEmpleados.insertarFinal(empleado);
            listaEmpleados.verDatosTabla(1, modelo, tblDatos);
            limpiarCampos();
            // txtSueldoNeto.setText("S/. " + empleado.calcularSueldoNeto() + "");
        } else {
            Empleado empleado = new Empleado(nombre, appPaterno, appMaterno, sueldoBase, ventaRealizadas, estadoCivil, 0);
            listaEmpleados.insertarFinal(empleado);
            listaEmpleados.verDatosTabla(1, modelo, tblDatos);
            listaEmpleados.montoTotalPorSueldos(txtMontoTotalSueldo);
            limpiarCampos();
            //   txtSueldoNeto.setText("S/. " + empleado.calcularSueldoNeto() + "");
        }

        //llamamos a los metodos para conocer los montos totales
        listaEmpleados.montoTotalPorSueldos(txtMontoTotalSueldo);
        listaEmpleados.montoTotalPorComsiones(txtMontoTotalComiones);
        listaEmpleados.montoTotalPorDescuentoImpuesto(txtMontoTotalImpuestos);
        listaEmpleados.montoTotalPorDescuentoSeguro(txtMontoTotalSeguros);

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cbxEstadoCivil.addItem("Casado");
        cbxEstadoCivil.addItem("Soltero");
        activar("Casado");
    }//GEN-LAST:event_formWindowOpened

    private void txtNumHijosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumHijosActionPerformed
    }//GEN-LAST:event_txtNumHijosActionPerformed

    private void cbxEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoCivilActionPerformed
        activar(cbxEstadoCivil.getSelectedItem().toString());
    }//GEN-LAST:event_cbxEstadoCivilActionPerformed

    private void btnAdelanteAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelanteAtrasActionPerformed
        listaEmpleados.verDatosTabla(1, modelo, tblDatos);
    }//GEN-LAST:event_btnAdelanteAtrasActionPerformed

    private void btnAtrasAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasAdelanteActionPerformed
        listaEmpleados.verDatosTabla(2, modelo, tblDatos);
    }//GEN-LAST:event_btnAtrasAdelanteActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        if (txtNombres.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por favor ingresar el nombre a buscar", "ATENCIÓN", 3);
        } else {
            listaEmpleados.buscarInformacion(txtNombres, txtAppPaterno, txtAppMaterno, txtVentasRealizadas,
                    txtSueldoBase, cbxEstadoCivil, txtNumHijos, txtSueldoNeto);
        }

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String nombre;
        String appPaterno;
        String appMaterno;
        float sueldoBase;
        int ventaRealizadas;
        String estadoCivil;
        int numHijos;
        //capturamos los datos
        nombre = txtNombres.getText();
        appPaterno = txtAppPaterno.getText();
        appMaterno = txtAppMaterno.getText();
        sueldoBase = Float.parseFloat(txtSueldoBase.getText());
        ventaRealizadas = Integer.parseInt(txtVentasRealizadas.getText());
        estadoCivil = cbxEstadoCivil.getSelectedItem().toString();
        if (cbxEstadoCivil.getSelectedItem().toString().equalsIgnoreCase("Casado")) {

            numHijos = Integer.parseInt(txtNumHijos.getText());
            listaEmpleados.modificarDatos(nombre, appPaterno, appMaterno, sueldoBase, ventaRealizadas, estadoCivil, numHijos);
            listaEmpleados.verDatosTabla(1, modelo, tblDatos);
            limpiarCampos();

        } else {

            listaEmpleados.modificarDatos(nombre, appPaterno, appMaterno, sueldoBase, ventaRealizadas, estadoCivil, 0);
            listaEmpleados.verDatosTabla(1, modelo, tblDatos);
            listaEmpleados.montoTotalPorSueldos(txtMontoTotalSueldo);
            limpiarCampos();

        }
        //llamamos a los metodos para conocer los montos totales
        listaEmpleados.montoTotalPorSueldos(txtMontoTotalSueldo);
        listaEmpleados.montoTotalPorComsiones(txtMontoTotalComiones);
        listaEmpleados.montoTotalPorDescuentoImpuesto(txtMontoTotalImpuestos);
        listaEmpleados.montoTotalPorDescuentoSeguro(txtMontoTotalSeguros);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (listaEmpleados.estaVacia()) {
            JOptionPane.showMessageDialog(rootPane, "Lista vacia", "ATENCION", 3);
        } else {
            if (txtNombres.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Por favor ingrese el nombre a eliminar", "ATENCION", 3);
            } else {
                String nombre;
                nombre = txtNombres.getText();
                if (listaEmpleados.eliminarNodoEspecifico(nombre)) {
                    JOptionPane.showMessageDialog(rootPane, "Empleado ELIMINADO", "ATENCION", 3);
                    listaEmpleados.verDatosTabla(1, modelo, tblDatos);
                    limpiarCampos();
                    //llamamos a los metodos para conocer los montos totales
                    listaEmpleados.montoTotalPorSueldos(txtMontoTotalSueldo);
                    listaEmpleados.montoTotalPorComsiones(txtMontoTotalComiones);
                    listaEmpleados.montoTotalPorDescuentoImpuesto(txtMontoTotalImpuestos);
                    listaEmpleados.montoTotalPorDescuentoSeguro(txtMontoTotalSeguros);
                } else {
                    //llamamos a los metodos para conocer los montos totales
                    listaEmpleados.montoTotalPorSueldos(txtMontoTotalSueldo);
                    listaEmpleados.montoTotalPorComsiones(txtMontoTotalComiones);
                    listaEmpleados.montoTotalPorDescuentoImpuesto(txtMontoTotalImpuestos);
                    listaEmpleados.montoTotalPorDescuentoSeguro(txtMontoTotalSeguros);
                    JOptionPane.showMessageDialog(rootPane, "Empleado NO ENCONTRADO", "ATENCION", 3);
                }
            }
        }

    }//GEN-LAST:event_btnEliminarActionPerformed
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
            java.util.logging.Logger.getLogger(frmRegistroPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistroPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistroPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistroPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistroPersonal().setVisible(true);
            }
        });
    }

    public void activar(String valor) {
        if (valor.equalsIgnoreCase("Casado")) {
            txtNumHijos.setVisible(true);
            lblHijos.setVisible(true);
        } else {
            txtNumHijos.setVisible(false);
            lblHijos.setVisible(false);
        }
    }

    public void limpiarCampos() {
        String t = "";
        txtAppMaterno.setText(t);
        txtAppPaterno.setText(t);
        txtNombres.setText(t);
        txtNumHijos.setText(t);
        txtSueldoBase.setText(t);
        txtVentasRealizadas.setText(t);
        cbxEstadoCivil.setSelectedIndex(0);
        txtNombres.requestFocus();
        txtSueldoNeto.setText(t);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAdelanteAtras;
    private javax.swing.JButton btnAtrasAdelante;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxEstadoCivil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHijos;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtAppMaterno;
    private javax.swing.JTextField txtAppPaterno;
    private javax.swing.JTextField txtMontoTotalComiones;
    private javax.swing.JTextField txtMontoTotalImpuestos;
    private javax.swing.JTextField txtMontoTotalSeguros;
    private javax.swing.JTextField txtMontoTotalSueldo;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumHijos;
    private javax.swing.JTextField txtSueldoBase;
    private javax.swing.JTextField txtSueldoNeto;
    private javax.swing.JTextField txtVentasRealizadas;
    // End of variables declaration//GEN-END:variables
}
