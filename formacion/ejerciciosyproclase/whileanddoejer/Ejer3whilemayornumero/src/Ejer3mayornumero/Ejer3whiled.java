package Ejer3mayornumero;

import java.util.Scanner;
/*
 *
 * Generar números enteros aleatorios entre 0 y 100 hasta obtener el 0.
 * El programa mostrará cada uno de los datos generados
 * y obtendrá el mayor de los números generados. (MayorNumero)
 *
 *  <>

 * */
public class Ejer3whiled {
    public void MayorNumero () {

        //variables fuera del bucle. con lo de la funcion de aleatorio
        int numAleatorio = (int)(Math.random()*100);
        int numMayor = numAleatorio;
        // la funcion principal
        while (numAleatorio != 0 && numAleatorio > 0 && numAleatorio < 100) {
            //lo añadimos el -- y el ++ para saber organizacion de mayor y menor. mañana reorganizar
                numAleatorio = (int)(Math.random()*100);
                numAleatorio--;
                numMayor = numAleatorio++;
        //resultados
                System.out.println("numero alearorio: "+numAleatorio);
                System.out.println("numero alearorio: "+numMayor);
        }
    }
}








