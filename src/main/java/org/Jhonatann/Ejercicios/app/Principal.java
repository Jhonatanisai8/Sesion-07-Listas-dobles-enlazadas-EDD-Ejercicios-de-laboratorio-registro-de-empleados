package org.Jhonatann.Ejercicios.app;

import org.Jhonatann.Ejercicios.app.Ejercicio01Empleados.frmEmpleados;

/**
 *
 * @author Jhonatan
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        ejercicio01();
    }
    
    public static void ejercicio01(){
        frmEmpleados o = new frmEmpleados();
        o.setVisible(true);
    }
}
