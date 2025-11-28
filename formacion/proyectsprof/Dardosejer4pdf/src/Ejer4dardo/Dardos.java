package Ejer4dardo;

import java.util.Scanner;

/*
*
* 4. Crea un programa para jugar una partida virtual de dardos entre dos
jugadores. El objetivo es que uno de los jugadores llegue exactamente a 0 puntos
partiendo desde 301.
*
  Reglas:
• Cada jugador comienza con 301 puntos:  v y for
*
• En cada turno, un jugador lanza 3 dardos. Cada dardo genera un número
  aleatorio entre 0 y 60 (simulando puntuación en dardos).
*
• La puntuación del turno es la suma de los 3 dardos. //
*
• Resta la puntuación del turno al total de puntos del jugador.
*
• Si la puntuación restante es menor que 0, se considera que el jugador "se
  pasa" y su total no cambia ese turno.
*
• El primer jugador que llegue exactamente a 0 gana la partida.
*
• Después de cada turno, muestra las puntuaciones actuales y quién va
  ganando (el que tiene menos puntos): resutados de cada turno con p y quien va ganando
*
• Al finalizar, muestra el ganador y cuántos turnos tomó la partida.
*
*
* <>
* */


public class Dardos {
    public void proyecto () {
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("Introduzca el primer jugador: ");
        String jugadorUno = entradaDatos.nextLine();
        System.out.println("Introduzca el segundo jugador: ");
        String jugadorDos = entradaDatos.nextLine();

        //variables
        int puntuacionInicial=301;

        int puntUno=301;
        int puntDos=301;
        int sumaIntentos1=0;
        int sumaIntentos2=0;
        int resta1=0;
        int resta2 =0;

        //bucle de los turnos.
        for (int turno = 1; turno <= 2; turno++) {
            //bucle de los dardos.
            for (int dardosIntentos = 1; dardosIntentos <= 3; dardosIntentos++) {
                //funcion para los numeros aleatorios.
                puntUno = (int) (Math.random() * 60);
                puntDos = (int) (Math.random() * 60);
                // Operacion la suma de los resultados de los 3 dardos.
                sumaIntentos1=sumaIntentos1+puntUno;
                sumaIntentos2=sumaIntentos2+puntDos;
                //Operacion de la resta.
                resta1=puntuacionInicial-sumaIntentos1;
                resta2=puntuacionInicial-sumaIntentos2;


                //Resultado de la puntuacion
                System.out.println("La puntuacion del primer jugador es: " +puntUno);
                System.out.println("La puntuacion del segundo jugador es: " +puntDos);

                System.out.println("Dardo numero: " +dardosIntentos);  //Dardos
            }
            System.out.println(" puntuacion de los intentos: "+sumaIntentos1);//sumatorio de los tres intentos del jugadpr 1.
            System.out.println(" puntuacion de los intentos: "+sumaIntentos2); // sumatrio de los tres dardos del sjugador 2.
            System.out.println("Turno numero: " +turno); //turnos
        }
        System.out.println("La puntuacion total es: "+resta1); //puntuacion total del primer jugador
        System.out.println("La puntuacion total es: "+resta2); // puntuacion total del segundo jugadpr


        //Ganador: El Número de la puntuación más pequeña gana la partida.
        if (resta1<resta2) {
            System.out.println("El ganador es: "+jugadorUno);
        } else if (resta2<resta1){
            System.out.println("El ganador es: "+jugadorDos);
        } else {
            System.out.println("Fuera del sistema");
        }
    }
}