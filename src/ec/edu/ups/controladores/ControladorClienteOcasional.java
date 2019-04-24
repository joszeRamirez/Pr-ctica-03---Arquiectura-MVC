package ec.edu.ups.controladores;

import ec.edu.ups.clases.ClienteOcasional;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase ControladorClienteOcasional
 *
 * Clase que manipula el CRUDL para la clase ClienteOcasional
 *
 * @version 1.0
 * @since 2019
 * @author José Ramírez
 */
public class ControladorClienteOcasional {

    private List<ClienteOcasional> listClienteO;
    private int cod;

    public ControladorClienteOcasional() {
        listClienteO = new ArrayList<>();
        cod = 0;
    }

    public void create(ClienteOcasional objeto) {
        cod++;
        objeto.setCodigo(cod);
        listClienteO.add(objeto);
    }

    public ClienteOcasional read(int codigo) {
        for (ClienteOcasional clienteFijo : listClienteO) {
            if (clienteFijo.getCodigo() == codigo) {
                return clienteFijo;
            }
        }
        return null;
    }

    public void update(ClienteOcasional objeto, int codigo) {
        for (ClienteOcasional clienteOcasional : listClienteO) {
            if (clienteOcasional.getCodigo() == codigo) {
                listClienteO.set(codigo, objeto);
                break;
            }
        }
    }

    public void delete(int codigo) {
        for (ClienteOcasional clienteOcasional : listClienteO) {
            if (clienteOcasional.getCodigo() == codigo) {
                listClienteO.remove(clienteOcasional);
                break;
            }
        }
    }

    public void list() {
        for (ClienteOcasional clienteOcasional : listClienteO) {
            System.out.println(clienteOcasional);
        }
    }
}
