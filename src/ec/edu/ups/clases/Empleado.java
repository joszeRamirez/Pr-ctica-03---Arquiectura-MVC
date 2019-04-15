package ec.edu.ups.clases;

import java.util.GregorianCalendar;

/**
 * Clase Empleado
 *
 * Clase que hereda los atributos de la clase Trabajador, ademas determina las
 * acciones de un empleado
 *
 * @version 1.0
 * @since 2019
 * @author José Ramírez
 */
public class Empleado extends Trabajador {

    private String horaAlmuerzo;
    private String afiliacion;
    private GregorianCalendar fechaContrato;
    private String tipoEmpleado;

    public Empleado() {
    }

    public Empleado(GregorianCalendar fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public Empleado(String horaAlmuerzo, String afiliacion,
            GregorianCalendar fechaContrato, String tipoEmpleado,
            String tiempoDeLaboracion, String cargo, double salario,
            String horarioLaboral, int codigo, String nombre,
            String cedula, String telefono) {
        super(tiempoDeLaboracion, cargo, salario, horarioLaboral, codigo,
                nombre, cedula, telefono);
        this.horaAlmuerzo = horaAlmuerzo;
        this.afiliacion = afiliacion;
        this.fechaContrato = fechaContrato;
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getHoraAlmuerzo() {
        return horaAlmuerzo;
    }

    public void setHoraAlmuerzo(String horaAlmuerzo) {
        this.horaAlmuerzo = horaAlmuerzo;
    }

    public String getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }

    public GregorianCalendar getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(GregorianCalendar fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public void contarCajaChica() {
        System.out.println("Administrar la caja chica");
    }

    public void administrarBodega() {
        System.out.println("Administrar la bodega");
    }

    public void cumplirSolicitud() {
        System.out.println("Cumple con lo solicitado por el cliente");
    }

    /**
     * Método toString que devuelve una cadena de texto, imprimiendo todos los
     * atributos solicitados
     *
     * @return (String) la cadena de texto a imprimir
     */
    @Override
    public String toString() {
        return "Empleado{" + "horaAlmuerzo=" + horaAlmuerzo + ", afiliacion="
                + afiliacion + ", fechaContrato=" + fechaContrato
                + ", tipoEmpleado=" + tipoEmpleado + '}';
    }

}
