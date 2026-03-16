//<>.
import controller.CampeonatoController;
import controller.CarreraController;
import ejercicio.Campeonato;
import ejercicio.Carrera;
import ejercicio.Coche;

import java.util.ArrayList;
import java.util.Scanner;
// plan de carrera: , y carrera.

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //El numero de corredores(coche)
        int numeroCoche=0;
        boolean valido=true;
        while (valido){
            try {
                System.out.println("Añade el numero de coches corredores: ");
                numeroCoche=Integer.parseInt(entrada.nextLine());
                if (numeroCoche<3) {
                   System.out.println("Acción Denegada | Como mínimo 3 coches.");
                } else if (numeroCoche>9) {
                    System.out.println("Acción Denegada | Como máximo 9 coches.");
                } else {
                    valido = false;
                }
            } catch (Exception e) {
                System.out.println("Operación errónea | Porfavor introduce números entre el 3 y el 9 porfavor.");
            }
        }
        //Inicialización de las variables de la marca, el modelo, y los km del coche.
        String marcaCoche;
        String modeloCoche;
        String piloto;
        int km;
        int puntos=0;
        int tiempoTotal=0;
        //La lista de los coches para que se guarden.
        ArrayList<Coche> cochesLista = new ArrayList<Coche>();
        //la funcion para determinar que coches van a participar del numero de corredores.
        for (int i = 0; i < numeroCoche; i++) {
            System.out.println("El nombre del piloto: ");
            piloto=entrada.nextLine();
            System.out.println("La marca del coche: ");
            marcaCoche=entrada.nextLine();
            System.out.println("El modelo del coche: ");
            modeloCoche=entrada.nextLine();
            System.out.println("Los km del coche: ");
            km=entrada.nextInt();entrada.nextLine();
            System.out.println("El corredor: "+piloto+" | "+marcaCoche+" | "+modeloCoche+" | "+km);
            Coche coche = new Coche(marcaCoche, modeloCoche, piloto, km, puntos, tiempoTotal, 0, 0);
            cochesLista.add(coche);
        }
        for (Coche cochesTotal: cochesLista) { //La función para mostrar los datos de los coches.
            System.out.println("Todos los corredores: "+cochesTotal);
        }


        //Campeonato.
        int numeroCarerras=0;
        boolean validarnumCarreras=true;

        while (validarnumCarreras) {
            try {
                System.out.println("El numero de Carreras: ");
                numeroCarerras=Integer.valueOf(entrada.nextInt());
                if (numeroCarerras>8){
                    System.out.println("Acción denegada | Solo puedes 8 carreras como máximo");
                } else if (numeroCarerras<3) {
                    System.out.println("Acción Denegada |Solo puedes 3 carreras como mínimo");
                } else {
                    validarnumCarreras = false;
                }
            } catch (Exception e) {
                System.out.println("Accioón denegada | Solo puedes poner entre 3 y 8 carreras");
            }
        }
        Campeonato campeonato = new Campeonato(numeroCarerras, cochesLista);

        //La lógica de carrera.
        int puntuacion = 0;
        CarreraController carreracontroller = new CarreraController(puntuacion);
        //La lógica de campeonato.
        CampeonatoController campeonatocontroller = new CampeonatoController(campeonato, carreracontroller);
        campeonatocontroller.iniciarCampeonato();

    }
}
