package Mundialejer4;

//<>
import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* Crear una aplicación que permita realizar el sorteo del mundial. Para ello el
sistema pedirá los nombres de las selecciones de los dos bombos, 5 por bombo.
Una vez introducidos. Mostrar los emparejamientos de los equipos. Ten en cuenta
que un mismo equipo no puede jugar más de un partido
*
*Objetivo: emarejarlos
*/
public class Main {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in); //La funcion que permite la entrada de datos
        //La variables arrays de tipo string.
        String[] bombo1 = new String[5]; //El primer bombo de paises.
        String[] bombo2 = new String[5]; //El segundo bombo de paises.
        //Los bucles:
        for (int i = 0; i < bombo1.length; i++) { //El bucle del primer bombo de 5 huecos marcado por los arrays.
            System.out.println("Equipos del primer bombo: "); //La interfaz de la entrada de datos del primer bombo.
            bombo1[i] = entradaDatos.nextLine(); //La entrada de datos del primer bombo.
        }
        for (int i = 0; i < bombo2.length; i++) { //El bucle del segundo bombo de 5 huecos marcado por los arrays.
            System.out.println("Equipos del Segundo bombo: "); //La interfaz de la entrada de datos del segundo bombo.
            bombo2[i] = entradaDatos.nextLine(); //La entrada de datos del segundo bombo.
        }
        //Resultados:
        System.out.println("Los equipos del primer bombo: "+Arrays.toString(bombo1));
        System.out.println("Los equipos del segundo bombo: "+Arrays.toString(bombo2));

        //Resultados del Emparejamiento:
        for (int i = 0; i < bombo1.length; i++) {
            System.out.println("emparejamiento: "+bombo1[i]+ "-" +bombo2[i]);
        }
    }
}