package org.Jhonatann.Ejercicios.app.EjercicioPropuesto;

/**
 *
 * @author Jhonatan
 */
public class Empleado {

    /*aributos*/
    private String nombre;
    private String appPaterno;
    private String appMaterno;
    private float sueldoBase;
    private int ventaRealizadas;
    private String estadoCivil;
    private int numHijos;

    //contructor
    public Empleado(String nombre, String appPaterno, String appMaterno, float sueldoBase, int ventaRealizadas, String estadoCivil, int numHijos) {
        this.nombre = nombre;
        this.appPaterno = appPaterno;
        this.appMaterno = appMaterno;
        this.sueldoBase = sueldoBase;
        this.ventaRealizadas = ventaRealizadas;
        this.estadoCivil = estadoCivil;
        this.numHijos = numHijos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppPaterno() {
        return appPaterno;
    }

    public void setAppPaterno(String appPaterno) {
        this.appPaterno = appPaterno;
    }

    public String getAppMaterno() {
        return appMaterno;
    }

    public void setAppMaterno(String appMaterno) {
        this.appMaterno = appMaterno;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getVentaRealizadas() {
        return ventaRealizadas;
    }

    public void setVentaRealizadas(int ventaRealizadas) {
        this.ventaRealizadas = ventaRealizadas;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

}
