package org.Jhonatann.Ejercicios.app.EjercicioPropuesto;

import javax.swing.JTable;
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
}
