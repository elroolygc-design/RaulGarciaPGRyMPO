package ejercicio;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Coche {
   public String marca;
   public String modelo;
   public int km;
   public int puntos;
   public int tiempoTotal;
   public String piloto;
   public int ultimoAvance;
    public int puntosCarrera;

    public Coche (String marca, String modelo, String piloto, int km, int puntos, int tiempoTotal, int ultimoAvance, int puntosCarrera) {
        this.marca=marca;
        this.modelo=modelo;
        this.km=km;
        this.puntos=puntos;
        this.tiempoTotal=tiempoTotal;
        this.piloto=piloto;
        this.ultimoAvance=ultimoAvance;
        this.puntosCarrera=puntosCarrera;
    }



        //Getters y Setters.
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
        this.modelo=modelo;
    }

    public int getKm() {
        return km;
    }
    public void setKm(int km) {
        this.km=km;
    }

    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos=puntos;
    }

    public int getTiempoTotal() {
        return tiempoTotal;
    }
    public void setTiempoTotal(int tiempoTotal) {
        this.tiempoTotal=tiempoTotal;
    }

    public String getPiloto() {
        return piloto;
    }
    public void setPiloto(String piloto) {
        this.piloto=piloto;
    }

    public int getUltimoAvance() {
        return ultimoAvance;
    }
    public void setUltimoAvance(int ultimoAvance) {
        this.ultimoAvance=ultimoAvance;
    }

    public int getPuntosCarrera() {
        return puntosCarrera;
    }
    public void setPuntosCarrera(int puntosCarrera) {
        this.puntosCarrera = puntosCarrera;
    }

    @Override
    public String toString() {
        return marca + "|" + modelo + "|" + km;

    }
}
