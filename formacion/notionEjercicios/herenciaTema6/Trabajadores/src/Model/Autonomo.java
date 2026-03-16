package Model;

public class Autonomo extends Persona {
    private double sueldoA;
    private boolean contratado;
    public Autonomo(String tipo, String nombreT, String apellido1T, String apellido2T, String dni, double sueldoA, boolean contratado){
        super(tipo, nombreT, apellido1T, apellido2T, dni);
        this.sueldoA = sueldoA;
        this.contratado=contratado;
    }
    //Getters y setters de sueldoA
    public double getSueldoA() {
        return sueldoA;
    }
    public void setSueldoA(double sueldoA) {
        this.sueldoA = sueldoA;
    }
    //Getters y setters de contratado
    public boolean isContratado() {
        return contratado;
    }
    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }
}
