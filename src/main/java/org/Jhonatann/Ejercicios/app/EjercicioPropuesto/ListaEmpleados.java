package org.Jhonatann.Ejercicios.app.EjercicioPropuesto;

import java.text.DecimalFormat;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jhonatan
 */
public class ListaEmpleados {

    private Nodo inicio;
    private Nodo fin;

    public ListaEmpleados() {
        inicio = fin = null;
    }

    //metodo para saber si la lista esta vacia
    public boolean estaVacia() {
        return inicio == null;
    }

    //metodo para insertar al final
    public void insertarFinal(Empleado empleado) {
        if (!estaVacia()) {
            fin = new Nodo(empleado, null, fin);

            //apuntamos fin de siguiente de anterior a fin
            fin.anterior.siguiente = fin;
        } else {
            //para cuando ya hay nodos
            inicio = fin = new Nodo(empleado);
        }
    }

    private static void vaciarTabla(DefaultTableModel miModelo, JTable tblDatos) {
        //obtenemos el numero de filas de las tablas
        int filas = tblDatos.getRowCount();
        for (int i = 0; i < filas; i++) {
            miModelo.removeRow(0);
        }
    }

    //metodo para ver los datos
    public void verDatosTabla(int ind, DefaultTableModel modelo, JTable tblDatos) {

        String nombre;
        String appPaterno;
        String appMaterno;
        float sueldoBase;
        int ventaRealizadas;
        String estadoCivil;
        int numHijos;
        float comisionVentas;
        float descSeguro;
        float desImpuestos;
        float sueldoNeto;

        int numero = 0;
        switch (ind) {
            case 1: {
                vaciarTabla(modelo, tblDatos);
                Nodo aux;
                aux = inicio;

                while (aux != null) {

                    nombre = aux.getEmpleado().getNombre();
                    appPaterno = aux.getEmpleado().getAppPaterno();
                    appMaterno = aux.getEmpleado().getAppMaterno();
                    sueldoBase = aux.getEmpleado().getSueldoBase();
                    ventaRealizadas = aux.getEmpleado().getVentaRealizadas();
                    estadoCivil = aux.getEmpleado().getEstadoCivil();
                    numHijos = aux.getEmpleado().getNumHijos();
                    comisionVentas = aux.getEmpleado().comisionVentas();
                    descSeguro = aux.getEmpleado().descuentoSeguro();
                    desImpuestos = aux.getEmpleado().descuentoImpuesto();
                    sueldoNeto = aux.getEmpleado().calcularSueldoNeto();
                    numero++;

                    Object fila[] = {numero, nombre, appPaterno, appMaterno, sueldoBase, ventaRealizadas, estadoCivil, numHijos,
                        comisionVentas, descSeguro, desImpuestos, sueldoNeto};
                    modelo.addRow(fila);
                    aux = aux.siguiente;
                }
            }
            break;
            case 2: {
                vaciarTabla(modelo, tblDatos);
                Nodo aux = fin;
                numero = 0;
                while (aux != null) {
                    nombre = aux.getEmpleado().getNombre();
                    appPaterno = aux.getEmpleado().getAppPaterno();
                    appMaterno = aux.getEmpleado().getAppMaterno();
                    sueldoBase = aux.getEmpleado().getSueldoBase();
                    ventaRealizadas = aux.getEmpleado().getVentaRealizadas();
                    estadoCivil = aux.getEmpleado().getEstadoCivil();
                    numHijos = aux.getEmpleado().getNumHijos();
                    comisionVentas = aux.getEmpleado().comisionVentas();
                    descSeguro = aux.getEmpleado().descuentoSeguro();
                    desImpuestos = aux.getEmpleado().descuentoImpuesto();
                    sueldoNeto = aux.getEmpleado().calcularSueldoNeto();
                    numero++;

                    Object fila[] = {numero, nombre, appPaterno, appMaterno, sueldoBase, ventaRealizadas, estadoCivil, numHijos,
                        comisionVentas, descSeguro, desImpuestos, sueldoNeto};
                    modelo.addRow(fila);
                    aux = aux.anterior;
                }
            }
            break;
        }
    }

    //monto total que la empresa debe pagar por concepto de sueldos
    public void montoTotalPorSueldos(JTextField txtMontoTotalSueldo) {
        DecimalFormat dfc = new DecimalFormat("#####.00");
        Nodo aux = inicio;
        float sumaMontoSueldos = 0;
        while (aux != null) {
            sumaMontoSueldos += aux.getEmpleado().calcularSueldoNeto();
            aux = aux.siguiente;
        }
        txtMontoTotalSueldo.setText("S/. " + dfc.format(sumaMontoSueldos));
    }

    //el monto total por comisiones de ventas
    public void montoTotalPorComsiones(JTextField txtMontoTotalSueldo) {
        DecimalFormat dfc = new DecimalFormat("#####.00");
        Nodo aux = inicio;
        float sumaMontoSueldos = 0;
        while (aux != null) {
            sumaMontoSueldos += aux.getEmpleado().comisionVentas();
            aux = aux.siguiente;
        }
        txtMontoTotalSueldo.setText("S/. " + dfc.format(sumaMontoSueldos));
    }

