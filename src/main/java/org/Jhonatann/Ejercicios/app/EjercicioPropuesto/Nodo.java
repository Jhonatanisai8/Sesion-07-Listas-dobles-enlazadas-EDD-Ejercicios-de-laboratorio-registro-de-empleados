package org.Jhonatann.Ejercicios.app.EjercicioPropuesto;

/**
 *
 * @author Jhonatan
 */
public class Nodo {

    private Empleado empleado;

    //punteros
    Nodo siguiente;
    Nodo anterior;

    //constructor cuando no hay nodos
    public Nodo(Empleado empleado) {
        this(empleado, null, null);
    }

    //constructor cuando ya hay nodos
    public Nodo(Empleado empleado, Nodo siguiente, Nodo anterior) {
        this.empleado = empleado;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
}
