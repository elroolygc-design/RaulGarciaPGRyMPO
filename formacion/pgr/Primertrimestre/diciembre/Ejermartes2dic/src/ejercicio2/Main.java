package ejercicio2;

import java.util.Scanner;

public class Main {
    /*
    * Crea un array de 10 posiciones y rellénalo con números aleatorios entre el 1
      y el 20, pudiendo repetirse. Una vez rellenado, crear un menú para que el usuario
      seleccione la acción que quiere realizar:

        a. Imprimir array
        b. Mover a izquierda
        c. Mover a derecha
         d. Invertir */

    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        int [] numeros = new int[10];
        int menu = entradaDatos.nextInt();
        for (int i = 0; i < numeros.length ; i++) {
            int aleatorio = (int)(Math.random()*20)+1;
            numeros[i]=aleatorio;


        }


    }

}
