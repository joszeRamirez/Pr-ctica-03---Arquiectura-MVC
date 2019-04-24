/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.ClienteOcasional;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
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
