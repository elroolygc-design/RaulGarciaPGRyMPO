package ejercicio;


import java.util.ArrayList;

public class Carrera {
    public ArrayList<Coche> listaCorredores = new ArrayList<Coche>();
    public int kmCarrera;
    public Coche ganador=null;

    public Carrera(ArrayList<Coche> listaCorredores, int kmCarrera, Coche ganador) {
        this.listaCorredores = listaCorredores;
        this.kmCarrera=kmCarrera;
        this.ganador=ganador;
    }

    public ArrayList<Coche> getListaCorredores() {
        return listaCorredores;
    }

    public void setListaCorredores(ArrayList<Coche> listaCorredores) {
        this.listaCorredores = listaCorredores;
    }

    public int getKmCarrera() {
        return kmCarrera;
    }

    public void setKmCarrera(int kmCarrera) {
        this.kmCarrera = kmCarrera;
    }

    public Coche getGanador() {
        return ganador;
    }

    public void setGanador(Coche ganador) {
        this.ganador = ganador;
    }
}



