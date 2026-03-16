package Model;

public abstract class Persona {
    //Variables privadas por abstracción.
    private String tipo;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    //Contructor vacio de Persona para que no de error.
    public Persona () {
    }
    //Contructor principal de Persona.
    public Persona (String tipo, String nombre, String apellido1, String apellido2, String dni) {
        this.tipo=tipo;
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.dni=dni;

    }
    //Getter y setter de tipo.
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    //Getter y setter de Dni.
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    //Getter y setter de Apellido2.
    public String getApellido2() {
        return apellido2;
    }
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    //Getter y setter de Apellido1.
    public String getApellido1() {
        return apellido1;
    }
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    //Getter y setter de Nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
