package Model;

public class Accionista extends Persona{
    private double accionesAccionista;
    public Accionista(String tipo, String nombreT, String apellido1T, String apellido2T, String dni, double accionesAccionista){
        super(tipo, nombreT, apellido1T, apellido2T, dni);
        this.accionesAccionista = accionesAccionista;
    }
    //setters y getters de acciones
    public double getAccionesAccionista() {
        return accionesAccionista;
    }
    public void setAccionesAccionista(double accionesAccionista) {
        this.accionesAccionista = accionesAccionista;
    }
}
