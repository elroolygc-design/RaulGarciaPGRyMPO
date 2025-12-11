package model;


import lombok.Data;

@Data

public class Coche {
    private String marca, modelo, bastidor, color;
    private int cv, velocidad;

    // como se hace para poner los datos del coche entre los paréntesis de  "new Coche();"?
    // por defecto, en toda la clase hay un constrctor que se denomina contructor vacio
    // todas las variables de un ovjeto son privadas
    // desaparece implicito cuando escribo otro constructor
    private double precio;


    public Coche(String marca) {
        this.marca = marca;
        //no he puesto mas para pruebas pero se tiene que coincidir con lasvariavles privatede  arriba


    }



    //se puede crrar automaticamente los setters y los getters con click derecho y generate


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}