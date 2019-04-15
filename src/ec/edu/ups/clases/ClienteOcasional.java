package ec.edu.ups.clases;

/**
 * Clase ClienteOcasional
 *
 * Clase que hereda los atributos de la clase Cliente, ademas determina las
 * acciones de un cliente ocasional
 *
 * @version 1.0
 * @since 2019
 * @author José Ramírez
 */
public class ClienteOcasional extends Cliente {

    private double pagoPorServicio;
    private double cambioRecibido;
    private String calificacionPorServicio;
    private String recomendadoPor;

    public ClienteOcasional() {
    }

    public ClienteOcasional(double pagoPorServicio, double cambioRecibido,
            String calificacionPorServicio, String recomendadoPor) {
        this.pagoPorServicio = pagoPorServicio;
        this.cambioRecibido = cambioRecibido;
        this.calificacionPorServicio = calificacionPorServicio;
        this.recomendadoPor = recomendadoPor;
    }

    public ClienteOcasional(double pagoPorServicio, double cambioRecibido,
            String calificacionPorServicio, String recomendadoPor,
            String tipoPago, double descuento, String tipoSolicitud,
            int cantidadSolicitudes, int codigo, String nombre, String cedula,
            String telefono) {
        super(tipoPago, descuento, tipoSolicitud, cantidadSolicitudes, codigo,
                nombre, cedula, telefono);
        this.pagoPorServicio = pagoPorServicio;
        this.cambioRecibido = cambioRecibido;
        this.calificacionPorServicio = calificacionPorServicio;
        this.recomendadoPor = recomendadoPor;
    }

    public double getPagoPorServicio() {
        return pagoPorServicio;
    }

    public void setPagoPorServicio(double pagoPorServicio) {
        this.pagoPorServicio = pagoPorServicio;
    }

    public double getCambioRecibido() {
        return cambioRecibido;
    }

    public void setCambioRecibido(double cambioRecibido) {
        this.cambioRecibido = cambioRecibido;
    }

    public String getCalificacionPorServicio() {
        return calificacionPorServicio;
    }

    public void setCalificacionPorServicio(String calificacionPorServicio) {
        this.calificacionPorServicio = calificacionPorServicio;
    }

    public String getRecomendadoPor() {
        return recomendadoPor;
    }

    public void setRecomendadoPor(String recomendadoPor) {
        this.recomendadoPor = recomendadoPor;
    }

    public void compararPrecios() {
        System.out.println("Compara precios con otras empresas que haya "
                + "visitado antes");
    }

    public void pedirDescuento() {
        System.out.println("Pide descuento de acuerdo a su forma de pago");
    }

    public void analizarMarcas() {
        System.out.println("Compara marcas de productos");
    }

    @Override
    public String toString() {
        return "ClienteOcasional{" + "pagoPorServicio=" + pagoPorServicio
                + ", cambioRecibido=" + cambioRecibido
                + ", calificacionPorServicio=" + calificacionPorServicio
                + ", recomendadoPor=" + recomendadoPor + '}';
    }

}
