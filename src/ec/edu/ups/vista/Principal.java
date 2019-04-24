package ec.edu.ups.vista;

import ec.edu.ups.clases.ClienteFijo;
import ec.edu.ups.clases.ClienteOcasional;
import ec.edu.ups.clases.Empleado;
import ec.edu.ups.clases.Jefe;
import ec.edu.ups.controladores.ControladorClienteFijo;
import ec.edu.ups.controladores.ControladorClienteOcasional;
import ec.edu.ups.controladores.ControladorEmpleado;
import ec.edu.ups.controladores.ControladorJefe;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Clase Principal
 *
 * Clase que permite la introduccón de datos
 *
 * @version 1.0
 * @since 2019
 * @author José Ramírez
 */
public class Principal {

    //public void Principal() {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        Scanner doub = new Scanner(System.in);
        int opcionMenuPrincipal;
        int opcionMenuClienteFijo;
        int opcionMenuClienteOcasional;
        int opcionMenuEmpleado;
        int opcionMenuJefe;
        String exitReturn = "r";

        ControladorClienteOcasional controladorCliOc = new ControladorClienteOcasional();
        ControladorClienteFijo controladorCliFi = new ControladorClienteFijo();
        ControladorEmpleado controladorEm = new ControladorEmpleado();
        ControladorJefe controladorJe = new ControladorJefe();

