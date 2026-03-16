package Model;

public class Jefe extends Persona {
    private int beneficioM;
    private double accionesJefe;

    public Jefe (String tipo, String nombreT, String apellido1T, String apellido2T, String dni, int beneficioM, double accionesJefe) {
        super(tipo, nombreT, apellido1T, apellido2T, dni);
        this.beneficioM = beneficioM;
        this.accionesJefe = accionesJefe;
    }
    //getter y setter de beneficio.
    public int getBeneficioM() {
        return beneficioM;
    }
    public void setBeneficioM(int beneficioJefe) {
        this.beneficioM = beneficioM;
    }
    //getter y setter de acciones.
    public double getAccionesJefe() {
        return accionesJefe;
    }
    public void setAccionesJefe(double accionesJefe) {
        this.accionesJefe = accionesJefe;
    }
}
