package ejercicio;

import java.util.ArrayList;

public class Campeonato {
    public int numCarreras;
    public ArrayList<Coche> listaCam = new ArrayList<Coche>();

    public Campeonato (int numCarreras, ArrayList<Coche> listaCam) {
        this.numCarreras=numCarreras;

        this.listaCam=listaCam;
    }
        //Getters y Setters
    public int getNumCarreras() {
        return numCarreras;
    }
    public void setNumCarreras(int numCarreras) {
        this.numCarreras = numCarreras;
    }

    public ArrayList<Coche> getListaCam() {
        return listaCam;
    }
    public void setListaCam(ArrayList<Coche> listaCam) {
        this.listaCam = listaCam;
    }
}
