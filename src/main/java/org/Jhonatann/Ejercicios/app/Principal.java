package org.Jhonatann.Ejercicios.app;

import org.Jhonatann.Ejercicios.app.Ejercicio01Empleados.frmEmpleados;
import org.Jhonatann.Ejercicios.app.EjercicioPropuesto.frmRegistroPersonal;

/**
 *
 * @author Jhonatan
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
       // ejercicio01();
        ejercicios02();
    }

    public static void ejercicio01() {
        frmEmpleados o = new frmEmpleados();
        o.setVisible(true);
    }

    public static void ejercicios02() {
        frmRegistroPersonal ventana = new frmRegistroPersonal();
        ventana.setVisible(true);
    }
}
