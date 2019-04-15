package ec.edu.ups.clases;

import java.util.GregorianCalendar;

/**
 * Clase Jefe
 *
 * Clase que hereda los atributos de la clase Trabajador, ademas determina las
 * acciones de un jefe de empresa
 *
 * @version 1.0
 * @since 2019
 * @author José Ramírez
 */
public class Jefe extends Trabajador {

    private GregorianCalendar fechaInicioEmpresa;
    private GregorianCalendar fechaPagoEmpleados;
    private int cantidadSocios;
    private double fondosEmpresa;

    public Jefe() {
    }

    public Jefe(String tiempoDeLaboracion, String cargo, double salario,
            String horarioLaboral, int codigo, String nombre, String cedula,
            String telefono) {
        super(tiempoDeLaboracion, cargo, salario, horarioLaboral, codigo,
                nombre, cedula, telefono);
    }

    public Jefe(GregorianCalendar fechaInicioEmpresa,
            GregorianCalendar fechaPagoEmpleados, int cantidadSocios,
            double fondosEmpresa, String tiempoDeLaboracion, String cargo,
            double salario, String horarioLaboral, int codigo, String nombre,
            String cedula, String telefono) {
        super(tiempoDeLaboracion, cargo, salario, horarioLaboral, codigo,
                nombre, cedula, telefono);
        this.fechaInicioEmpresa = fechaInicioEmpresa;
        this.fechaPagoEmpleados = fechaPagoEmpleados;
        this.cantidadSocios = cantidadSocios;
        this.fondosEmpresa = fondosEmpresa;
    }

    public GregorianCalendar getFechaInicioEmpresa() {
        return fechaInicioEmpresa;
    }

    public void setFechaInicioEmpresa(GregorianCalendar fechaInicioEmpresa) {
        this.fechaInicioEmpresa = fechaInicioEmpresa;
    }

    public GregorianCalendar getFechaPagoEmpleados() {
        return fechaPagoEmpleados;
    }

    public void setFechaPagoEmpleados(GregorianCalendar fechaPagoEmpleados) {
        this.fechaPagoEmpleados = fechaPagoEmpleados;
    }

    public int getCantidadSocios() {
        return cantidadSocios;
    }

    public void setCantidadSocios(int cantidadSocios) {
        this.cantidadSocios = cantidadSocios;
    }

    public double getFondosEmpresa() {
        return fondosEmpresa;
    }

    public void setFondosEmpresa(double fondosEmpresa) {
        this.fondosEmpresa = fondosEmpresa;
    }

    public void sermonearEmpleados() {
        System.out.println("Corrige a los empleados");
    }

    public void recibirIdeas() {
        System.out.println("Escucha ideas por parte de otros miembros");
    }

    public void gestionarEmpleados() {
        System.out.println("Revisa desempeño de sus empleados");
    }

    @Override
    public String toString() {
        return "Jefe{" + "fechaInicioEmpresa=" + fechaInicioEmpresa
                + ", fechaPagoEmpleados=" + fechaPagoEmpleados
                + ", cantidadSocios=" + cantidadSocios + ", fondosEmpresa="
                + fondosEmpresa + '}';
    }

}
