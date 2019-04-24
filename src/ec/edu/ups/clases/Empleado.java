package ec.edu.ups.clases;

import java.util.GregorianCalendar;
import ec.edu.ups.interfaces.Interface;
import java.util.Date;

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
public final class Empleado extends Trabajador implements Interface {

    private String horaAlmuerzo;
    private String afiliacion;
    private Date fechaContrato;
    private String tipoEmpleado;

    public Empleado() {
    }

    public Empleado(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public Empleado(String horaAlmuerzo, String afiliacion,
            Date fechaContrato, String tipoEmpleado,
            String tiempoDeLaboracion, String cargo, double salario,
            String horarioLaboral, String nombre,
            String cedula, String telefono) {
        super(tiempoDeLaboracion, cargo, salario, horarioLaboral, nombre, cedula, telefono);
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

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
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
        return super.toString() +"Empleado{" + "horaAlmuerzo=" + horaAlmuerzo + ", afiliacion="
                + afiliacion + ", fechaContrato=" + fechaContrato
                + ", tipoEmpleado=" + tipoEmpleado + '}';
    }

    @Override
    public void llegarAlTrabajo() {
        System.out.println("LLega en bus");
    }

    @Override
    public void GuiarseParaLlegar() {
        System.out.println("Conoce donde debe bajarse del bus para llegar");
    }

    @Override
    public void conversar() {
        System.out.println("Conversa su vida cotidiana con los demás");
    }

    @Override
    public void contar() {
        System.out.println("Cuenta el estado actual de la caja chica");
    }

}
