package Model;

import java.util.ArrayList;

public class Empresa {
    public ArrayList<Persona> listTrabajadores=new ArrayList<Persona>();
    public Empresa() {

    }
    public Empresa(ArrayList<Persona> listTrabajadores){
        this.listTrabajadores=listTrabajadores;
    }
    //Getter y Setter de lista de trabajadores.
    public ArrayList<Persona> getListTrabajadores() {
        return listTrabajadores;
    }
    public void setListTrabajadores(String tipo, String nombreT, String apellido1T, String apellido2T, String dni, int sueldoM,
                                    int sueldoA, double accionesJefe, double accionesAccionista, int numeroPagas, int beneficioJefe, int beneficioM) {
        this.listTrabajadores = listTrabajadores;
    }
    public void agregarTrabajador(Persona persona) {
        listTrabajadores.add(persona);
    }

    public boolean hayjefe(){
        for (Persona t : listTrabajadores) {
            if (t.getTipo().equals("Jefe")) {
             return true;
            }
        }
        return false;
    }
    public boolean haydni(String dniB){
        for (Persona t: listTrabajadores){
            if (t.getDni().equals(dniB)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}