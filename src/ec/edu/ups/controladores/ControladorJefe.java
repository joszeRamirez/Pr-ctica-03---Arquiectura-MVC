package ec.edu.ups.controladores;

import ec.edu.ups.clases.Empleado;
import java.util.SortedSet;
import java.util.TreeSet;

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

    private SortedSet<Empleado> listEmp;
    private int cod;

    public ControladorEmpleado() {
        listEmp = new TreeSet<>();
        cod = 0;
    }

    public void create(Empleado objeto) {
        cod++;
        objeto.setCodigo(cod);
        listEmp.add(objeto);
    }

    public Empleado read(int codigo) {
        for (Empleado empleado : listEmp) {
            if (empleado.getCodigo() == codigo) {
                return empleado;
            }
        }
        return null;
    }

    public void update(Empleado objeto) {
        if (listEmp.contains(objeto)) {
            listEmp.remove(objeto);
            listEmp.add(objeto);
        }

    }

    public void delete(int codigo) {
        for (Empleado empleado : listEmp) {
            if (empleado.getCodigo() == codigo) {
                listEmp.remove(empleado);
                break;
            }
        }
    }

    public void list() {
        System.out.println("Lista ordenada por nombre:");
        for (Empleado empleado : listEmp) {
            System.out.println(empleado);
        }
    }
}
