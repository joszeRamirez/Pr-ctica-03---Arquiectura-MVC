package ec.edu.ups.clases;

/**
 * Clase Cliente
 *
 * Clase "padre" que hereda a las clases ClienteFijo y ClienteOcasional, y a su
 * vez hereda los atributos de la clase Persona, ademas determina las acciones
 * de un cliente en general
 *
 * @version 1.0
 * @since 2019
 * @author José Ramírez
 */
public abstract class Cliente extends Persona {

    private String tipoPago;
    private double descuento;
    private String tipoSolicitud;
    private int cantidadSolicitudes;

    public Cliente() {
    }

    public Cliente(String tipoPago, double descuento, String tipoSolicitud,
            int cantidadSolicitudes) {
        this.tipoPago = tipoPago;
        this.descuento = descuento;
        this.tipoSolicitud = tipoSolicitud;
        this.cantidadSolicitudes = cantidadSolicitudes;
    }

    public Cliente(String tipoPago, double descuento, String tipoSolicitud,
            int cantidadSolicitudes, int codigo, String nombre, String cedula, String telefono) {
        super(codigo, nombre, cedula, telefono);
        this.tipoPago = tipoPago;
        this.descuento = descuento;
        this.tipoSolicitud = tipoSolicitud;
        this.cantidadSolicitudes = cantidadSolicitudes;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getTipoSolicitud() {
        return tipoSolicitud;
    }

    public void setTipoSolicitud(String tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }

    public int getCantidadSolicitudes() {
        return cantidadSolicitudes;
    }

    public void setCantidadSolicitudes(int cantidadSolicitudes) {
        this.cantidadSolicitudes = cantidadSolicitudes;
    }

    public void pedirProforma() {
        System.out.println("Pide proforma al empleado");
    }

    public void esperar() {
        System.out.println("Espera a que lo atiendan");
    }

    public void revisarMercaderia() {
        System.out.println("Revisa que la mercaderia que lleva este en buen"
                + " estado");
    }

    @Override
    public String toString() {
        return "Cliente{" + "tipoPago=" + tipoPago + ", descuento=" + descuento
                + ", tipoSolicitud=" + tipoSolicitud + ", cantidadSolicitudes="
                + cantidadSolicitudes + '}';
    }

}
