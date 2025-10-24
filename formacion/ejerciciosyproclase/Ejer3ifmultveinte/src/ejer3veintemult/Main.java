package ejer3veintemult;

import java.util.Scanner;

/*
*  1. Declarar una variable entera, la entrada del dato, el main como gestor.
*  2. Se comprobara que ese numero sea o no multiplo de 20.
*  3. Se comprobara si esta o no entre -100 y 100.
*  4. Para el resultado debe de tener estas oraciones.
*       1. “Es múltiplo de 20 y está entre -100 y 100”.
        2. “Es múltiplo de 20 y no está entre -100 y 100”.
        3. “No es múltiplo de 20 y está entre -100 y 100”-
        4. “No es múltiplo de 20 y no está entre -100 y 100”.
*       * Un número es múltiplo de otro cuando su resto es igual a 0
*
* */
public class Main {
    public static void main(String[] args) {
        Ejer3 ejer3 = new Ejer3();
        ejer3.multiplo();
        Scanner entradaDatos = new Scanner(System.in);
        int numeroEntero = entradaDatos.nextInt();

    }
}