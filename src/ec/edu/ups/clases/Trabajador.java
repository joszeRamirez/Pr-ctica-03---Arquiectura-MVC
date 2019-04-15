package ec.edu.ups.clases;

/**
 * Clase Trabajador
 *
 * Clase "padre" que hereda a las clases Empleado y Jefe, y a su vez hereda los
 * atributos de la clase Persona, ademas determina las acciones de un trabajador
 *
 * @version 1.0
 * @since 2019
 * @author José Ramírez
 */
public abstract class Trabajador extends Persona {

    private String tiempoDeLaboracion;
    private String cargo;
    private double salario;
    private String horarioLaboral;

    public Trabajador() {
    }

    public Trabajador(String tiempoDeLaboracion, String cargo,
            double salario, String horarioLaboral) {
        this.tiempoDeLaboracion = tiempoDeLaboracion;
        this.cargo = cargo;
        this.salario = salario;
        this.horarioLaboral = horarioLaboral;
    }

    public Trabajador(String tiempoDeLaboracion, String cargo,
            double salario, String horarioLaboral, int codigo,
            String nombre, String cedula, String telefono) {
        super(codigo, nombre, cedula, telefono);
        this.tiempoDeLaboracion = tiempoDeLaboracion;
        this.cargo = cargo;
        this.salario = salario;
        this.horarioLaboral = horarioLaboral;
    }

    public String getTiempoDeLaboracion() {
        return tiempoDeLaboracion;
    }

    public void setTiempoDeLaboracion(String tiempoDeLaboracion) {
        this.tiempoDeLaboracion = tiempoDeLaboracion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getHorarioLaboral() {
        return horarioLaboral;
    }

    public void setHorarioLaboral(String horarioLaboral) {
        this.horarioLaboral = horarioLaboral;
    }

    public void ingresarTrabajo() {
        System.out.println("Metodo para ingresar al trabajo");
    }

    public void ejecutarCargo() {
        System.out.println("Metodo para ejecutar el cargo");
    }

    public void salirTrabajo() {
        System.out.println("Metodo para salir del trabajo");
    }

    public abstract void llegarAlTrabajo();

    /**
     * Método toString que devuelve una cadena de texto, imprimiendo todos los
     * atributos solicitados
     *
     * @return (String) la cadena de texto a imprimir
     */
    @Override
    public String toString() {
        return "Trabajador{" + "tiempoDeLaboracion=" + tiempoDeLaboracion
                + ", cargo=" + cargo + ", salario=" + salario
                + ", horarioLaboral=" + horarioLaboral + '}';
    }

}
