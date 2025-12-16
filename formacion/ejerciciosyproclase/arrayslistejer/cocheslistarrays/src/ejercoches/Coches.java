package ejercoches;

/* Crea un programa que permita meter una lista de coches, con marca (String), modelo (String),
y caballos (int). Mete tres coches manualmente.
  ```
    Entrada
    Coches:
    Ford Focus 100
    Seat Ibiza 90
    Toyota Corolla 120

    Salida
    Guardados 3 coches
    mañana: los demas arrays, y union
   */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Coches {
    public void Coches () {
        Scanner entradaDatos = new Scanner(System.in); //La función que permite la entrada de datos.
        //Variables arraylist
        ArrayList<String> marcaLista = new ArrayList<String>(); //La lista de la marca.
        ArrayList<String> modeloLista = new ArrayList<String>(); //La lista del modelo.
        ArrayList<Integer> caballosLista = new ArrayList<Integer>(); //La lista de los caballos o cv de cada coche.
        //Los bucles que hacen posible el ejercicio.
        for (int i = 0; i < 3; i++) { //El bucle de 0 a 3 para la marca.
            System.out.println("Indroduce la marca de coche: "); //La interfaz de la entrada de datos de la lista marca.
            marcaLista.add(entradaDatos.nextLine()); //La entrada de datos de la lista marca.
        }
        System.out.println("Las marcas de los coches son: " + marcaLista); //Las marcas de coche.
        for (int i = 0; i < 3; i++) { //El bucle de 0 a 3 para el modelo.
            System.out.println("EL nombre del modelo es: "); //La interfaz de la entrada de datos de la lista modelo.
            modeloLista.add(entradaDatos.nextLine()); //La entrada de datos de la lista modelo.
        }
        System.out.println("Los modelos de los coches son: "+modeloLista); //Los modelos de coche.
        for (int i = 0; i < 3; i++) { //El bucle de 0 a 3 para los cv de cada coche.
            System.out.println("Los caballos son"); //La  interfaz de la entrada de datos de la lista caballos.
            caballosLista.add(entradaDatos.nextInt()); //La entrada de datos de la lista caballos.
        }
        System.out.println("Los cv de los coches son: "+caballosLista); //Los caballos de cada coche.
        for (int i = 0; i < 3; i++) { //El bucle que une las  listas.
            //Resultados.
            System.out.println("El coche: "+marcaLista.get(i)+" |El modelo: "+modeloLista.get(i)+" |Los cv: "+caballosLista.get(i));
        }
    }
}
