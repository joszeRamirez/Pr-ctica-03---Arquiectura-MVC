package ec.edu.ups.prueba;

import ec.edu.ups.clases.*;
import ec.edu.ups.vista.Principal;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author José Ramírez
 */
public class Prueba {

    public static void main(String[] args) {
        /*List<Persona> listaTt = new ArrayList<>();

        GregorianCalendar fechaInicioEmpresaChris = new GregorianCalendar(2011, 6, 15);
        Jefe jefeChris = new Jefe(fechaInicioEmpresaChris.getTime(), "el 28 de cada mes",
                3, 8740.24, "10 años", "Gerente", 1200, "Lunes a Viernes", 12,
                "Christhian Amendaño", "0704585926", "2964497");

        GregorianCalendar fechaContratoJuanito = new GregorianCalendar(2016, 4, 20);
        Empleado empleadoJuanito = new Empleado("de 12:00 a 14:00", "Si",
                fechaContratoJuanito.getTime(), "Asalariado", "3 años", "Asistente Contable", 480.40,
                "Lunes a Sábado", 123, "Juan Bubie", "0705467543", "0987654321");

        GregorianCalendar fechaClienteMaria = new GregorianCalendar(2015, 2, 5);
        GregorianCalendar fechaRetiroMaria = new GregorianCalendar(2019, 3, 16);
        ClienteFijo clienteMaria = new ClienteFijo(fechaClienteMaria.getTime(), 15, "Orden n° 456",
                fechaRetiroMaria.getTime(), "A crédito", 0.02, "Retiro de mercadería", 2,
                12345, "Maria Quijije", "0705463732", "0986754321");

        ClienteOcasional clienteCarlos = new ClienteOcasional(260, 10.5, "Buena",
                "Recomendado por Maria", "Efectivo", 0.10, "Pedido de mercadería",
                1, 12354, "Carlos Porcinio", "0706740614", "0976543289");

        listaTt.add(jefeChris);
        listaTt.add(empleadoJuanito);
        listaTt.add(clienteMaria);
        listaTt.add(clienteCarlos);
        for (Persona persona : listaTt) {
            if (persona instanceof Trabajador) {

                if (persona instanceof Jefe) {
                    Jefe temp = (Jefe) persona;
                    System.out.println("Jefe " + temp);
                } else if (persona instanceof Empleado) {
                    Empleado temp = (Empleado) persona;
                    System.out.println("Empleado " + temp);
                }
            } else if (persona instanceof Cliente) {

                if (persona instanceof ClienteFijo) {
                    ClienteFijo temp = (ClienteFijo) persona;
                    System.out.println("Cliente Fijo " + temp);
                } else if (persona instanceof ClienteOcasional) {
                    ClienteOcasional temp = (ClienteOcasional) persona;
                    System.out.println("Cliente Ocasional " + temp);
                }
            }
        }
        Trabajador empleadoAnonimo = new Trabajador("2 años", "Bodeguero", 200, "Sábado a Domingo", 12543, "Anonimus", "0707070707", "0987654321") {
            @Override
            public void llegarAlTrabajo() {
                System.out.println("En taxi");
            }

            @Override
            public void GuiarseParaLlegar() {
                System.out.println("Se memorizó la dirección");
            }
        };
        System.out.println("Empleado " + empleadoAnonimo);
        Cliente clienteAnonimo = new Cliente("Tarjeta de Crédito", 0, "Vía telefónica", 3, 125467, "Nimusano", "0770707070", "0912345678") {

            @Override
            public void pedirFactura() {
                System.out.println("Factura física");
            }

            @Override
            public void GuiarseParaLlegar() {
                System.out.println("Mediante referencias");
            }
        };
        System.out.println("Cliente " + clienteAnonimo);*/
        Principal main = new Principal();
        main.Principal();
    }
}
