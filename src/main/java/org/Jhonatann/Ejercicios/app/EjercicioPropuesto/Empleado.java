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

    //metodos
    public float comisionVentas() {
        float comision = this.ventaRealizadas * 0.05f;
        return comision;
    }

    public float descuentoSeguro() {
        float descuentoSeguro = 0;
        switch (this.estadoCivil) {
            case "Soltero" ->
                descuentoSeguro = this.sueldoBase - 100;
            case "Casado" -> {
                if (this.numHijos > 0) {
                    descuentoSeguro = this.sueldoBase - 50 + (this.numHijos * 70);
                } else {
                    descuentoSeguro = this.sueldoBase - 120;
                }
            }
        }
        return descuentoSeguro;
    }

    public float ta() {
        return this.sueldoBase + comisionVentas();
    }

    public float descuentoImpuesto() {
        float montoImpuesto = 0;
        if (ta() > 0 && ta() < 1500) {
            montoImpuesto = 0;
        }
        if (ta() >= 1500 && ta() <= 2300) {
            montoImpuesto = ta() * 0.03f;
        }
        if (ta() >= 2301 && ta() <= 3000) {
            montoImpuesto = ta() * 0.04f;
        }
        if (ta() >= 3001) {
            montoImpuesto = ta() * 0.06f;
        }
        return montoImpuesto;
    }

    public float calcularSueldoNeto() {
        return this.sueldoBase
                + comisionVentas()
                - descuentoImpuesto()
                - descuentoSeguro();
    }
}
