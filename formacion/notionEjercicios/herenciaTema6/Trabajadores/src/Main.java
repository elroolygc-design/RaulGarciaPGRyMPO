import Model.*;
import java.util.ArrayList;
import java.util.Scanner;
/*
*<Notas a mejorar el codigo en el futuro: lisDniInListar>
*  */
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("=====FACTURACION MENSUAL====");
        System.out.println("Inicia con la facturacion mensual de la empresa: ");
        int facturacionM = entrada.nextInt();
        entrada.nextLine();
        while (facturacionM < 45000 || facturacionM > 150000) {
            System.out.println("Solo ingresos entre 45 mil y 150 mil | Vuelve a poner la facturacion mensual de la empresa: ");
            facturacionM = entrada.nextInt();
            entrada.nextLine();
        }
        System.out.println("=== VAMOS A COMENZAR CON LA APLICACION DE REGISTRO ===");
        //Variables de los datos personales.
        String nombreT = "";
        String apellido1T = "";
        String apellido2T = "";
        String dni = "";
        String tipo = "";
        //Variables de los datos profesionales.
        boolean contratado=true;
        int contratadoEscritura;
        double sueldoM;
        double sueldoA;
        int numeroPagas = 12;
        double accionesJefe;
        double accionesAccionista;
        //Variables funcionales.
        boolean delMenu = true;
        int beneficioM;
        int menu;
        String listarResultados;
        boolean resultadosListar=true;
        String mostrarResultados;
        boolean resultadosMostrar=true;
        boolean porsiacasoDespedir=true;
        Empresa empresa=new Empresa();
        //Menu.
        while (delMenu) {
            System.out.println("=====MENÚ GENERAL====");
            System.out.println("1-Registrar");
            System.out.println("2-Listar");
            System.out.println("3-Mostrar");
            System.out.println("4-Despedir");
            System.out.println("5-Salir");
            System.out.println("Introduce el número de la elección que quieras: ");
            menu = entrada.nextInt();
            entrada.nextLine();
            while (menu!=1&&menu!=2&&menu!=3&&menu!=4) {
                System.out.println("No puedes nada que no sean los números válidos | Introduce el número asignado: ");
                menu = entrada.nextInt();
                entrada.nextLine();
            }
            switch (menu) {
            case 1: //Registro de trabajadores.
                System.out.println("=====REGISTRO DE TIPO DE TRABAJADOR====");
                System.out.println("| Jefe");
                System.out.println("| Autónomo");
                System.out.println("| Asalariado");
                System.out.println("| Accionista");
                System.out.println("| Tipo de trabajador: ");
                tipo=entrada.nextLine();
                while (!tipo.equals("Jefe")&&!tipo.equals("Autónomo") && !tipo.equals("Asalariado") && !tipo.equals("Accionista")) {
                    System.out.println("Tipo inválido. Intenta de nuevo:");
                    tipo = entrada.nextLine();
                }
                if (tipo.equals("Jefe") && empresa.hayjefe()) {
                    System.out.println("Ya existe un jefe.");
                    break; // volver al menú
                }
                System.out.println("Tu Nombre: ");
                nombreT = entrada.nextLine();
                System.out.println("Tu primer Apellido: ");
                apellido1T = entrada.nextLine();
                System.out.println("Tu segundo Apellido: ");
                apellido2T = entrada.nextLine();
                System.out.println("Tu DNI: ");
                dni = entrada.nextLine();
                //dni.
                while (empresa.haydni(dni)) {
                    System.out.println("Ese DNI ya existe. Introduce otro:");
                    dni = entrada.nextLine();
                }
                //Contratar
                System.out.println("=====CONTRATAR====");
                System.out.println("1-Aceptar");
                System.out.println("2-No aceptar");
                System.out.println("Quieres contratarlo?: ");
                contratadoEscritura=entrada.nextInt();entrada.nextLine();
                while (contratadoEscritura!=1&&contratadoEscritura!=2) {
                    System.out.println("Solo puedes elejir el 1 y el 2 | Elije otra vez: ");
                    contratadoEscritura=entrada.nextInt();entrada.nextLine();
                }
                if (contratadoEscritura==1){
                    System.out.println("Trabajador contratado");
                    contratado=true;
                } else if (contratadoEscritura==2) {
                    System.out.println("---Trabajador no contratado---");
                    contratado=false;

                }
                //lógica.
                sueldoM = facturacionM * 0.09;
                sueldoA = sueldoM * numeroPagas;
                accionesAccionista = facturacionM * 0.20;
                accionesJefe = facturacionM * 0.10;
                beneficioM = (int) (facturacionM - sueldoM - accionesJefe - accionesAccionista);
                Persona persona=null;
                if (tipo.equals("Jefe")) {
                    persona = new Jefe(tipo, nombreT, apellido1T, apellido2T, dni, beneficioM, accionesJefe);
                } else if (tipo.equals("Autónomo")) {
                    persona = new Autonomo(tipo, nombreT, apellido1T, apellido2T, dni, sueldoA, contratado);
                } else if (tipo.equals("Asalariado")) {
                    persona = new Asalariado(tipo, nombreT, apellido1T, apellido2T, dni, numeroPagas, sueldoM, sueldoA,  contratado);
                } else if (tipo.equals("Accionista")) {
                    persona = new Accionista(tipo, nombreT, apellido1T, apellido2T, dni, accionesAccionista);
                }
                //Guardar en la lista de empresa de tipo persona
                empresa.agregarTrabajador(persona);
                break;
            case 2: //Listar.
                System.out.println("=====LISTAR====");
                System.out.println("1-Jefe.");
                System.out.println("2-Asalariado.");
                System.out.println("3-Autónomo.");
                System.out.println("4-Accionista.");
                System.out.println("Introduce el número de la elección que quieras: ");
                listarResultados=entrada.nextLine();
                while (!listarResultados.equals("1")&&!listarResultados.equals("2")&&!listarResultados.equals("3")&&!listarResultados.equals("4")) {
                    System.out.println("Dato invalido | Elije otra vez e los 3 numeros: ");
                    listarResultados=entrada.nextLine();
                }
                //Forma antigua de castear con el "Jefe" sin el nombre conexion para tener los datos de la superclase solamente.
                //Para objtener los datos unicos de la subclse seria necesario hacer un casteo: "Jefe jefe = (Jefe) persona1;" dentro del if.
                for (Persona persona1 : empresa.getListTrabajadores()) {
                    if (listarResultados.equals("1")&&persona1 instanceof Jefe) {
                        System.out.println("Jefe:| Nombre: "+persona1.getNombre()+"| DNI: "+persona1.getDni()+ "| Tipo: "+persona1.getTipo());
                    } else {
                        System.out.println("No hay Jefe");
                    }
                    if (listarResultados.equals("2") && persona1 instanceof Asalariado) {
                        System.out.println("Asalariado | Nombre: "+persona1.getNombre()+"| DNI: "+persona1.getDni()+"| Tipo: "+persona1.getTipo());
                    } else {
                        System.out.println("No hay Asalariado");
                    }
                    if (listarResultados.equals("3") && persona1 instanceof Autonomo) {
                        System.out.println("Autónomo | Nombre: "+persona1.getNombre()+" | DNI: "+persona1.getDni()+ "| Tipo: "+persona1.getTipo());
                    } else {
                        System.out.println("No hay Autónomo");
                    }
                    if (listarResultados.equals("4") && persona1 instanceof Accionista) {
                        System.out.println("Accionista | Nombre: "+persona1.getNombre()+" | DNI: "+persona1.getDni()+ "| Tipo: "+persona1.getTipo());
                    } else {
                        System.out.println("No hay accionista");
                    }
                }
                break;
            case 3: //Mostrar datos.
                System.out.println("=====MOSTRAR DATOS=====");
                System.out.println("Introduce el DNI del trabajador:");
                String dniBuscar = entrada.nextLine();
                Persona encontrado = null;
                //es "null" y no "new persona" porque Persona es abstracta y no quieres crear nada.
                // Buscar trabajador por DNI
                for (Persona persona1 : empresa.getListTrabajadores()) {
                    if (persona1.getDni().equals(dniBuscar)) {
                        encontrado = persona1;
                        break;
                    }
                }
                if (encontrado == null) {
                    System.out.println("No existe un trabajador con ese DNI.");
                    break;
                }
                // Mostrar según el tipo.
                // instanceof Jefe jefe = forma moderna de castear automáticamente para tener los datos de la superclase y la subclase.
                if (encontrado instanceof Jefe jefe) {
                    System.out.println("Nombre: "+jefe.getNombre()+
                            "| Apellido: "+jefe.getApellido1()+
                            "| DNI: "+jefe.getDni()+
                            "| Acciones: "+jefe.getAccionesJefe()+
                            "| Beneficio: "+jefe.getBeneficioM());
                } else if (encontrado instanceof Asalariado asalariado) {
                    System.out.println("Nombre: "+asalariado.getNombre()+
                            "| Apellido: "+asalariado.getApellido1()+
                            "| DNI: "+asalariado.getDni()+
                            "| Salario Anual: "+asalariado.getSueldoA()+
                            "| Salario Mensual: "+asalariado.getSueldoM()+
                            "| Número de Pagas: "+asalariado.getNumeroPagas());
                } else if (encontrado instanceof Autonomo autonomo) {
                    System.out.println("Nombre: "+autonomo.getNombre()+
                            "| Apellido: " +autonomo.getApellido1()+
                            "| DNI: "+autonomo.getDni()+
                            "| Salario Anual: "+autonomo.getSueldoA());
                } else if (encontrado instanceof Accionista accionista) {
                    System.out.println("Nombre: "+accionista.getNombre()+
                            "| Apellido: "+accionista.getApellido1()+
                            "| DNI: "+accionista.getDni()+
                            "| Acciones: "+accionista.getAccionesAccionista());
                }
                break;
            case 4: //Despedir trabajador.
                System.out.println("=====DESPEDIR TRABAJADOR=====");
                // Solo un jefe puede despedir
                if (!empresa.hayjefe()) {
                    System.out.println("No hay jefe en la empresa. No se puede despedir.");
                    break;
                }
                System.out.println("Introduce el DNI del trabajador a despedir:");
                String dniDespedir = entrada.nextLine();
                Persona borrar = null;
                //Variables distintas (encontrado, borrar) = cada una para su caso, no se mezclan.
                // Buscar trabajador por DNI
                for (Persona persona1 : empresa.getListTrabajadores()) {
                    if (persona1.getDni().equals(dniDespedir)) {
                        borrar = persona1;
                        break;
                    }
                }
                if (borrar==null) { //Porque "null" significa: "null = no encontrado todavía, ningún trabajador con ese DNI.”
                    System.out.println("No existe un trabajador con ese DNI.");
                    break;
                }
                empresa.getListTrabajadores().remove(borrar); //remove() = elimina el trabajador real de la lista.
                System.out.println("Trabajador despedido correctamente.");
                break;
            case 5: //Salir.
                System.out.println("Saliendo del programa...");
                delMenu = false;
                break;
            }
        }
    }
}