        do {

            System.out.println("<<MENU PRINCIPAL>>");
            System.out.println("1. CRUD Cliente Ocasional (List; ArrayList)");
            System.out.println("2. CRUD Cliente Fijo (Set; HashSet)");
            System.out.println("3. CRUD Empleado (SortedSet; TreeSet)");
            System.out.println("4. CRUD Jefe (Map; TreeMap)");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcionMenuPrincipal = num.nextInt();

            switch (opcionMenuPrincipal) {
                case 1:
                    do {
                        System.out.println(".::MENÚ DEL CLIENTE OCASIONAL::.");
                        System.out.println("1. Crear (Create)");
                        System.out.println("2. Buscar (Read)");
                        System.out.println("3. Actualizar (Update)");
                        System.out.println("4. Eliminar (Delete)");
                        System.out.println("5. Listar (List)");
                        System.out.println("6. Regresar al menú principal");
                        System.out.print("Seleccione una opción: ");
                        opcionMenuClienteOcasional = num.nextInt();
                        switch (opcionMenuClienteOcasional) {
                            case 1:
                                System.out.print("Ingrese el nombre del cliente ocasional: ");
                                String nombre = input.nextLine();
                                System.out.print("Ingrese la cédula del cliente ocasional: ");
                                String cedula = input.nextLine();
                                System.out.print("Ingrese el teléfono del cliente ocasional: ");
                                String telefono = input.nextLine();
                                System.out.print("Ingrese el tipo de pago del cliente ocasional: ");
                                String tipoPago = input.nextLine();
                                System.out.print("Ingrese el descuento hacia el cliente ocasional: ");
                                double desc = doub.nextDouble();
                                System.out.print("Ingrese el tipo de solicitud del cliente ocasional: ");
                                String tipoSoli = input.nextLine();
                                System.out.print("Ingrese la cantidad de solicitudes del cliente ocasional: ");
                                int cantSoli = num.nextInt();
                                System.out.print("Ingrese el pago por servicio del cliente ocasional: ");
                                double pagoServi = doub.nextDouble();
                                System.out.print("Ingrese el cambio recibido hacia el cliente ocasional: ");
                                double cambioReci = doub.nextDouble();
                                System.out.print("Ingrese la calificación por servicio del cliente ocasional: ");
                                String calificaServi = input.nextLine();
                                System.out.print("Ingrese la persona que recomendó al cliente ocasional: ");
                                String recomenPor = input.nextLine();
                                ClienteOcasional cliOca = new ClienteOcasional(pagoServi, cambioReci, calificaServi, recomenPor, tipoPago, desc, tipoSoli, cantSoli, nombre, cedula, telefono);
                                controladorCliOc.create(cliOca);
                                System.out.println("Objeto creado con éxito");
                                break;
                            case 2:
                                System.out.print("Ingrese el código que desea buscar: ");
                                System.out.print(controladorCliOc.read(num.nextInt()));
                                System.out.println("");
                                break;
                            case 3:

                                System.out.print("Ingrese el nombre del cliente ocasional: ");
                                nombre = input.nextLine();
                                System.out.print("Ingrese la cédula del cliente ocasional: ");
                                cedula = input.nextLine();
                                System.out.print("Ingrese el teléfono del cliente ocasional: ");
                                telefono = input.nextLine();
                                System.out.print("Ingrese el tipo de pago del cliente ocasional: ");
                                tipoPago = input.nextLine();
                                System.out.print("Ingrese el descuento hacia el cliente ocasional: ");
                                desc = doub.nextDouble();
                                System.out.print("Ingrese el tipo de solicitud del cliente ocasional: ");
                                tipoSoli = input.nextLine();
                                System.out.print("Ingrese la cantidad de solicitudes del cliente ocasional: ");
                                cantSoli = num.nextInt();
                                System.out.print("Ingrese el pago por servicio del cliente ocasional: ");
                                pagoServi = doub.nextDouble();
                                System.out.print("Ingrese el cambio recibido hacia el cliente ocasional: ");
                                cambioReci = doub.nextDouble();
                                System.out.print("Ingrese la calificación por servicio del cliente ocasional: ");
                                calificaServi = input.nextLine();
                                System.out.print("Ingrese la persona que recomendó al cliente ocasional: ");
                                recomenPor = input.nextLine();
                                cliOca = new ClienteOcasional(pagoServi, cambioReci, calificaServi, recomenPor, tipoPago, desc, tipoSoli, cantSoli, nombre, cedula, telefono);
                                controladorCliOc.update(cliOca);
                                System.out.println("Objeto actualizado con éxito");
                                break;
                            case 4:
                                System.out.print("Ingrese el código del objeto que desee eliminar: ");
                                int cod = num.nextInt();
                                controladorCliOc.delete(cod);
                                System.out.println("Objeto eliminado con éxito");
                                break;
                            case 5:
                                System.out.println("Lista de clientes ocasionales: ");
                                controladorCliOc.list();
                                break;
                            case 6:
                                System.out.println("Regresando al menú principal");
                                break;
                            default:
                                System.out.println("Valor fuera de los parámetros");
                                break;
                        }
                    } while (opcionMenuClienteOcasional != 6);
                    break;
                case 2:

                    do {
                        System.out.println(".::MENÚ DEL CLIENTE FIJO::.");
                        System.out.println("1. Crear (Create)");
                        System.out.println("2. Buscar (Read)");
                        System.out.println("3. Actualizar (Update)");
                        System.out.println("4. Eliminar (Delete)");
                        System.out.println("5. Listar (List)");
                        System.out.println("6. Regresar al menú principal");
                        System.out.print("Seleccione una opción: ");
                        opcionMenuClienteFijo = num.nextInt();
                        switch (opcionMenuClienteFijo) {
                            case 1:
                                System.out.print("Ingrese el nombre del cliente fijo: ");
                                String nombre = input.nextLine();
                                System.out.print("Ingrese la cédula del cliente fijo: ");
                                String cedula = input.nextLine();
                                System.out.print("Ingrese el teléfono del cliente fijo: ");
                                String telefono = input.nextLine();
                                System.out.print("Ingrese el tipo de pago del cliente fijo: ");
                                String tipoPago = input.nextLine();
                                System.out.print("Ingrese el descuento hacia el cliente fijo: ");
                                double desc = doub.nextDouble();
                                System.out.print("Ingrese el tipo de solicitud del cliente fijo: ");
                                String tipoSoli = input.nextLine();
                                System.out.print("Ingrese la cantidad de solicitudes del cliente fijo: ");
                                int cantSoli = num.nextInt();
                                System.out.println("Ingrese la fecha de inicio del cliente fijo: ");
                                System.out.print("Día: ");
                                int dia = num.nextInt();
                                System.out.print("Mes: ");
                                int mes = num.nextInt();
                                System.out.print("Año: ");
                                int anio = num.nextInt();
                                GregorianCalendar fechaIniCli = new GregorianCalendar(anio, (mes + 1), dia);
                                System.out.print("Ingrese el número de créditos del cliente fijo: ");
                                int credit = num.nextInt();
                                System.out.print("Ingrese el número de Orden de compra del cliente fijo ");
                                String ordenCom = input.nextLine();
                                System.out.print("Ingrese la fecha de retiro de mercadería del cliente fijo: ");
                                System.out.print("Día: ");
                                dia = num.nextInt();
                                System.out.print("Mes: ");
                                mes = num.nextInt();
                                System.out.print("Año: ");
                                anio = num.nextInt();
                                GregorianCalendar fechaRetCli = new GregorianCalendar(anio, (mes + 1), dia);
                                ClienteFijo cliFi = new ClienteFijo(fechaIniCli.getTime(), credit, ordenCom, fechaRetCli.getTime(), tipoPago, desc, tipoSoli, cantSoli, nombre, cedula, telefono);
                                controladorCliFi.create(cliFi);
                                System.out.println("Objeto creado con éxito");
                                break;
                            case 2:
                                System.out.print("Ingrese el código del objeto que desea buscar: ");
                                System.out.print(controladorCliFi.read(num.nextInt()));
                                System.out.println("");
                                break;
                            case 3:

                                System.out.print("Ingrese el nombre del cliente fijo: ");
                                nombre = input.nextLine();
                                System.out.print("Ingrese la cédula del cliente fijo: ");
                                cedula = input.nextLine();
                                System.out.print("Ingrese el teléfono del cliente fijo: ");
                                telefono = input.nextLine();
                                System.out.print("Ingrese el tipo de pago del cliente fijo: ");
                                tipoPago = input.nextLine();
                                System.out.print("Ingrese el descuento hacia el cliente fijo: ");
                                desc = doub.nextDouble();
                                System.out.print("Ingrese el tipo de solicitud del cliente fijo: ");
                                tipoSoli = input.nextLine();
                                System.out.print("Ingrese la cantidad de solicitudes del cliente fijo: ");
                                cantSoli = num.nextInt();
                                System.out.println("Ingrese la fecha de inicio del cliente fijo: ");
                                System.out.print("Día: ");
                                dia = num.nextInt();
                                System.out.print("Mes: ");
                                mes = num.nextInt();
                                System.out.print("Año: ");
                                anio = num.nextInt();
                                fechaIniCli = new GregorianCalendar(anio, (mes + 1), dia);
                                System.out.print("Ingrese el número de créditos del cliente fijo: ");
                                credit = num.nextInt();
                                System.out.print("Ingrese el número de Orden de compra del cliente fijo ");
                                ordenCom = input.nextLine();
                                System.out.println("Ingrese la fecha de retiro de mercadería del cliente fijo: ");
                                System.out.print("Día: ");
                                dia = num.nextInt();
                                System.out.print("Mes: ");
                                mes = num.nextInt();
                                System.out.print("Año: ");
                                anio = num.nextInt();
                                fechaRetCli = new GregorianCalendar(anio, (mes + 1), dia);
                                cliFi = new ClienteFijo(fechaIniCli.getTime(), credit, ordenCom, fechaRetCli.getTime(), tipoPago, desc, tipoSoli, cantSoli, nombre, cedula, telefono);
                                controladorCliFi.update(cliFi);
                                System.out.println("Objeto actualizado con éxito");
                                break;
                            case 4:
                                System.out.print("Ingrese el código del objeto que desee eliminar: ");
                                int cod = num.nextInt();
                                controladorCliFi.delete(cod);
                                System.out.println("Objeto eliminado con éxito");
                                break;
                            case 5:
                                System.out.println("Lista de clientes fijos: ");
                                controladorCliFi.list();
                                break;
                            case 6:
                                System.out.println("Regresando al menú principal");
                                break;
                            default:
                                System.out.println("Valor fuera de los parámetros");
                                break;
                        }
                    } while (opcionMenuClienteFijo != 6);
                    break;

                case 3:

                    do {
                        System.out.println(".::MENÚ DEL EMPLEADO::.");
                        System.out.println("1. Crear (Create)");
                        System.out.println("2. Buscar (Read)");
                        System.out.println("3. Actualizar (Update)");
                        System.out.println("4. Eliminar (Delete)");
                        System.out.println("5. Listar (List)");
                        System.out.println("6. Regresar al menú principal");
                        System.out.print("Seleccione una opción: ");
                        opcionMenuEmpleado = num.nextInt();
                        switch (opcionMenuEmpleado) {
                            case 1:
                                System.out.print("Ingrese el nombre del empleado: ");
                                String nombre = input.nextLine();
                                System.out.print("Ingrese la cédula del empleado: ");
                                String cedula = input.nextLine();
                                System.out.print("Ingrese el teléfono del empleado: ");
                                String telefono = input.nextLine();
                                System.out.print("Ingrese el tiempo laboral del empleado: ");
                                String tiemLab = input.nextLine();
                                System.out.print("Ingrese el cargo del empleado: ");
                                String cargo = input.nextLine();
                                System.out.print("Ingrese el salario del empleado: ");
                                double salario = doub.nextDouble();
                                System.out.print("Ingrese el horario laboral del empleado: ");
                                String horLab = input.nextLine();
                                System.out.print("Ingrese la hora de almuerzo del empleado: ");
                                String horAlmu = input.nextLine();
                                System.out.print("Indique si el empleado está afiliado o no: ");
                                String afil = input.nextLine();
                                System.out.println("Ingrese la fecha de contrato del empleado: ");
                                System.out.print("Día: ");
                                int dia = num.nextInt();
                                System.out.print("Mes: ");
                                int mes = num.nextInt();
                                System.out.print("Año: ");
                                int anio = num.nextInt();
                                GregorianCalendar fechaContra = new GregorianCalendar(anio, (mes + 1), dia);
                                System.out.print("Ingrese el tipo de empleado que es: ");
                                String tipoEmp = input.nextLine();
                                Empleado emp = new Empleado(horAlmu, afil, fechaContra.getTime(), tipoEmp, tiemLab, cargo, salario, horLab, nombre, cedula, telefono);
                                controladorEm.create(emp);
                                System.out.println("Objeto creado con éxito");
                                break;
                            case 2:
                                System.out.print("Ingrese el código que desea buscar: ");
                                System.out.print(controladorEm.read(num.nextInt()));
                                System.out.println("");
                                break;
                            case 3:
                                System.out.print("Ingrese el nombre del empleado: ");
                                nombre = input.nextLine();
                                System.out.print("Ingrese la cédula del empleado: ");
                                cedula = input.nextLine();
                                System.out.print("Ingrese el teléfono del empleado: ");
                                telefono = input.nextLine();
                                System.out.print("Ingrese el tiempo laboral del empleado: ");
                                tiemLab = input.nextLine();
                                System.out.print("Ingrese el cargo del empleado: ");
                                cargo = input.nextLine();
                                System.out.print("Ingrese el salario del empleado: ");
                                salario = doub.nextDouble();
                                System.out.print("Ingrese el horario laboral del empleado: ");
                                horLab = input.nextLine();
                                System.out.print("Ingrese la hora de almuerzo del empleado: ");
                                horAlmu = input.nextLine();
                                System.out.print("Indique si el empleado está afiliado o no: ");
                                afil = input.nextLine();
                                System.out.println("Ingrese la fecha de contrato del empleado: ");
                                System.out.print("Día: ");
                                dia = num.nextInt();
                                System.out.print("Mes: ");
                                mes = num.nextInt();
                                System.out.print("Año: ");
                                anio = num.nextInt();
                                fechaContra = new GregorianCalendar(anio, (mes + 1), dia);
                                System.out.print("Ingrese el tipo de empleado que es: ");
                                tipoEmp = input.nextLine();
                                emp = new Empleado(horAlmu, afil, fechaContra.getTime(), tipoEmp, tiemLab, cargo, salario, horLab, nombre, cedula, telefono);
                                controladorEm.update(emp);
                                System.out.println("Objeto actualizado con éxito");
                                break;
                            case 4:
                                System.out.print("Ingrese el código del objeto que desee eliminar: ");
                                int cod = num.nextInt();
                                controladorEm.delete(cod);
                                System.out.println("Objeto eliminado con éxito");
                                break;
                            case 5:
                                System.out.println("Lista de empleados: ");
                                controladorEm.list();
                                break;
                            case 6:
                                System.out.println("Regresando al menú principal");
                                break;
                            default:
                                System.out.println("Valor fuera de los parámetros");
                                break;
                        }
                    } while (opcionMenuEmpleado != 6);
                    break;

                case 4:

                    do {
                        System.out.println(".::MENÚ DEL JEFE::.");
                        System.out.println("1. Crear (Create)");
                        System.out.println("2. Buscar (Read)");
                        System.out.println("3. Actualizar (Update)");
                        System.out.println("4. Eliminar (Delete)");
                        System.out.println("5. Listar (List)");
                        System.out.println("6. Regresar al menú principal");
                        System.out.print("Seleccione una opción: ");
                        opcionMenuJefe = num.nextInt();
                        switch (opcionMenuJefe) {
                            case 1:
                                System.out.print("Ingrese el nombre del jefe: ");
                                String nombre = input.nextLine();
                                System.out.print("Ingrese la cédula del jefe: ");
                                String cedula = input.nextLine();
                                System.out.print("Ingrese el teléfono del jefe: ");
                                String telefono = input.nextLine();
                                System.out.print("Ingrese el tiempo laboral del jefe: ");
                                String tiemLab = input.nextLine();
                                System.out.print("Ingrese el cargo del jefe: ");
                                String cargo = input.nextLine();
                                System.out.print("Ingrese el salario del jefe: ");
                                double salario = doub.nextDouble();
                                System.out.print("Ingrese el horario laboral del jefe: ");
                                String horLab = input.nextLine();
                                System.out.print("Ingrese la fecha en la que el jefe empezó su empresa: ");
                                System.out.print("Día: ");
                                int dia = num.nextInt();
                                System.out.print("Mes: ");
                                int mes = num.nextInt();
                                System.out.print("Año: ");
                                int anio = num.nextInt();
                                GregorianCalendar fechaIniEmp = new GregorianCalendar(anio, (mes + 1), dia);
                                System.out.print("Indique el día que paga el jefe a los empleados: ");
                                String diaPago = input.nextLine();
                                System.out.println("Ingrese la cantidad de socios del jefe: ");
                                int cantSoc = num.nextInt();
                                System.out.print("Ingrese los fondos de la empresa: ");
                                double fondEmp = doub.nextDouble();
                                Jefe jef = new Jefe(fechaIniEmp.getTime(), diaPago, cantSoc, fondEmp, tiemLab, cargo, salario, horLab, nombre, cedula, telefono);
                                controladorJe.create(jef);
                                System.out.println("Objeto creado con éxito");
                                break;
                            case 2:
                                System.out.print("Ingrese el código que desea buscar: ");
                                System.out.print(controladorJe.read(num.nextInt()));
                                System.out.println("");
                                break;
                            case 3:
                                System.out.print("Ingrese el nombre del jefe: ");
                                nombre = input.nextLine();
                                System.out.print("Ingrese la cédula del jefe: ");
                                cedula = input.nextLine();
                                System.out.print("Ingrese el teléfono del jefe: ");
                                telefono = input.nextLine();
                                System.out.print("Ingrese el tiempo laboral del jefe: ");
                                tiemLab = input.nextLine();
                                System.out.print("Ingrese el cargo del jefe: ");
                                cargo = input.nextLine();
                                System.out.print("Ingrese el salario del jefe: ");
                                salario = doub.nextDouble();
                                System.out.print("Ingrese el horario laboral del jefe: ");
                                horLab = input.nextLine();
                                System.out.print("Ingrese la fecha en la que el jefe empezó su empresa: ");
                                System.out.print("Día: ");
                                dia = num.nextInt();
                                System.out.print("Mes: ");
                                mes = num.nextInt();
                                System.out.print("Año: ");
                                anio = num.nextInt();
                                fechaIniEmp = new GregorianCalendar(anio, (mes + 1), dia);
                                System.out.print("Indique el día que paga el jefe a los empleados: ");
                                diaPago = input.nextLine();
                                System.out.println("Ingrese la cantidad de socios del jefe: ");
                                cantSoc = num.nextInt();
                                System.out.print("Ingrese los fondos de la empresa: ");
                                fondEmp = doub.nextDouble();
                                jef = new Jefe(fechaIniEmp.getTime(), diaPago, cantSoc, fondEmp, tiemLab, cargo, salario, horLab, nombre, cedula, telefono);
                                controladorJe.update(jef);
                                System.out.println("Objeto actualizado con éxito");
                                break;
                            case 4:
                                System.out.print("Ingrese el código del objeto que desee eliminar: ");
                                int cod = num.nextInt();
                                controladorJe.delete(cod);
                                System.out.println("Objeto eliminado con éxito");
                                break;
                            case 5:
                                System.out.println("Lista de clientes ocasionales: ");
                                controladorJe.list();
                                break;
                            case 6:
                                System.out.println("Regresando al menú principal");
                                break;
                            default:
                                System.out.println("Valor fuera de los parámetros");
                                break;
                        }
                    } while (opcionMenuJefe != 6);
                    break;

                case 5:
                    System.out.print("Ingrese [S] para salir, [R] para regresar: ");
                    exitReturn = input.nextLine();
                    break;
                default:
                    System.out.println("Valor fuera de los parámetros indicados");
                    break;
            }
        } while (exitReturn.equalsIgnoreCase("r"));
    }
}
