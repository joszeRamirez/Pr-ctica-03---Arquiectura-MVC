package ec.edu.ups.controladores;

import ec.edu.ups.clases.Jefe;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


/**
 * Clase ControladorJefe
 *
 * Clase que manipula el CRUDL para la clase Jefe
 *
 * @version 1.0
 * @since 2019
 * @author José Ramírez
 */
public class ControladorJefe {

    private Map<Integer, Jefe> listJef;
    private int cod;

    public ControladorJefe() {
        listJef = new TreeMap<>();
        cod = 0;
    }

    public void create(Jefe objeto) {
        cod++;
        objeto.setCodigo(cod);
        listJef.put(cod, objeto);
    }

    public Jefe read(int codigo) {
        Iterator it = listJef.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + listJef.get(key));
        }
        return null;
    }

    public void update(Jefe objeto) {
        if (listJef.containsKey(objeto)) {
            listJef.remove(objeto);
            listJef.put(cod, objeto);
        }

    }

    public void delete(int codigo) {
        Iterator it = listJef.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            if (key == codigo) {
                listJef.remove(codigo);
                break;
            }
        }
    }

    public void list() {
        System.out.println("Lista Ordenada");
        Iterator it = listJef.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + listJef.get(key));
        }
    }
}
