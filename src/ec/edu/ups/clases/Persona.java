package ec.edu.ups.clases;

/**
 * Clase Persona
 *
 * Clase "padre" que hereda a las clases Trabajador y Cliente, ademas determina
 * las acciones de una persona
 *
 * @version 1.0
 * @since 2019
 * @author José Ramírez
 */
public abstract class Persona implements Comparable<Persona> {

    private int codigo;
    private String nombre;
    private String cedula;
    private String telefono;

    /**
     * Constructor vacío
     */
    public Persona() {
    }

    /**
     * Constructor con atributos en específico
     *
     * @param codigo codigo de la persona
     * @param cedula cedula de la persona
     */
    public Persona(int codigo, String cedula) {
        this.codigo = codigo;
        this.cedula = cedula;
    }

    /**
     * Constructor con todos los atributos
     *
     * @param codigo codigo de la persona
     * @param nombre nombre de la persona
     * @param cedula cedula de la persona
     * @param telefono telefono de la persona
     */
    public Persona(String nombre, String cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    //Setters and Getters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Método de la persona para despertarse que no devuelve ningun valor
     */
    public void despertarse() {
        System.out.println("Método para despertarse");
    }

    /**
     * Método de la persona para vestirse que no devuelve ningun valor
     */
    public void vestirse() {
        System.out.println("Método para vestirse");
    }

    /**
     * Método de la persona para dormir que no devuelve ningun valor
     *
     */
    public void dormir() {
        System.out.println("Método para dormir");
    }

    public abstract void GuiarseParaLlegar();

    /**
     * Método toString que devuelve una cadena de texto, imprimiendo todos los
     * atributos solicitados
     *
     * @return (String) la cadena de texto a imprimir
     */
    @Override
    public String toString() {
        return "Persona{" + "codigo=" + codigo + ", nombre=" + nombre
                + ", cedula=" + cedula + ", telefono=" + telefono + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Persona o) {

        if (nombre.compareToIgnoreCase(o.getNombre()) >= 1) {
            return 1;
        } else if (nombre.compareToIgnoreCase(o.getNombre()) <= 1) {
            return -1;
        } else {
            return 0;
        }
    }
}
