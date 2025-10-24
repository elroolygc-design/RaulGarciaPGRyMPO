package ejer3veintemult;

import java.util.Scanner;

//> <
public class Ejer3 {

    public void multiplo() {
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("pon un numero entero: ");
        int numeroEntero = entradaDatos.nextInt();
        int multiplo20 = numeroEntero % 20;
        boolean bool = true;

        if (multiplo20 == 0 && numeroEntero >= -100 && numeroEntero <= 100) {
            System.out.println("SI es multiplo de 20 y SI sta entre -100 y 100");


        } else if (multiplo20 != 0 && numeroEntero >= -100 && numeroEntero <= 100) {
            System.out.println("NO es multiplo de 20 pero SI sta entre -100 y 100");


        } else if (multiplo20 == 0 && bool ==! (numeroEntero >= -100 && numeroEntero <= 100) ){
            System.out.println("SI es multiplo de 20 pero NO esta entre -100 y 100");

        } else {
            System.out.println("NO es multiplo de 20 NI esta entre -100 y 100");

        }

    }
}