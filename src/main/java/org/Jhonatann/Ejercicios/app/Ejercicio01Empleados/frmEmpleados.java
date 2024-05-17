package org.Jhonatann.Ejercicios.app.Ejercicio01Empleados;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jhonatan
 */
public class frmEmpleados extends javax.swing.JFrame {

    //declaramos el formato de las tablas
    DefaultTableModel miModelo;
    String[] cabezera = {"Nº", "Codigo", "Nombres", "Apellidos", "Sexo", "Sueldo"};
    String[][] data = {};

    public class Nodo {

        String codigo;
        String nombre;
        String apellidos;
        String sexo;
        float sueldo;
        Nodo sig;
        Nodo ant;

        public Nodo(String codigo, String nombre, String apellidos, String sexo, float sueldo) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.sexo = sexo;
            this.sueldo = sueldo;
            sig = ant = null;
        }
    }
    //declaracion de variables locales
    public Nodo ini, fin;
    public Nodo pFound;
    int num = 0;

    public frmEmpleados() {
        initComponents();
        this.setTitle("Bienvenido al sistema");
        ini = fin = pFound = null;
        miModelo = new DefaultTableModel(data, cabezera);
        tblDatos.setModel(miModelo);
    }

    Nodo buscar(Nodo inicio, String codigo) {
        Nodo pos = inicio;
        while (pos != null && !codigo.equalsIgnoreCase(pos.codigo)) {
            pos = pos.sig;
        }
        return pos;
    }

    Nodo insertarFinal(Nodo inicio, String cod, String nombre, String apelli, String sexo, float suel) {
        Nodo nuevo = new Nodo(cod, nombre, apelli, sexo, suel);
        nuevo.sig = inicio;
        if (inicio == null) {
            fin = nuevo;
            fin.sig = null;
        }
        if (inicio != null) {
            inicio.ant = nuevo;
        }
        inicio = nuevo;
        return inicio;
    }

    //metodo ver resumen
    void resumen() {
        Nodo aux = ini;
        String nom = "", acum = "";
        float suma = 0, mayor = -9999;
        float s;

        while (aux != null) {
            s = aux.sueldo;
            if (s > mayor) {
                mayor = s;
                nom = aux.nombre + " " + aux.apellidos;
            }
            suma = suma + s;
            aux = aux.sig;
        }
        //colocando la informacion en los objetos 
        txtEmpleadoMayorSueldo.setText(nom);
        //dandole formato al acumulado
        DecimalFormat df2 = new DecimalFormat("####.00");
        acum = df2.format(suma);
        txtMontoSueldoAcumulado.setText(acum);
    }

    void habilitar() {
        btnActualiza.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(false);
    }

    void desabilitar() {
        btnActualiza.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
    }

    void limpiarCampos() {
        String m = "";
        txtApellidos.setText(m);
        txtCodigo.setText(m);
        txtNombre.setText(m);
        txtSueldo.setText(m);
        txtCodigo.requestFocus();
        cbxSexo.setSelectedIndex(0);
    }

    void vaciarTabla() {
        //obtenemos el numero de filas de las tablas
        int filas = tblDatos.getRowCount();
        for (int i = 0; i < filas; i++) {
            miModelo.removeRow(0);
        }
    }

    void verDatos(int ind) {
        //variables para recorrer la lista
        String cod, nom, ape, se, su;
        float s;
        switch (ind) {
            case 1: {
                vaciarTabla();
                Nodo aux = ini;
                num = 0;
                while (aux != null) {
                    cod = aux.codigo;
                    nom = aux.nombre;
                    ape = aux.apellidos;
                    se = aux.sexo;

                    //dando un formato al sueldo
                    DecimalFormat df2 = new DecimalFormat("####.00");
                    su = df2.format(aux.sueldo);
                    num++;
                    Object[] fila = {num, cod, nom, ape, se, su};
                    miModelo.addRow(fila);
                    aux = aux.sig;
                }
            }
            break;
            case 2: {
                vaciarTabla();
                Nodo aux = fin;
                num = 0;
                while (aux != null) {
                    cod = aux.codigo;
                    nom = aux.nombre;
                    ape = aux.apellidos;
                    se = aux.sexo;
                    //le damos formato al sueldo
                    DecimalFormat df2 = new DecimalFormat("####.00");
                    su = df2.format(aux.sueldo);
                    num++;
                    Object fila[] = {num, cod, nom, ape, se, su};
                    miModelo.addRow(fila);
                    aux = aux.ant;
                }
                break;
            }
        }
    }

    void eliminar() {
        Nodo actual;
        boolean encontrado = false;
        actual = ini;
        while ((actual != null) && (!encontrado)) {
            encontrado = actual.codigo.equalsIgnoreCase(txtCodigo.getText().trim());
            if (!encontrado) {
                actual = actual.sig;
            }
        }

        //realizando los enlaces
        if (actual != null) {
            if (actual == ini) {
                ini = actual.sig;
                if (encontrado) {
                    actual.sig.ant = null;
                }
            } else if (actual.sig != null) {
                actual.ant.sig = actual.sig;
                actual.sig.ant = actual.ant;
            } else {
                actual.ant.sig = null;
                fin = actual.ant;
            }
            actual = null;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbxSexo = new javax.swing.JComboBox<>();
        txtSueldo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnAdelanteAtras = new javax.swing.JButton();
        btnActualiza = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAtrasAdelante = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtEmpleadoMayorSueldo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMontoSueldoAcumulado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Empleados");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("SimHei", 0, 15)); // NOI18N
        jLabel2.setText("Codigo:");

        txtCodigo.setFont(new java.awt.Font("Rod", 0, 15)); // NOI18N

        jLabel3.setFont(new java.awt.Font("SimHei", 0, 15)); // NOI18N
        jLabel3.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Rod", 0, 15)); // NOI18N

        jLabel4.setFont(new java.awt.Font("SimHei", 0, 15)); // NOI18N
        jLabel4.setText("Apellidos:");

        txtApellidos.setFont(new java.awt.Font("Rod", 0, 15)); // NOI18N

        jLabel5.setFont(new java.awt.Font("SimHei", 0, 15)); // NOI18N
        jLabel5.setText("Sexo:");

        cbxSexo.setFont(new java.awt.Font("Rod", 0, 15)); // NOI18N
        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=Seleccionar=", "Masculino", "Femenino" }));

        txtSueldo.setFont(new java.awt.Font("Rod", 0, 15)); // NOI18N

        jLabel6.setFont(new java.awt.Font("SimHei", 0, 15)); // NOI18N
        jLabel6.setText("Sueldo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSueldo, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSexo, 0, 178, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(cbxSexo, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtSueldo)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        btnGuardar.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 15)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 15)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnAdelanteAtras.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 15)); // NOI18N
        btnAdelanteAtras.setText("Adelante-Atras");
        btnAdelanteAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdelanteAtrasActionPerformed(evt);
            }
        });

        btnActualiza.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 15)); // NOI18N
        btnActualiza.setText("Actualizar");
        btnActualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizaActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 15)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAtrasAdelante.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 15)); // NOI18N
        btnAtrasAdelante.setText("Atras-Adelante");
        btnAtrasAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasAdelanteActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 15)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnRestaurar.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 15)); // NOI18N
        btnRestaurar.setText("Restaurar");
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAdelanteAtras, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualiza, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAtrasAdelante, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnRestaurar, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdelanteAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualiza, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtrasAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRestaurar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Empleados:"));

        tblDatos.setFont(new java.awt.Font("Lucida Sans", 0, 15)); // NOI18N
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRES", "APELLIDOS", "SEXO", "SUELDO"
            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        jLabel7.setText("Empleado con el mayor sueldo:");

        txtEmpleadoMayorSueldo.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        jLabel8.setText("Monto de sueldos acumulados:");

        txtMontoSueldoAcumulado.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmpleadoMayorSueldo, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMontoSueldoAcumulado, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)))
                .addGap(123, 123, 123))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpleadoMayorSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMontoSueldoAcumulado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(68, 68, 68)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(62, 62, 62))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //capturando los datos de los empleados
        String cod = txtCodigo.getText();
        String nomb = txtNombre.getText();
        String apel = txtApellidos.getText();
        String sex = cbxSexo.getSelectedItem().toString();
        String suel = txtSueldo.getText();
        //creando el nodo  de la lista en memoria y co

        //creando el nodo  de la lista en memoria y colocando la informacion 
        ini = insertarFinal(ini, cod, nomb, apel, sex, Float.parseFloat(suel));
        limpiarCampos();
        verDatos(1);
        resumen();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizaActionPerformed

        //colocando la informacion den el puntero pFound
        pFound.codigo = txtCodigo.getText();
        pFound.nombre = txtNombre.getText().toUpperCase();
        pFound.apellidos = txtApellidos.getText().toUpperCase();
        pFound.sexo = cbxSexo.getSelectedItem().toString();
        pFound.sueldo = Float.parseFloat(txtSueldo.getText());
        limpiarCampos();
        desabilitar();
        verDatos(1);
        resumen();
    }//GEN-LAST:event_btnActualizaActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        String cod = txtCodigo.getText();
        if (cod.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(rootPane, "Ingresa el codigo a busacar", "ATENCION", 3);
        } else {
            pFound = buscar(ini, cod);
            //verificando el primer pFound para mostrar la informacion buscada
            if (pFound != null) {
                txtNombre.setText(pFound.nombre);
                txtApellidos.setText(pFound.apellidos);
                if (pFound.sexo.equalsIgnoreCase("MASCULINO")) {
                    cbxSexo.setSelectedIndex(1);
                } else {
                    cbxSexo.setSelectedIndex(2);
                }
                txtSueldo.setText(pFound.sueldo + "");
                habilitar();
            } else {
                JOptionPane.showMessageDialog(rootPane, "El codigo: " + cod + ", no esta en los registros", "ATENCION", 3);
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        limpiarCampos();
        verDatos(1);
        if (ini == null) {
            JOptionPane.showMessageDialog(rootPane, "La lista esta vacia", "ATENCION", 3);
        }
        desabilitar();
        resumen();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        limpiarCampos();
        desabilitar();
    }//GEN-LAST:event_btnRestaurarActionPerformed

    private void btnAdelanteAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelanteAtrasActionPerformed
        verDatos(1);
    }//GEN-LAST:event_btnAdelanteAtrasActionPerformed

    private void btnAtrasAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasAdelanteActionPerformed
        verDatos(2);
    }//GEN-LAST:event_btnAtrasAdelanteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        desabilitar();
    }//GEN-LAST:event_formWindowOpened

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(frmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualiza;
    private javax.swing.JButton btnAdelanteAtras;
    private javax.swing.JButton btnAtrasAdelante;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEmpleadoMayorSueldo;
    private javax.swing.JTextField txtMontoSueldoAcumulado;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
