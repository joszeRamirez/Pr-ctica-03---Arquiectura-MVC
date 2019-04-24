package ec.edu.ups.controladores;

import ec.edu.ups.clases.ClienteFijo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class ControladorClienteFijo {

    private List<ClienteFijo> listCliente;
    private int cod;

    public ControladorClienteFijo() {
        listCliente = new ArrayList<>();
        cod = 0;
    }

    public void create(ClienteFijo objeto) {
        cod++;
        objeto.setCodigo(cod);
        listCliente.add(objeto);
    }

    public ClienteFijo read(int codigo) {
        for (ClienteFijo clienteFijo : listCliente) {
            if (clienteFijo.getCodigo() == codigo) {
                return clienteFijo;
            }
        }
        return null;
    }

    public void update(ClienteFijo objeto, int codigo) {
        for (ClienteFijo clienteFijo : listCliente) {
            if (clienteFijo.getCodigo() == codigo) {
                listCliente.set(codigo, objeto);
                break;
            }
        }
    }

    public void delete(int codigo) {
        for (ClienteFijo clienteFijo : listCliente) {
            if (clienteFijo.getCodigo() == codigo) {
                listCliente.remove(clienteFijo);
                break;
            }
        }
    }

    public void list() {
        for (ClienteFijo clienteFijo : listCliente) {
            System.out.println(clienteFijo);
        }
    }
}
