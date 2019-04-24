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

    public void update(ClienteOcasional objeto) {
        for (int i = 0; i < listClienteO.size(); i++) {
            ClienteOcasional elemento = listClienteO.get(i);
            if (elemento.equals(objeto)) {
                listClienteO.set(i, objeto);
                break;
            }
        }
    }

    public void delete(int codigo) {
        for (int i = 0; i < listClienteO.size(); i++) {
            ClienteOcasional elemento = listClienteO.get(i);
            if (elemento.getCodigo() == codigo) {
                listClienteO.remove(i);
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
