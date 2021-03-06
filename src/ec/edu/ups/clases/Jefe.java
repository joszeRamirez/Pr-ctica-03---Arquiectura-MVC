package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Interface;
import java.util.Date;

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
public final class Jefe extends Trabajador implements Interface {

    private Date fechaInicioEmpresa;
    private String diaPagoEmpleados;
    private int cantidadSocios;
    private double fondosEmpresa;

    public Jefe() {
    }

    public Jefe(String tiempoDeLaboracion, String cargo, double salario,
            String horarioLaboral, String nombre, String cedula,
            String telefono) {
        super(tiempoDeLaboracion, cargo, salario, horarioLaboral, nombre,
                cedula, telefono);
    }

    public Jefe(Date fechaInicioEmpresa,
            String diaPagoEmpleados, int cantidadSocios,
            double fondosEmpresa, String tiempoDeLaboracion, String cargo,
            double salario, String horarioLaboral, String nombre,
            String cedula, String telefono) {
        super(tiempoDeLaboracion, cargo, salario, horarioLaboral, nombre,
                cedula, telefono);
        this.fechaInicioEmpresa = fechaInicioEmpresa;
        this.diaPagoEmpleados = diaPagoEmpleados;
        this.cantidadSocios = cantidadSocios;
        this.fondosEmpresa = fondosEmpresa;
    }

    public Date getFechaInicioEmpresa() {
        return fechaInicioEmpresa;
    }

    public void setFechaInicioEmpresa(Date fechaInicioEmpresa) {
        this.fechaInicioEmpresa = fechaInicioEmpresa;
    }

    public String getDiaPagoEmpleados() {
        return diaPagoEmpleados;
    }

    public void setFechaPagoEmpleados(String diaPagoEmpleados) {
        this.diaPagoEmpleados = diaPagoEmpleados;
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

    /**
     * Método toString que devuelve una cadena de texto, imprimiendo todos los
     * atributos solicitados
     *
     * @return (String) la cadena de texto a imprimir
     */
    @Override
    public String toString() {
        return super.toString() + "Jefe{" + "fechaInicioEmpresa=" + fechaInicioEmpresa
                + ", diaPagoEmpleados=" + diaPagoEmpleados
                + ", cantidadSocios=" + cantidadSocios + ", fondosEmpresa="
                + fondosEmpresa + '}';
    }

    @Override
    public void llegarAlTrabajo() {
        System.out.println("LLega en auto propio");
    }

    @Override
    public void GuiarseParaLlegar() {
        System.out.println("Conoce las calles para llegar al trabajo");
    }

    @Override
    public void conversar() {
        System.out.println("Conversa con sus socios sobre el balance "
                + "empresarial");
    }

    @Override
    public void contar() {
        System.out.println("Cuenta el estqado bancario actual de la empresa");
    }

}
