package Model;

public class Asalariado extends Persona{
    private int numeroPagas;
    private double sueldoM;
    private double sueldoA;
    private boolean contratado;

    public Asalariado(String tipo, String nombreT, String apellido1T, String apellido2T, String dni, int numeroPagas, double sueldoM, double sueldoA, boolean contratado){
        super(tipo, nombreT, apellido1T, apellido2T, dni);
        this.numeroPagas = numeroPagas;
        this.sueldoM = sueldoM;
        this.sueldoA = sueldoA;
        this.contratado = contratado;
    }
    //setters y getters de numero de pagas
    public int getNumeroPagas() {
        return numeroPagas;
    }
    public void setNumeroPagas(int numeroPagas) {
        this.numeroPagas = numeroPagas;
    }
    //setters y getters de sueldo mensual
    public double getSueldoM() {
        return sueldoM;
    }
    public void setSueldoM(double sueldoM) {
        this.sueldoM = sueldoM;
    }
    //setters y getters de sueldoAnusl
    public double getSueldoA() {
        return sueldoA;
    }
    public void setSueldoA(double sueldoA) {
        this.sueldoA = sueldoA;
    }
    //Setters y getters de contratado
    public boolean getContratado() {
        return contratado;
    }
    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }
}
