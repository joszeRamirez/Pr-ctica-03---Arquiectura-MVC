package ec.edu.ups.clases;

import java.util.GregorianCalendar;
import ec.edu.ups.interfaces.Interface;
import java.util.Date;

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
public final class ClienteFijo extends Cliente implements Interface {

    private Date fechaClienteFijo;
    private int numCreditos;
    private String ordenCompra;
    private Date fechaRetiroMercaderia;

    public ClienteFijo() {
    }

    public ClienteFijo(Date fechaClienteFijo, int numCreditos,
            String ordenCompra, Date fechaRetiroMercaderia) {
        this.fechaClienteFijo = fechaClienteFijo;
        this.numCreditos = numCreditos;
        this.ordenCompra = ordenCompra;
        this.fechaRetiroMercaderia = fechaRetiroMercaderia;
    }

    public ClienteFijo(Date fechaClienteFijo, int numCreditos,
            String ordenCompra, Date fechaRetiroMercaderia,
            String tipoPago, double descuento, String tipoSolicitud,
            int cantidadSolicitudes, String nombre, String cedula,
            String telefono) {
        super(tipoPago, descuento, tipoSolicitud, cantidadSolicitudes,
                nombre, cedula, telefono);
        this.fechaClienteFijo = fechaClienteFijo;
        this.numCreditos = numCreditos;
        this.ordenCompra = ordenCompra;
        this.fechaRetiroMercaderia = fechaRetiroMercaderia;
    }

    public Date getFechaClienteFijo() {
        return fechaClienteFijo;
    }

    public void setFechaClienteFijo(Date fechaClienteFijo) {
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

    public Date getFechaRetiroMercaderia() {
        return fechaRetiroMercaderia;
    }

    public void setFechaRetiroMercaderia(Date fechaRetiroMercaderia) {
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
        return super.toString() + "ClienteFijo{" + "fechaClienteFijo=" + fechaClienteFijo
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

    @Override
    public void conversar() {
        System.out.println("Conversa con el jefe por cambios de precios");
    }

    @Override
    public void contar() {
        System.out.println("CUenta la deuda total con la empresa");
    }

}