    //el monto total de los descuentos por impuesto 
    public void montoTotalPorDescuentoImpuesto(JTextField txtMontoTotalSueldo) {
        DecimalFormat dfc = new DecimalFormat("#####.00");
        Nodo aux = inicio;
        float sumaMontoSueldos = 0;
        while (aux != null) {
            sumaMontoSueldos += aux.getEmpleado().descuentoImpuesto();
            aux = aux.siguiente;
        }
        txtMontoTotalSueldo.setText("S/. " + dfc.format(sumaMontoSueldos));
    }

    //el monto total de los descuentos por seguro 
    public void montoTotalPorDescuentoSeguro(JTextField txtMontoTotalSueldo) {
        DecimalFormat dfc = new DecimalFormat("#####.00");
        Nodo aux = inicio;
        float sumaMontoSueldos = 0;
        while (aux != null) {
            sumaMontoSueldos += aux.getEmpleado().descuentoSeguro();
            aux = aux.siguiente;
        }
        txtMontoTotalSueldo.setText("S/. " + dfc.format(sumaMontoSueldos));
    }

    private Nodo buscarEmpleado(String nombre) {
        Nodo pos = inicio;
        while (pos != null && !pos.getEmpleado().getNombre().equalsIgnoreCase(nombre)) {
            pos = pos.siguiente;
        }
        return pos;
    }

    public void buscarInformacion(JTextField txtNombres, JTextField txtApePaterno, JTextField txtApeMaterno, JTextField txtVentaRe,
            JTextField txtSueldoBase, JComboBox cbxEstadoCivil, JTextField txtNumHijos, JTextField txtSueldoNeto) {
        Nodo auxiliar = buscarEmpleado(txtNombres.getText().trim());
        if (auxiliar != null) {
            //mostramos la informacion del empleado en los campos buscados
            txtNombres.setText(auxiliar.getEmpleado().getNombre());
            txtApePaterno.setText(auxiliar.getEmpleado().getAppPaterno());
            txtApeMaterno.setText(auxiliar.getEmpleado().getAppMaterno());
            txtSueldoBase.setText(auxiliar.getEmpleado().getSueldoBase() + "");
            txtNumHijos.setText(auxiliar.getEmpleado().getNumHijos() + "");
            txtVentaRe.setText(auxiliar.getEmpleado().getVentaRealizadas() + "");
            cbxEstadoCivil.setSelectedItem(auxiliar.getEmpleado().getEstadoCivil());
            txtSueldoNeto.setText(auxiliar.getEmpleado().calcularSueldoNeto() + "");
        } else {
            JOptionPane.showMessageDialog(null, "Empledo con nombre: " + txtNombres.getText() + ", no encontrado", "ATENCIÓN", 3);
        }
    }

    public void modificarDatos(String nombre, String appPaterno, String appMaterno, float sueldoBase, int ventaRealizadas, String estadoCivil, int numHijos) {
        Nodo aux = buscarEmpleado(nombre);
        if (aux != null) {
            aux.getEmpleado().setNombre(nombre);
            aux.getEmpleado().setAppPaterno(appPaterno);
            aux.getEmpleado().setAppMaterno(appMaterno);
            aux.getEmpleado().setSueldoBase(sueldoBase);
            aux.getEmpleado().setVentaRealizadas(ventaRealizadas);
            aux.getEmpleado().setEstadoCivil(estadoCivil);
            aux.getEmpleado().setNumHijos(numHijos);
        }
    }

    //metodo para eliminar un nodo
    public boolean eliminarNodoEspecifico(String nombre) {
        boolean encontrado = false;
        if (!estaVacia()) {
            if (inicio == fin && inicio.getEmpleado().getNombre().equalsIgnoreCase(nombre)) {
                // Caso: Solo hay un nodo y es el que queremos eliminar.
                inicio = null;
                fin = null;
                encontrado = true;
            } else if (nombre.equalsIgnoreCase(inicio.getEmpleado().getNombre())) {
                //el nodo a eliminar es el primero.
                inicio = inicio.siguiente;
                if (inicio != null) {
                    inicio.anterior = null;
                }
                encontrado = true;
            } else {
                // el nodo a eliminar está en medio o al final.
                Nodo recorrer = inicio.siguiente; // Empezamos desde el segundo nodo
                while (recorrer != null && !recorrer.getEmpleado().getNombre().equalsIgnoreCase(nombre)) {
                    recorrer = recorrer.siguiente;
                }
                if (recorrer != null) {
                    //encontramos  el nodo a eliminar.
                    if (recorrer == fin) {
                        // el nodo a eliminar es el último.
                        fin = recorrer.anterior;
                        fin.siguiente = null;
                    } else {
                        //el nodo a eliminar está en medio.
                        recorrer.anterior.siguiente = recorrer.siguiente;
                        recorrer.siguiente.anterior = recorrer.anterior;
                    }
                    encontrado = true;
                }
            }
        }
        return encontrado;
    }

}
