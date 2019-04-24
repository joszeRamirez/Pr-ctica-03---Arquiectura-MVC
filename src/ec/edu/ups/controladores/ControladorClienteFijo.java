package ec.edu.ups.controladores;

import ec.edu.ups.clases.ClienteFijo;
import java.util.HashSet;
import java.util.Set;


/**
 * Clase ControladorClienteFijo
 *
 * Clase que manipula el CRUDL para la clase ClienteFijo
 *
 * @version 1.0
 * @since 2019
 * @author José Ramírez
 */
public class ControladorClienteFijo {

    private Set<ClienteFijo> listClienteF;
    private int cod;

    public ControladorClienteFijo() {
        listClienteF = new HashSet<>();
        cod = 0;
    }

    public void create(ClienteFijo objeto) {
        cod++;
        objeto.setCodigo(cod);
        listClienteF.add(objeto);
    }

    public ClienteFijo read(int codigo) {
        for (ClienteFijo clienteFijo : listClienteF) {
            if (clienteFijo.getCodigo() == codigo) {
                return clienteFijo;
            }
        }
        return null;
    }

    public void update(ClienteFijo objeto) {
        for (ClienteFijo clienteFijo : listClienteF) {
            if (listClienteF.equals(clienteFijo)) {
                listClienteF.remove(clienteFijo);
                listClienteF.add(objeto);
                break;
            }
        }
    }

    public void delete(int codigo) {
        for (ClienteFijo clienteFijo : listClienteF) {
            if (clienteFijo.getCodigo() == codigo) {
                listClienteF.remove(clienteFijo);
                break;
            }
        }
    }

    public void list() {
        for (ClienteFijo clienteFijo : listClienteF) {
            System.out.println(clienteFijo);
        }
    }
}
