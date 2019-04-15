package ec.edu.ups.clases;

import java.util.GregorianCalendar;

/**
 * Clase ClienteFijo
 *
 * Clase que hereda los atributos de la clase Cliente, ademas determina las
 * acciones de un cliente fijo
 *
 * @version 1.0
 * @since 2019
 * @author José Ramírez
 */
public class ClienteFijo extends Cliente {

    private GregorianCalendar fechaClienteFijo;
    private int numCreditos;
    private String ordenCompra;
    private GregorianCalendar fechaRetiroMercaderia;

    public ClienteFijo() {
    }

    public ClienteFijo(GregorianCalendar fechaClienteFijo, int numCreditos,
            String ordenCompra, GregorianCalendar fechaRetiroMercaderia) {
        this.fechaClienteFijo = fechaClienteFijo;
        this.numCreditos = numCreditos;
        this.ordenCompra = ordenCompra;
        this.fechaRetiroMercaderia = fechaRetiroMercaderia;
    }

    public ClienteFijo(GregorianCalendar fechaClienteFijo, int numCreditos,
            String ordenCompra, GregorianCalendar fechaRetiroMercaderia,
            String tipoPago, double descuento, String tipoSolicitud,
            int cantidadSolicitudes, int codigo, String nombre, String cedula,
            String telefono) {
        super(tipoPago, descuento, tipoSolicitud, cantidadSolicitudes, codigo,
                nombre, cedula, telefono);
        this.fechaClienteFijo = fechaClienteFijo;
        this.numCreditos = numCreditos;
        this.ordenCompra = ordenCompra;
        this.fechaRetiroMercaderia = fechaRetiroMercaderia;
    }

    public GregorianCalendar getFechaClienteFijo() {
        return fechaClienteFijo;
    }

    public void setFechaClienteFijo(GregorianCalendar fechaClienteFijo) {
        this.fechaClienteFijo = fechaClienteFijo;
    }

    public int getNumCreditos() {
        return numCreditos;
    }

    public void setNumCreditos(int numCreditos) {
        this.numCreditos = numCreditos;
    }

    public String getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(String ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    public GregorianCalendar getFechaRetiroMercaderia() {
        return fechaRetiroMercaderia;
    }

    public void setFechaRetiroMercaderia(GregorianCalendar fechaRetiroMercaderia) {
        this.fechaRetiroMercaderia = fechaRetiroMercaderia;
    }

    public void revisarNuevaMercaderia() {
        System.out.println("Pregunta por nueva mercadería");
    }

    public void notificarEventos() {
        System.out.println("Notifica de eventos a la empresa");
    }

    public void pagarFacturas() {
        System.out.println("Paga las facturas para minorizar los créditos"
                + " consumidos");
    }

    /**
     * Método toString que devuelve una cadena de texto, imprimiendo todos los
     * atributos solicitados
     *
     * @return (String) la cadena de texto a imprimir
     */
    @Override
    public String toString() {
        return "ClienteFijo{" + "fechaClienteFijo=" + fechaClienteFijo
                + ", numCreditos=" + numCreditos + ", ordenCompra="
                + ordenCompra + ", fechaRetiroMercaderia="
                + fechaRetiroMercaderia + '}';
    }

    @Override
    public void pedirFactura() {
        System.out.println("Pide factura electrónica");
    }

    @Override
    public void GuiarseParaLlegar() {
        System.out.println("Conoce la ruta para llegar");
    }

}
